package java_bases_ejercicios;

// 5) Juego de adivinar el número:

// Genera un número aleatorio entre 1 y 100. Pídele al usuario que adivine el número.

import java.util.Scanner;

import java.util.Random;

public class Ejercicio_5 {

    public static void main(String[] args) {
        System.out.println("Juego de adivinar el número");

        Scanner scannerDeDatos = new Scanner(System.in);

        Random random = new Random();

        System.out.println("Adivine e ingrese un numero: ");

        int numeroUsuario = scannerDeDatos.nextInt();

        int numeroRandom = random.nextInt(100) + 1;

        if (numeroUsuario == numeroRandom) {
            System.out.println("acertaste");
        }

        else if (numeroUsuario > 100 || numeroUsuario < 1) {
            System.out.println("El numero debe estar entre 1 y 100");
        }

        else {
            System.out.println("Aqui esta la respuesta el numero que tenias que adivinar era: " + numeroRandom);
        }

        System.out.println("Fin del juego");

    }

}
