package com.polisong.dao;

import com.polisong.model.cancion;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CancionDAO {

    //  1. Ver detalle de una canción por ID
    public cancion verDetalleCancion(int idCancion) {
        cancion cancion = null;
        String sql = "SELECT * FROM Cancion WHERE id_cancion = ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idCancion);
            ResultSet rs = stmt.executeQuery();

            if (rs.next()) {
                cancion = new cancion(
                    rs.getInt("id_cancion"),
                    rs.getString("nombre"),
                    rs.getString("artista"),
                    rs.getDouble("precio_mp3"),
                    rs.getDouble("duracion"),
                    rs.getDouble("tamano_mb"),
                    rs.getInt("calidad_kbps"),
                    rs.getInt("id_genero")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return cancion;
    }

    //  2. Buscar canciones por género
    public List<cancion> buscarPorGenero(int idGenero) {
        List<cancion> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cancion WHERE id_genero = ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setInt(1, idGenero);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                cancion c = new cancion(
                    rs.getInt("id_cancion"),
                    rs.getString("nombre"),
                    rs.getString("artista"),
                    rs.getDouble("precio_mp3"),
                    rs.getDouble("duracion"),
                    rs.getDouble("tamano_mb"),
                    rs.getInt("calidad_kbps"),
                    rs.getInt("id_genero")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    //  3. Visualizar catálogo completo
    public List<cancion> visualizarCatalogo() {
        List<cancion> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cancion";
        try (Connection conn = Conexion.getConexion();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                cancion c = new cancion(
                    rs.getInt("id_cancion"),
                    rs.getString("nombre"),
                    rs.getString("artista"),
                    rs.getDouble("precio_mp3"),
                    rs.getDouble("duracion"),
                    rs.getDouble("tamano_mb"),
                    rs.getInt("calidad_kbps"),
                    rs.getInt("id_genero")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }

    //  4. Buscar canciones por nombre (coincidencias parciales)
    public List<cancion> buscarCanciones(String nombre) {
        List<cancion> lista = new ArrayList<>();
        String sql = "SELECT * FROM Cancion WHERE nombre LIKE ?";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, "%" + nombre + "%");
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                cancion c = new cancion(
                    rs.getInt("id_cancion"),
                    rs.getString("nombre"),
                    rs.getString("artista"),
                    rs.getDouble("precio_mp3"),
                    rs.getDouble("duracion"),
                    rs.getDouble("tamano_mb"),
                    rs.getInt("calidad_kbps"),
                    rs.getInt("id_genero")
                );
                lista.add(c);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return lista;
    }
}