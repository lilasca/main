package java_bases_ejercicios;

// 4) Calculadora de propinas:

// Pídele al usuario que ingrese el total de la cuenta en un restaurante.
// Pídele al usuario que ingrese el porcentaje de propina que desea dejar.
// Calcula el monto de la propina utilizando la fórmula: propina = totalCuenta * (porcentajePropina / 100).

import java.util.Scanner;

public class Ejercicio_4 {
    public static void main(String[] args) {
        System.out.println("Calculadora de propinas");

        Scanner scannerDeDatos = new Scanner(System.in);

        System.out.println("Ingrese el total de la cuenta");

        double totalCuenta = scannerDeDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de propina que desea dejar");

        double porcentajePropina = scannerDeDatos.nextDouble();

        double propina = totalCuenta * (porcentajePropina / 100);

        if (porcentajePropina < 0 || porcentajePropina > 100) {

            System.out.println("El porcentaje de propina debe estar entre 0 y 100");
        } else {
            System.out.println("Gracias la propina que dejo es de: " + propina);
        }
    }
}
