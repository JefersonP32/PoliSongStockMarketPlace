package com.polisong.main;

import com.polisong.controller.CancionController;
import com.polisong.model.cancion;
import java.util.List;

public class PruebaCancion {

    public static void main(String[] args) {

        CancionController controller = new CancionController();

        // 1. Visualizar catálogo completo
        System.out.println("=== Catálogo completo de canciones ===");
        List<cancion> catalogo = controller.visualizarCatalogo();
        for (cancion c : catalogo) {
            System.out.println(c.getIdCancion() + " - " + c.getNombre() + " - " + c.getArtista());
        }

        // 2. Ver detalle de una canción (por ID)
        System.out.println("\n=== Detalle de la canción con ID = 1 ===");
        cancion detalle = controller.verDetalleCancion(1);
        if (detalle != null) {
            System.out.println("Nombre: " + detalle.getNombre());
            System.out.println("Artista: " + detalle.getArtista());
            System.out.println("Duración: " + detalle.getDuracion() + " min");
            System.out.println("Calidad: " + detalle.getCalidadKbps() + " Kbps");
            System.out.println("Precio: $" + detalle.getPrecioMp3());
        } else {
            System.out.println("No se encontró la canción con ID 1");
        }

        // 3. Buscar canciones por género
        System.out.println("\n=== Canciones del género con ID = 2 ===");
        List<cancion> porGenero = controller.buscarPorGenero(2);
        if (porGenero.isEmpty()) {
            System.out.println("No se encontraron canciones para ese género.");
        } else {
            for (cancion c : porGenero) {
                System.out.println(c.getNombre() + " - " + c.getArtista());
            }
        }

        // 4.Buscar canciones por nombre (coincidencia parcial)
        System.out.println("\n=== Buscar canciones con nombre que contenga 'Love' ===");
        List<cancion> porNombre = controller.buscarCanciones("Love");
        if (porNombre.isEmpty()) {
            System.out.println("No se encontraron canciones con 'Love' en el nombre.");
        } else {
            for (cancion c : porNombre) {
                System.out.println(c.getNombre() + " - " + c.getArtista());
            }
        }
    }
}