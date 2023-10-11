package com.liceolapaz.des.dcm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Escribir menú
        escribirMenu();
        // Pedir opción
        pedirOpcion();
        // Leer opción y guardarla
        int opcion = leerOpcion();
        // Escribir mensaje dependiendo de la opción
    }

    private static int leerOpcion() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirOpcion() {
        System.out.println("Escoja una opción: ");
    }

    private static void escribirMenu() {
        System.out.println("MENÚ OPCIONES\n" +
                "1. Opción 1\n" +
                "2. Opción 2\n" +
                "3. Opción 3\n" +
                "0. Salir");
    }
}