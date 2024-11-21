/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class Prueba {
    public static void main(String[] args) {
        Usuario usuario = new Usuario("Vale07", "contraseña18");

        Validacion validacion = new Validacion();
        if (validacion.validar(usuario)) {
            // Autenticación
            Autenticacion autenticacion = new Autenticacion();
            if (autenticacion.autenticar(usuario, "contraseña18")) {
                System.out.println("Autenticación exitosa.");
            } else {
                System.out.println("Autenticación fallida. Datos invalidos.");
            }
        }
    }
}

