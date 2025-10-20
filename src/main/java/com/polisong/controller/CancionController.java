package com.polisong.controller;

import com.polisong.dao.CancionDAO;
import com.polisong.model.cancion;
import java.util.List;

public class CancionController {

    private CancionDAO CancionDAO;

    public CancionController() {
        CancionDAO = new CancionDAO();
    }

    // Ver detalle de una canción por su ID
    public cancion verDetalleCancion(int idCancion) {
        return CancionDAO.verDetalleCancion(idCancion);
    }

    // Buscar canciones por género
    public List<cancion> buscarPorGenero(int idGenero) {
        return CancionDAO.buscarPorGenero(idGenero);
    }

    // Visualizar el catálogo completo de canciones
    public List<cancion> visualizarCatalogo() {
        return CancionDAO.visualizarCatalogo();
    }

    // Buscar canciones por nombre (coincidencia parcial)
    public List<cancion> buscarCanciones(String nombre) {
        return CancionDAO.buscarCanciones(nombre);
    }
}
