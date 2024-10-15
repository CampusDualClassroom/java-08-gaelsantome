package com.campusdual.classroom;

import java.util.Scanner;

public class Exercise08 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el valor e N: ");
        int n = scanner.nextInt();
        whileLoop(n);
        scanner.close();
    }

    //TODO ↓
    // Comprueba el funcionamiento del bucle while, que para en cada iteración muestre el siguiente mensaje:
    // X < Y. El próximo ciclo valdrá: X+1
    // X+1 < Y. El próximo ciclo valdrá: X+2
    // etc.
    public static void whileLoop(int num) {

        int x = 0;
        while(x < num ){
            x= x+1;
            System.out.println( x + " < " + num + ". El proximo ciclo valdra: " + (x+1));
        }

    }

}