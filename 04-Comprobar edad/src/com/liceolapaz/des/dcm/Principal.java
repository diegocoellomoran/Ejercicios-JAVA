package com.liceolapaz.des.dcm;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        // Pedir el año de nacimiento
        pedirAno();
        // Leer el año y guardarlo
        int anoNacimiento = leerAnoNacimiento();
        // Comprobar el año guardar mensaje
        String mensaje = comprobarAnoNacimiento(anoNacimiento);
        // Escribir mensaje
        escribirMensaje(mensaje);
    }

    private static void escribirMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    private static String comprobarAnoNacimiento(int anoNacimiento) {
        String mensaje;
        int edad = 2023 - anoNacimiento;
        if (anoNacimiento > 2023) {
            mensaje = "No puedes haber nacido en el futuro";
        } else if (edad > 150) {
            mensaje = "No puedes tener tantos años;";
        } else if (edad >= 18) {
            mensaje = "Tienes permiso para entrar";
        } else {
            mensaje = "No puedes pasar";
        } return mensaje;
    }

    private static int leerAnoNacimiento() {
        Scanner teclado = new Scanner(System.in);
        return teclado.nextInt();
    }

    private static void pedirAno() {
        System.out.print("Escriba su año de nacimiento: ");
    }
}
