package com.polisong.main;

import com.polisong.dao.Conexion;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        Connection conn = Conexion.getConexion();
        if (conn != null) {
            System.out.println("Conexión establecida correctamente.");
        } else {
            System.out.println("No se pudo conectar a la base de datos.");
        }
    }
    
    
}
