package com.polisong.dao;

import com.polisong.model.CancionRecopilacion;
import java.sql.*;

public class CancionRecopilacionDAO {

    public boolean insertarCancionEnRecopilacion(CancionRecopilacion relacion) {
        String sql = "INSERT INTO CancionRecopilacion (id_recopilacion, id_cancion) VALUES (?, ?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, relacion.getIdRecopilacion());
            ps.setInt(2, relacion.getIdCancion());
            return ps.executeUpdate() > 0;

        } catch (SQLException e) {
            System.err.println("Error al agregar canción a la recopilación: " + e.getMessage());
            return false;
        }
    }

    public boolean existeRelacion(int idRecopilacion, int idCancion) {
        String sql = "SELECT 1 FROM CancionRecopilacion WHERE id_recopilacion = ? AND id_cancion = ? LIMIT 1";
        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, idRecopilacion);
            ps.setInt(2, idCancion);
            return ps.executeQuery().next();
        } catch (SQLException e) {
            System.err.println("Error al comprobar duplicado: " + e.getMessage());
            return false;
        }
    }
}
