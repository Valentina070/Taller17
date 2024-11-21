/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class SistemaLibros {
 public static void main(String[] args) {
        Libro libro = new Libro("Orgullo y prejuicio", "Jane Austen", 448);

        GestorReportes gestorReportes = new GestorReportes();
        String reporte = gestorReportes.generarReporte(libro);
        System.out.println("Reporte del libro:");
        System.out.println(reporte);
        // Se guardar el libro en un archivo
        GestorPersistencia gestorPersistencia = new GestorPersistencia();
        gestorPersistencia.guardarEnArchivo(libro, "libro_orgulloyprejuicio.txt");
    }
}

