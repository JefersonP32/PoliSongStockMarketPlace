package com.polisong.controller;

import com.polisong.dao.CancionRecopilacionDAO;
import com.polisong.dao.RecopilacionDAO;
import com.polisong.model.CancionRecopilacion;
import com.polisong.model.Recopilacion;

public class RecopilacionController {
    
    private final RecopilacionDAO dao;
    private final CancionRecopilacionDAO cancionRecopDAO;

    public RecopilacionController() {
        this.dao = new RecopilacionDAO();
        this.cancionRecopDAO = new CancionRecopilacionDAO();
    }

    // Crear recopilación
    public boolean crearRecopilacion(String nombre, String descripcion, int idUsuario, boolean esPublica) {
        // Validaciones 
        if (nombre == null || nombre.isBlank()) {
            System.err.println("El nombre no puede estar vacío.");
            return false;
        }

        if (descripcion == null || descripcion.isBlank()) {
            System.err.println("La descripción no puede estar vacía.");
            return false;
        }

        if (idUsuario <= 0) {
            System.err.println("ID de usuario inválido.");
            return false;
        }

        Recopilacion recop = new Recopilacion(nombre, descripcion, idUsuario, esPublica);
        boolean exito = dao.insertarRecopilacion(recop);

        if (exito) {
            System.out.println("Recopilación creada correctamente.");
        } else {
            System.out.println("No se pudo crear la recopilación.");
        }

        return exito;
    }

    // Agregar canción a recopilación
    public boolean agregarCancionARecopilacion(int idRecopilacion, int idCancion) {
        if (idRecopilacion <= 0 || idCancion <= 0) {
            System.err.println("IDs inválidos.");
            return false;
        }

        if (cancionRecopDAO.existeRelacion(idRecopilacion, idCancion)) {
            System.err.println("Esta canción ya está en la recopilación.");
            return false;
        }

        CancionRecopilacion relacion = new CancionRecopilacion(idRecopilacion, idCancion);
        boolean ok = cancionRecopDAO.insertarCancionEnRecopilacion(relacion);

        if (ok) {
            System.out.println("Canción agregada correctamente a la recopilación.");
        } else {
            System.out.println("Error al agregar canción a la recopilación.");
        }

        return ok;
    }
    
    // Listar recopilaciones
    public void listarRecopilaciones(int idUsuario) {
        if (idUsuario <= 0) {
            System.err.println("ID de usuario inválido.");
            return;
        }

        var lista = dao.listarRecopilacionesPorUsuario(idUsuario);
        if (lista.isEmpty()) {
            System.out.println("No se encontraron recopilaciones para este usuario.");
        } else {
            System.out.println("Recopilaciones del usuario " + idUsuario + ":");
            lista.forEach(System.out::println);
        }
    }
    
    public boolean eliminarRecopilacion(int idRecopilacion) {
        if (idRecopilacion <= 0) {
            System.err.println("ID de recopilación inválido.");
            return false;
        }

        boolean exito = dao.eliminarRecopilacion(idRecopilacion);

        if (exito) {
            System.out.println("Recopilación y sus canciones asociadas fueron eliminadas.");
        } else {
            System.out.println("No se pudo eliminar la recopilación puede que no exista.");
        }

        return exito;
    }
}
