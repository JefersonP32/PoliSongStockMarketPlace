package com.polisong.controller;

import com.polisong.dao.ViniloDAO;
import com.polisong.model.Vinilo;

public class ViniloController {
    private ViniloDAO dao;

    public ViniloController() {
        dao = new ViniloDAO();
    }

    public String registrarVinilo(String nombre, String artista, int anio, double precio, int stock, String descripcion, int idProveedor) {
        // Validaciones de campos vacíos
        if (nombre == null || nombre.trim().isEmpty()) {
            return "El nombre del vinilo no puede estar vacío.";
        }
        if (artista == null || artista.trim().isEmpty()) {
            return "El nombre del artista no puede estar vacío.";
        }
        if (descripcion == null || descripcion.trim().isEmpty()) {
            return "La descripción no puede estar vacía.";
        }

        // Validaciones numéricas
        if (anio <= 0) {
            return "El año de salida debe ser mayor que 0.";
        }
        if (precio <= 0) {
            return "El precio debe ser mayor que 0.";
        }
        if (stock < 0) {
            return "El stock no puede ser negativo.";
        }
        if (idProveedor <= 0) {
            return "El ID del proveedor debe ser válido (mayor que 0).";
        }

        // Si todas las validaciones son correctas, se registra el vinilo
        Vinilo vinilo = new Vinilo(nombre.trim(), artista.trim(), anio, precio, stock, descripcion.trim(), idProveedor);

        boolean exito = dao.registrarVinilo(vinilo);
        if (exito) {
            return "Vinilo registrado correctamente.";
        } else {
            return "Error al registrar el vinilo en la base de datos.";
        }
    }
    
    
     public String consultarVinilo(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            return "Debe ingresar un nombre para buscar el vinilo.";
        }

        Vinilo v = dao.consultarViniloPorNombre(nombre.trim());
        if (v == null) {
            return "No se encontró un vinilo con ese nombre.";
        }

        // Devolvemos la información formateada
        return "Vinilo encontrado:\n" +
               "ID: " + v.getIdVinilo() + "\n" +
               "Nombre: " + v.getNombre() + "\n" +
               "Artista: " + v.getArtista() + "\n" +
               "Año: " + v.getAnioSalida() + "\n" +
               "Precio: $" + v.getPrecio() + "\n" +
               "Stock: " + v.getStock() + "\n" +
               "Descripción: " + v.getDescripcion() + "\n" +
               "ID Proveedor: " + v.getIdProveedor();
    }
     
     public String editarVinilo(int idVinilo, String nombre, String artista, int anio, double precio, int stock, String descripcion, int idProveedor) {
    // Validaciones
    if (idVinilo <= 0) return "El ID del vinilo no es válido.";
    if (nombre == null || nombre.trim().isEmpty()) return "El nombre del vinilo no puede estar vacío.";
    if (artista == null || artista.trim().isEmpty()) return "El artista no puede estar vacío.";
    if (descripcion == null || descripcion.trim().isEmpty()) return "La descripción no puede estar vacía.";
    if (anio <= 0) return "El año debe ser mayor que 0.";
    if (precio <= 0) return "El precio debe ser mayor que 0.";
    if (stock < 0) return "El stock no puede ser negativo.";
    if (idProveedor <= 0) return "El ID del proveedor no es válido.";

    // Crear objeto actualizado
    Vinilo v = new Vinilo(nombre.trim(), artista.trim(), anio, precio, stock, descripcion.trim(), idProveedor);
    v.setIdVinilo(idVinilo);

    boolean exito = dao.editarVinilo(v);
    return exito ? "Vinilo actualizado correctamente." : "Error al actualizar el vinilo.";
}
     
     public String eliminarVinilo(int idVinilo) {
    if (idVinilo <= 0) {
        return "El ID del vinilo no es válido.";
    }

    boolean exito = dao.eliminarVinilo(idVinilo);
    return exito ? "Vinilo eliminado correctamente." : "No se encontró un vinilo con ese ID o no se pudo eliminar.";
}
}