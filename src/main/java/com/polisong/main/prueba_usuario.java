
package com.polisong.main;

import com.polisong.controller.UsuarioController;
import com.polisong.model.Usuario;


public class prueba_usuario {
    
    public static void main(String[] args) {
   /*
     //---------------------------------------------registrar usuario------------------------------------------------------   
        Usuario usuario = new Usuario(
            "juan",                
            "López",                 
            "juan@example.com",    
            "Clav1111123333",              
            "cliente",               
            "2025-10-18"             
        );

        // Envía sus datos al controller 
        UsuarioController controller = new UsuarioController();

        boolean resultado = controller.registrarUsuario(
            usuario.getNombre(),
            usuario.getApellido(),
            usuario.getCorreo(),
            usuario.getContrasena(),
            usuario.getRol()
        );

        if (resultado) {
            System.out.println(" Registro de usuario exitoso.");
        } else {
            System.out.println(" No se pudo registrar el usuario.");
        }   
     */
       
   
     /*  
     //-----------------------------------------------eliminar usuario--------------------------------------
    // El administrador define qué usuario eliminar
        int idUsuario = 1; 

        // Envías la solicitud al controller
        UsuarioController controller = new UsuarioController();

        boolean resultado = controller.eliminarUsuario(idUsuario);

        if (resultado) {
            System.out.println("Eliminación de usuario exitosa.");
        } else {
            System.out.println("No se pudo eliminar el usuario.");
        }
     */

     /*
      //---------------------------------------------consultar usuario---------------------------------------------
      //UsuarioController controller = new UsuarioController();

        // Consultar un usuario existente
        int id_usuario = 3;
        String resultado = controller.consultarUsuario(id_usuario);
        System.out.println(resultado);

        // Consultar un usuario inexistente
        int idInexistente = 99;
        String resultado2 = controller.consultarUsuario(idInexistente);
        System.out.println(resultado2);
      */
      
        
     /* 
       //-------------------------------------------autenticar usuario------------------------------
       //UsuarioController controller = new UsuarioController();
       
       // Prueba 1: Credenciales correctas
       String resultado1 = controller.autenticarUsuario("camilo@example.com","Clave123");
       System.out.println(resultado1);

        // Prueba 2: Contraseña incorrecta
        String resultado2 = controller.autenticarUsuario("camilo@example.com", "incorrecta");
        System.out.println(resultado2);

        // Prueba 3: Campos vacíos
        String resultado3 = controller.autenticarUsuario("", "");
        System.out.println(resultado3);
     */

    }  
  }





