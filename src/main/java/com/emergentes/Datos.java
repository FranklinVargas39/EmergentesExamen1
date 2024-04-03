
package com.emergentes;

public class Datos {
    private int id;
    private String nombre;
    private int parcial1;
    private int parcial2;
    private int parcial3;

    public Datos(int id, String nombre, int parcial1, int parcial2, int parcial3) {
        this.id = id;
        this.nombre = nombre;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
    }

    Datos(int id, String nombre, double parcial1, double parcial2, double parcial3) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    // Getters y setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getParcial1() {
        return parcial1;
    }

    public void setParcial1(int parcial1) {
        this.parcial1 = parcial1;
    }

    public double getParcial2() {
        return parcial2;
    }

    public void setParcial2(int parcial2) {
        this.parcial2 = parcial2;
    }

    public double getParcial3() {
        return parcial3;
    }

    public void setParcial3(int parcial3) {
        this.parcial3 = parcial3;
    }
}
