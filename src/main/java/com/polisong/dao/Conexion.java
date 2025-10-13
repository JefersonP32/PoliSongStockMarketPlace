package com.polisong.dao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
    private static final String URL = "jdbc:sqlite:src/main/resources/database/polisong.db";
    
    public static Connection getConexion() {
        try {
            Connection conn = DriverManager.getConnection(URL);
            System.out.println("Conectado correctamente a la base de datos SQLite");
            return conn;
        } catch (SQLException e) {
            System.err.println("Error al conectar: " + e.getMessage());
            return null;
        }
    }
}

