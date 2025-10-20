package com.polisong.main;

import com.polisong.controller.RecopilacionController;
import com.polisong.model.Recopilacion;

public class PruebaRecopilacion {

    public static void main(String[] args) {
        RecopilacionController manager = new RecopilacionController();

        //probarCrearRecopilacion(manager);
        //probarAgregarCancion(manager);
        //probarListarRecopilaciones(manager);
        //probarEliminarRecopilacion(manager);
    }


    private static void probarCrearRecopilacion(RecopilacionController manager) {
        Recopilacion recop = new Recopilacion(
                "Recopilación Rock Clásico",
                "Colección de canciones de rock de los 80s.",
                1,  // id del usuario comprador
                true // true = pública
        );

        boolean exito = manager.crearRecopilacion(
                recop.getNombre(),
                recop.getDescripcion(),
                recop.getIdUsuario(),
                recop.isEsPublica()
        );

        if (exito) {
            System.out.println("Recopilación creada correctamente.");
        } else {
            System.out.println("Error al crear la recopilación.");
        }
    }

    private static void probarAgregarCancion(RecopilacionController manager) {
        int idRecopilacion = 6; // recopilación existente
        int idCancion = 3;      // canción existente

        boolean exito = manager.agregarCancionARecopilacion(idRecopilacion, idCancion);

        if (exito) {
            System.out.println("Canción agregada correctamente.");
        } else {
            System.out.println("Error al agregar canción.");
        }
    }

    private static void probarListarRecopilaciones(RecopilacionController manager) {
        int idUsuario = 4; // comprador autenticado
        manager.listarRecopilaciones(idUsuario);
    }

    private static void probarEliminarRecopilacion(RecopilacionController manager) {
        int idRecopilacion = 6; // recopilación existente

        boolean exito = manager.eliminarRecopilacion(idRecopilacion);

        if (exito) {
            System.out.println("Recopilación eliminada correctamente.");
        } else {
            System.out.println("No se pudo eliminar la recopilación.");
        }
    }
}
