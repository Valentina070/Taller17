/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2T;

/**
 *
 * @author zunig
 */
public class ClaseInicial {//Esta clase es la clase inicial de producto sin el SRP
    private String nombre;
    private double precioBase;
    private double impuesto;

    public ClaseInicial(String nombre, double precioBase, double impuesto) {
        this.nombre = nombre;
        this.precioBase = precioBase;
        this.impuesto = impuesto;
    }

    public double calcularPrecioFinal() {
        return precioBase + (precioBase * impuesto);
    }

    public String generarEtiqueta() {
        return "Producto: " + nombre + ", Precio: " + calcularPrecioFinal();
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecioBase() {
        return precioBase;
    }

    public double getImpuesto() {
        return impuesto;
    }
} 
