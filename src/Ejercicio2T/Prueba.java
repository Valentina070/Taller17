/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio2T;

/**
 *
 * @author zunig
 */
public class Prueba {
 public static void main(String[] args) {
        Producto producto = new Producto("Celular de alta calidad", 3000000.0, 0.04);

        CalcularPrecios calculadora = new CalcularPrecios();
        GenerarEtiquetas generador = new GenerarEtiquetas(calculadora);

        System.out.println("Precio final: " + calculadora.calcularPrecioFinal(producto));
        System.out.println(generador.generarEtiqueta(producto));
    }
}   

