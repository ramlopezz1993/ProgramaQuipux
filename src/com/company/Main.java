package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese un número: ");
        int numero = lectura.nextInt();
        if (numero % 2 == 0) {
            if (numero >= 2 && numero <= 5) {
                System.out.println("No Quipux");
            } else if (numero >= 6 && numero <= 20) {
                System.out.println("Quipux");
            } else if (numero > 20) {
                System.out.println("No Quipux");
            }
        } else {
            System.out.println("Quipux");
        }
        lectura.close();
    }
}
