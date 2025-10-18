package com.polisong.model;

public class Vinilo {
    private int idVinilo;
    private String nombre;
    private String artista;
    private int anioSalida;
    private double precio;
    private int stock;
    private String descripcion;
    private int idProveedor;

    public Vinilo() {}

    public Vinilo(String nombre, String artista, int anioSalida, double precio, int stock, String descripcion, int idProveedor) {
        this.nombre = nombre;
        this.artista = artista;
        this.anioSalida = anioSalida;
        this.precio = precio;
        this.stock = stock;
        this.descripcion = descripcion;
        this.idProveedor = idProveedor;
    }

    // Getters y setters
    public int getIdVinilo() { return idVinilo; }
    public void setIdVinilo(int idVinilo) { this.idVinilo = idVinilo; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getArtista() { return artista; }
    public void setArtista(String artista) { this.artista = artista; }

    public int getAnioSalida() { return anioSalida; }
    public void setAnioSalida(int anioSalida) { this.anioSalida = anioSalida; }

    public double getPrecio() { return precio; }
    public void setPrecio(double precio) { this.precio = precio; }

    public int getStock() { return stock; }
    public void setStock(int stock) { this.stock = stock; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public int getIdProveedor() { return idProveedor; }
    public void setIdProveedor(int idProveedor) { this.idProveedor = idProveedor; }
}