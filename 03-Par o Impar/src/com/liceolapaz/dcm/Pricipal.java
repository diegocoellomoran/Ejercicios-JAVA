package com.liceolapaz.dcm;

import java.util.Scanner;

public class Pricipal {
    public static void main(String[] args) {
        // Pedir un número al usuario
        pedirNumero();
        // Leer el número y guardarlo
        int numeroUsuario = leerNumero();
        // Comprobar si es par o impar y guardar mensaje
        String mensaje = comprobarNumero(numeroUsuario);
        // Escribir mensaje
        escribirMensaje(mensaje);
    }

    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    private static String comprobarNumero(int numeroUsuario) {
        String mensaje = (numeroUsuario ==0) ? "El número 0 no es par ni impar" : (numeroUsuario % 2 == 0) ? "El número es par" : "El número es impar";
        return mensaje;
    }

    private static int leerNumero() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirNumero() {
        System.out.print("Escriba un número entero: ");
    }
}
