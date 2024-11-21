/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio1;

/**
 *
 * @author zunig
 */
public class ClaseLibro1 {
   public class Libro {
    private String titulo;
    private String autor;
    private int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String getTitulo() {
        return titulo;
    }
    public String getAutor() {
        return autor;
    }
    public int getPaginas() {
        return paginas;
    }
    public String generarReporte() {
        return "Título: " + titulo + "\nAutor: " + autor + "\nPáginas: " + paginas;
    }
    public void guardarEnArchivo() {
        System.out.println("Guardando información del libro en un archivo...");
    }
} 
}
