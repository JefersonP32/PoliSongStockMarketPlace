
package com.polisong.controller;


import com.polisong.dao.UsuarioDAO;
import com.polisong.model.Usuario;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class UsuarioController {
    
    private UsuarioDAO usuarioDAO = new UsuarioDAO();

    public boolean registrarUsuario(String nombre, String apellido, String correo, String contrasena, String rol) {

        //  Validar campos vacíos
        if (nombre == null || nombre.isEmpty() ||
            apellido == null || apellido.isEmpty() ||
            correo == null || correo.isEmpty() ||
            contrasena == null || contrasena.isEmpty() ||
            rol == null || rol.isEmpty()) {

            System.out.println(" Error: todos los campos son obligatorios.");
            return false;
        }

        //  Validar formato de correo
        String patronCorreo = "^[\\w.-]+@[\\w.-]+\\.[a-zA-Z]{2,}$";
        if (!Pattern.matches(patronCorreo, correo)) {
            System.out.println(" Error: formato de correo invalido.");
            return false;
        }

        
        if (contrasena.length() < 6) {
            System.out.println(" Error: la contraseña debe tener al menos 6 caracteres.");
            return false;
        }

       
        //  Crear objeto Usuario
        String fechaRegistro = LocalDate.now().toString();
        Usuario usuario = new Usuario(nombre, apellido, correo, contrasena, rol, fechaRegistro);

        //  Registrar usuario en base de datos
        boolean registrado = usuarioDAO.registrarUsuario(usuario);

        if (registrado) {
            System.out.println(" Usuario registrado correctamente.");
        } else {
            System.out.println(" No se pudo registrar el usuario.");
        }

        return registrado;
    }
    
    
    
    public boolean eliminarUsuario(int idUsuario) {
        // Validar que el ID sea válido
        if (idUsuario <= 0) {
            System.out.println("Error: el ID de usuario debe ser mayor que 0.");
            return false;
        }

        // Llamar al DAO para eliminar
        boolean eliminado = usuarioDAO.eliminarUsuario(idUsuario);

        if (eliminado) {
            System.out.println("Usuario eliminado correctamente.");
        } else {
            System.out.println("No se pudo eliminar el usuario (error en base de datos).");
        }

        return eliminado;
    }
    
    public String consultarUsuario(int idUsuario) {
        UsuarioDAO dao = new UsuarioDAO();

        // Validación del ID
        if (idUsuario <= 0) {
            return "Error: el ID del usuario debe ser mayor que cero.";
        }

        Usuario usuario = dao.consultarUsuarioPorId(idUsuario);

        if (usuario != null) {
            return "Usuario encontrado:\n" +
                    "ID: " + usuario.getIdUsuario() + "\n" +
                    "Nombre: " + usuario.getNombre() + "\n" +
                    "Correo: " + usuario.getCorreo() + "\n" +
                    "Rol: " + usuario.getRol();
        } else {
            return "No se encontro ningun usuario con ID " + idUsuario + ".";
        }
    }
    
    
    public Usuario autenticarUsuario(String correo, String contrasena) {
        UsuarioDAO dao = new UsuarioDAO();

    if (correo == null || correo.trim().isEmpty()) {
        System.out.println("Error: el correo no puede estar vacío.");
        return null;
    }

    if (contrasena == null || contrasena.trim().isEmpty()) {
        System.out.println("Error: la contraseña no puede estar vacía.");
        return null;
    }

    // Consulta a la base de datos
    Usuario usuario = dao.autenticarUsuario(correo, contrasena);

    if (usuario != null) {
        System.out.println("Autenticación exitosa: " 
                           + usuario.getNombre() + " (" + usuario.getRol() + ")");
        return usuario;  // IMPORTANTE: retornas el usuario completo
    } else {
        System.out.println("Credenciales incorrectas.");
        return null;
        }
    }
}
