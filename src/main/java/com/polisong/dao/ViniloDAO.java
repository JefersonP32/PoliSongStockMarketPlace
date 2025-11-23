package com.polisong.dao;

import com.polisong.model.Vinilo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class ViniloDAO {
    private final String URL = "jdbc:sqlite:src/main/resources/database/polisong.db"; // Cambia por tu ruta o conexión

    public boolean registrarVinilo(Vinilo vinilo) {
        String sql = "INSERT INTO vinilo (nombre, artista, anio_salida, precio, stock, descripcion, id_proveedor) VALUES (?, ?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, vinilo.getNombre());
            ps.setString(2, vinilo.getArtista());
            ps.setInt(3, vinilo.getAnioSalida());
            ps.setDouble(4, vinilo.getPrecio());
            ps.setInt(5, vinilo.getStock());
            ps.setString(6, vinilo.getDescripcion());
            ps.setInt(7, vinilo.getIdProveedor());

            ps.executeUpdate();
            return true;
        } catch (Exception e) {
            System.out.println("Error al registrar vinilo: " + e.getMessage());
            return false;
        }
    }
    
     public Vinilo consultarViniloPorNombre(String nombre) {
        String sql = "SELECT * FROM vinilo WHERE nombre = ?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombre);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Vinilo v = new Vinilo();
                v.setIdVinilo(rs.getInt("id_vinilo"));
                v.setNombre(rs.getString("nombre"));
                v.setArtista(rs.getString("artista"));
                v.setAnioSalida(rs.getInt("anio_salida"));
                v.setPrecio(rs.getDouble("precio"));
                v.setStock(rs.getInt("stock"));
                v.setDescripcion(rs.getString("descripcion"));
                v.setIdProveedor(rs.getInt("id_proveedor"));
                return v;
            }
        } catch (Exception e) {
            System.out.println("Error al consultar vinilo: " + e.getMessage());
        }
        return null; // Si no se encontró
    }
     
     public boolean editarVinilo(Vinilo vinilo) {
    String sql = """
        UPDATE vinilo 
        SET nombre = ?, artista = ?, anio_salida = ?, precio = ?, 
            stock = ?, descripcion = ?, id_proveedor = ?
        WHERE id_vinilo = ?
    """;

    try (Connection conn = DriverManager.getConnection(URL);
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, vinilo.getNombre());
        ps.setString(2, vinilo.getArtista());
        ps.setInt(3, vinilo.getAnioSalida());
        ps.setDouble(4, vinilo.getPrecio());
        ps.setInt(5, vinilo.getStock());
        ps.setString(6, vinilo.getDescripcion());
        ps.setInt(7, vinilo.getIdProveedor());
        ps.setInt(8, vinilo.getIdVinilo());

        int filas = ps.executeUpdate();
        return filas > 0;

    } catch (Exception e) {
        System.out.println("Error al editar vinilo: " + e.getMessage());
        return false;
    }
    
    
    
}
     public boolean eliminarVinilo(int idVinilo) {
    String sql = "DELETE FROM vinilo WHERE id_vinilo = ?";

    try (Connection conn = DriverManager.getConnection(URL);
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setInt(1, idVinilo);
        int filas = ps.executeUpdate();

        return filas > 0; // Devuelve true si se eliminó al menos un registro

    } catch (Exception e) {
        System.out.println("Error al eliminar vinilo: " + e.getMessage());
        return false;
    }
}
     
    
}