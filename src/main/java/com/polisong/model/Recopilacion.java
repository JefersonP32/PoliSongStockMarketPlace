package com.polisong.model;

public class Recopilacion {
    private int idRecopilacion;
    private String nombre;
    private String descripcion;
    private int idUsuario;
    private boolean esPublica;

    public Recopilacion(String nombre, String descripcion, int idUsuario, boolean esPublica) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.idUsuario = idUsuario;
        this.esPublica = esPublica;
    }

    // Getters y Setters
    public int getIdRecopilacion() { return idRecopilacion; }
    public void setIdRecopilacion(int idRecopilacion) { this.idRecopilacion = idRecopilacion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getIdUsuario() { return idUsuario; }
    public void setIdUsuario(int idUsuario) { this.idUsuario = idUsuario; }

    public boolean isEsPublica() { return esPublica; }
    public void setEsPublica(boolean esPublica) { this.esPublica = esPublica; }
    
    
    @Override
    public String toString() {
        return "Recopilacion{" +
                "id=" + idRecopilacion +
                ", nombre='" + nombre + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", publica=" + (esPublica ? "Sí" : "No") +
                '}';
    }
}
