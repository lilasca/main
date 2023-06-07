package java_bases_ejercicios;

// 1) Calculadora de edad de perros:
// Pídele al usuario que ingrese la edad de su perro.
// Convierte esa edad a años de perro (se dice que 1 año humano equivale a 7 años de perro).

import java.util.Scanner;

public class ejercicios {
    public static void main(String[] args) {

        Scanner scannerDeDatos = new Scanner(System.in);

        System.out.println("Ingrese la edad de su perro");

        int añosHumano = scannerDeDatos.nextInt();

        int añosDePerro = añosHumano * 7;

        System.out.println("La edad de de su perro es: " + añosDePerro);
    }
}
