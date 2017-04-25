package com.example.william.exam2.Bean;

import com.example.william.exam2.Users;

/**
 * Created by William on 25/04/2017.
 */

public class Usuario {
    private int id;
    private String nombre;
    private String Apellidos;
    private String User;
    private String contraseña;


    public Usuario(int id, String nombre, String apellidos, String usuario, String contraseña) {
        this.id = id;
        this.nombre = nombre;
        Apellidos = apellidos;
        User = usuario;
        this.contraseña = contraseña;
    }

    public Usuario() {

    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return Apellidos;
    }

    public String getUser() {
        return User;
    }

    public void setUser(String user) {
        User = user;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        Apellidos = apellidos;
    }



    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    @Override
    public String toString() {
        return nombre + " " + Apellidos + " " + User;
    }
}
