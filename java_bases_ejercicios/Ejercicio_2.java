package java_bases_ejercicios;

// 2) Conversor de millas a kilómetros:
// Pídele al usuario que ingrese una distancia en millas.
// Convierte la distancia a kilómetros utilizando la fórmula: kilómetros = millas * 1.60934.
// Muestra la distancia en kilómetros al usuario.

import java.util.Scanner;

public class Ejercicio_2 {
    public static void main(String[] args) {
        System.out.println("Conversor de millas a kilómetros");

        Scanner scannerDeDatos = new Scanner(System.in);

        System.out.println("Ingrese una distancia en millas");

        double millas = scannerDeDatos.nextDouble();

        double kilometros = millas * 1.60934;

        System.out.println("La distancia de millas a kilómetros es: " + kilometros);
    }
}
