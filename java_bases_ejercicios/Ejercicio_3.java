package java_bases_ejercicios;

// 3) Calculadora de descuento:
// Pídele al usuario que ingrese el precio original de un producto.
// Pídele al usuario que ingrese el porcentaje de descuento.
// Calcula el precio final después de aplicar el descuento utilizando la fórmula: precioFinal = precioOriginal - (precioOriginal * descuento / 100).
// Muestra el precio final al usuario.


import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        System.out.println("Calculadora de descuento");

        Scanner scannerDeDatos = new Scanner(System.in);

        System.out.println("Ingrese el precio original del producto");

        double precioOriginal = scannerDeDatos.nextDouble();

        System.out.println("Ingrese el porcentaje de descuento");

        double descuento = scannerDeDatos.nextDouble();

        if (descuento > 100 || descuento < 0) {

            System.out.println("El porcentaje de descuento debe estar entre 0 y 100");

        } else {

            double precioFinal = precioOriginal - (precioOriginal * descuento / 100);

            System.out.println("El precio final después el descuento es de: " + precioFinal);
        }

    }
}
