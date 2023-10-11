package com.liceolapaz.des.dcm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Ponerle un encabezado
        ponerEncabezado();
        // Pedirle el nombre al usuario
        pedirNombre();
        // Leer el nombre y guardarlo en una variable
        String nombreUsuario = leerNombre();
        // Saludar al usuario
        saludarUsuario(nombreUsuario);
    }
    private static void ponerEncabezado() {
        System.out.println("HOLA USUARIO"); }
    private static void pedirNombre() {
        System.out.print("Escriba su nombre: ");
    }


    }

    private static String leerNombre() {
        Scanner teclado = new Scanner(System.in);
        String nombre = teclado.nextLine();
        return nombre;
    }s



}
