package com.polisong.model;

public class cancion {
    private int idCancion;
    private String nombre;
    private String artista;
    private double precioMp3;
    private double duracion;
    private double tamanoMb;
    private int calidadKbps;
    private int idGenero;

    public cancion() {}

    public cancion(int idCancion, String nombre, String artista, double precioMp3,
                   double duracion, double tamanoMb, int calidadKbps, int idGenero) {
        this.idCancion = idCancion;
        this.nombre = nombre;
        this.artista = artista;
        this.precioMp3 = precioMp3;
        this.duracion = duracion;
        this.tamanoMb = tamanoMb;
        this.calidadKbps = calidadKbps;
        this.idGenero = idGenero;
    }

    // Getters y Setters
    public int getIdCancion() { return idCancion; }
    public void setIdCancion(int idCancion) { this.idCancion = idCancion; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }

    public double getPrecioMp3() { return precioMp3; }
    public void setPrecioMp3(double precioMp3) { this.precioMp3 = precioMp3; }

    public double getDuracion() { return duracion; }
    public void setDuracion(double duracion) { this.duracion = duracion; }

    public double getTamanoMb() { return tamanoMb; }
    public void setTamanoMb(double tamanoMb) { this.tamanoMb = tamanoMb; }

    public int getCalidadKbps() { return calidadKbps; }
    public void setCalidadKbps(int calidadKbps) { this.calidadKbps = calidadKbps; }

    public int getIdGenero() { return idGenero; }
    public void setIdGenero(int idGenero) { this.idGenero = idGenero; }
}