
package com.polisong.model;

import java.util.HashMap;

public class gestorUsuarios {
    private static HashMap<String, Usuario> usuarios = new HashMap<>();
    
    
    public static Usuario usuarioActual;
    
    public static void registrarUsuario(String nombre, String apellido, String correo, String contrasena) {

    String rol = "cliente";
    String fechaRegistro = java.time.LocalDate.now().toString();

    Usuario nuevo = new Usuario(nombre, apellido, correo, contrasena, rol, fechaRegistro);

    usuarios.put(correo, nuevo);
}

    public static Usuario buscarUsuario(String correo) {
        return usuarios.get(correo);
    }
    
    public static void eliminarUsuario(String correo) {
    usuarios.remove(correo);
}
}
