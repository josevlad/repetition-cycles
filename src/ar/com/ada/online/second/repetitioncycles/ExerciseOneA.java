package ar.com.ada.online.second.repetitioncycles;

import java.util.Scanner;

public class ExerciseOneA {

    public static void main(String[] args) {
        int resultSum = 0;
        int[] arrayNumbers = new int[10];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.printf("Ingrese en valor para la posicion %d en el arreglo: ", i);
            arrayNumbers[i] = keyboard.nextInt();
        }

        for (int i = 0; i < arrayNumbers.length; i++) {
            resultSum += arrayNumbers[i]; // resultSum = resultSum + arrayNumbers[i];
        }

        System.out.printf("La suma de los elementos del arreglo es %d ", resultSum);
    }
}
