
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.polisong.main;

import com.polisong.controller.ViniloController;
import com.polisong.model.Vinilo;

/**
 *
 * @author Santi
 */
public class PruebaRgt_Vinilo {
    
     public static void main(String[] args) {
        
// El usuario administrador define un nuevo vinilo
/*Vinilo vinilo = new Vinilo(
    "Dark Side of the Moon",        // nombre
    "Pink Floyd",                   // artista
    1973,                           // año de salida
    120.99,                         // precio
    5,                              // stock
    "Vinilo clásico de rock progresivo", // descripción
    1                               // id_proveedor
);*/

// Envías sus datos al controller (sin cambiar la lógica interna)
ViniloController controller = new ViniloController();
/*String resultado = controller.registrarVinilo(
    vinilo.getNombre(),
    vinilo.getArtista(),
    vinilo.getAnioSalida(),
    vinilo.getPrecio(),
    vinilo.getStock(),
    vinilo.getDescripcion(),
    vinilo.getIdProveedor()
);

System.out.println(resultado);*/

//-----------------------------------------------------------Crear vinilo---------------------------------
//Imprimir resultado de consulta
/*String resultado = controller.consultarVinilo("Dark Side of the Moon");
        System.out.println(resultado);*/
        
//-----------------------------------------------------------Consultar Vinilo-----------------------------  

  /*String resultado = controller.editarVinilo(
            1, // ID del vinilo existente
            "Dark Side of the Moon (Remasterizado)",
            "Pink Floyd",
            1973,
            150.00,
            10,
            "Vinilo clásico de rock progresivo.",
            1
        );*/
  //--------------------------------------------------------Editar Vinilo-----------------------------------
    // 🗑️ Eliminar un vinilo por su ID
       /* String resultado = controller.eliminarVinilo(2);*/

//---------------------------------------------------------Eliminar Vinilo------------------------------------
        //System.out.println(resultado);

    } 
     
}
