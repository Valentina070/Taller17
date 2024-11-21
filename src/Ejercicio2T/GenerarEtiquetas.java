/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2T;

/**
 *
 * @author zunig
 */
public class GenerarEtiquetas {
   private CalcularPrecios calculadora;

    public GenerarEtiquetas(CalcularPrecios calculadora) {
        this.calculadora = calculadora;
    }

    public String generarEtiqueta(Producto producto) {
        double precioFinal = calculadora.calcularPrecioFinal(producto);
        return "Producto: " + producto.getNombre() + ", Precio: " + precioFinal;
    }
} 

