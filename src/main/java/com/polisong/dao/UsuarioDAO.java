
package com.polisong.dao;


import com.polisong.model.Usuario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UsuarioDAO {
    
     private final String URL = "jdbc:sqlite:src/main/resources/database/polisong.db"; // Cambia por tu ruta o conexión
    

     public boolean registrarUsuario(Usuario usuario) {
        String sql = "INSERT INTO usuario (nombre, apellido, correo, contrasena, rol, fecha_registro) VALUES (?, ?, ?, ?, ?, ?)";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, usuario.getNombre());
            ps.setString(2, usuario.getApellido());
            ps.setString(3, usuario.getCorreo());
            ps.setString(4, usuario.getContrasena());
            ps.setString(5, usuario.getRol());
            ps.setString(6, usuario.getFechaRegistro());

            ps.executeUpdate();
            return true;

        } catch (Exception e) {
            System.out.println("Error al registrar usuario: " + e.getMessage());
            return false;
        }
     }
     
      public boolean eliminarUsuario(int idUsuario) {
        String sql = "DELETE FROM usuario WHERE id_usuario = ?";
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);

            int filasAfectadas = ps.executeUpdate();
            return filasAfectadas > 0;

        } catch (Exception e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
            return false;
        }
    }
     
      public Usuario consultarUsuarioPorId(int idUsuario) {
        String sql = "SELECT * FROM usuario WHERE id_usuario = ?";
        
        try (Connection conn = DriverManager.getConnection(URL);
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setInt(1, idUsuario);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs.getInt("id_usuario"));
                u.setNombre(rs.getString("nombre"));
                u.setApellido(rs.getString("apellido"));
                u.setCorreo(rs.getString("correo"));
                u.setContrasena(rs.getString("contrasena"));
                u.setRol(rs.getString("rol"));
                return u;
            }

        } catch (Exception e) {
            System.out.println("Error al consultar usuario: " + e.getMessage());
        }
        return null;
    }
      
     
      
         
      public Usuario autenticarUsuario(String correo, String contrasena) {
        String sqlCorreo = "SELECT * FROM usuario WHERE correo = ?";
        String sqlLogin = "SELECT * FROM usuario WHERE correo = ? AND contrasena = ?";

        try (Connection conn = DriverManager.getConnection(URL);
                
            PreparedStatement ps = conn.prepareStatement(sqlCorreo)) {
            ps.setString(1, correo);
            ResultSet rs = ps.executeQuery();
                    if (!rs.next()) {
            // El correo NO existe
            return null;
        }
            PreparedStatement ps2 = conn.prepareStatement(sqlLogin);
            ps2.setString(1, correo);
            ps2.setString(2, contrasena);
            ResultSet rs2 = ps2.executeQuery();
                    
                    

            if (rs2.next()) {
                Usuario u = new Usuario();
                u.setIdUsuario(rs2.getInt("id_usuario"));
                u.setNombre(rs2.getString("nombre"));
                u.setApellido(rs2.getString("apellido"));
                u.setCorreo(rs2.getString("correo"));
                u.setContrasena(rs2.getString("contrasena"));
                u.setRol(rs2.getString("rol"));
                return u;
            }else {
            // El correo existe pero la contraseña es incorrecta
            Usuario incorrecto = new Usuario();
            incorrecto.setCorreo("existe"); // Indicador
            return incorrecto;
        }

        } catch (Exception e) {
            System.out.println("Error al autenticar usuario: " + e.getMessage());
        }
        return null; // Si no se encontró o credenciales incorrectas
    }
      
      public boolean existeCorreo(String correo) {
    String sql = "SELECT 1 FROM usuario WHERE correo = ?";
    
    try (Connection conn = DriverManager.getConnection(URL);
         PreparedStatement ps = conn.prepareStatement(sql)) {

        ps.setString(1, correo);
        ResultSet rs = ps.executeQuery();

        return rs.next(); // true = sí existe

    } catch (SQLException e) {
        System.out.println("Error al verificar correo: " + e.getMessage());
        return false;
    }
}
 
}
