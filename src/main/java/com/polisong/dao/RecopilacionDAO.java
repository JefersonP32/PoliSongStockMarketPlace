package com.polisong.dao;

import com.polisong.model.Recopilacion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class RecopilacionDAO {

    public boolean insertarRecopilacion(Recopilacion recop) {
        String sql = "INSERT INTO Recopilacion (nombre, es_publica, id_usuario, Descripcion) VALUES (?, ?, ?, ?)";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, recop.getNombre());
            ps.setInt(2, recop.isEsPublica() ? 1 : 0);
            ps.setInt(3, recop.getIdUsuario());
            ps.setString(4, recop.getDescripcion());

            int filas = ps.executeUpdate();
            return filas > 0;

        } catch (SQLException e) {
            System.err.println("Error al insertar la recopilación: " + e.getMessage());
            return false;
        }
    }
    
    public List<Recopilacion> listarRecopilacionesPorUsuario(int idUsuario) {
        List<Recopilacion> lista = new ArrayList<>();
        String sql = "SELECT id_recopilacion, nombre, Descripcion, es_publica FROM Recopilacion WHERE id_usuario = ?";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Recopilacion r = new Recopilacion(
                    rs.getString("nombre"),
                    rs.getString("Descripcion"),
                    idUsuario,
                    rs.getInt("es_publica") == 1
                );
                r.setIdRecopilacion(rs.getInt("id_recopilacion"));
                lista.add(r);
            }

        } catch (SQLException e) {
            System.err.println("Error al listar recopilaciones: " + e.getMessage());
        }

        return lista;
    }
    
    public boolean editarRecopilacion(Recopilacion recop) {
    String sql = "UPDATE Recopilacion SET nombre = ?, Descripcion = ?, es_publica = ? WHERE id_recopilacion = ?";

    try (Connection conn = Conexion.getConexion();
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, recop.getNombre());
        ps.setString(2, recop.getDescripcion());
        ps.setInt(3, recop.isEsPublica() ? 1 : 0);
        ps.setInt(4, recop.getIdRecopilacion()); // ID de la recopilación a modificar

        int filas = ps.executeUpdate();
        return filas > 0;

    } catch (SQLException e) {
        System.err.println("Error al editar la recopilación: " + e.getMessage());
        return false;
    }
}

    
    
    
    
    
    
    
    public boolean eliminarRecopilacion(int idRecopilacion) {
        String sql = "DELETE FROM Recopilacion WHERE id_recopilacion = ?";

        try (Connection conn = Conexion.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idRecopilacion);
            int filas = ps.executeUpdate();

            return filas > 0;

        } catch (SQLException e) {
            System.err.println("Error al eliminar la recopilación: " + e.getMessage());
            return false;
        }
    }
    
    
    
    
}
