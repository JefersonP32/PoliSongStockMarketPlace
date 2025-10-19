package com.polisong.model;

public class CancionRecopilacion {
    private int idRecopilacion;
    private int idCancion;

    public CancionRecopilacion(int idRecopilacion, int idCancion) {
        this.idRecopilacion = idRecopilacion;
        this.idCancion = idCancion;
    }

    public int getIdRecopilacion() { return idRecopilacion; }
    public int getIdCancion() { return idCancion; }
}
