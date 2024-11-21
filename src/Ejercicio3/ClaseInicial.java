/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Ejercicio3;

/**
 *
 * @author zunig
 */
public class ClaseInicial {
    private String username;
    private String password;
    private boolean isAuthenticated;

    public ClaseInicial (String username, String password) {
        this.username = username;
        this.password = password;
        this.isAuthenticated = false;
    }

    public boolean autenticar(String password) {
        if (this.password.equals(password)) {
            isAuthenticated = true;
            return true;
        } else {
            isAuthenticated = false;
            return false;
        }
    }

    public boolean validar() {
        return username != null && !username.isEmpty() && password != null && !password.isEmpty();
    }

    public String getUsername() {
        return username;
    }

    public boolean isAuthenticated() {
        return isAuthenticated;
    }
}
 
