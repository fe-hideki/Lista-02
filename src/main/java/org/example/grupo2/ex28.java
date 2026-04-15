package org.example.grupo2;

import java.util.Scanner;

public class ex28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o primeiro número (a): ");
        int a = scanner.nextInt();
        System.out.print("Digite o segundo número (b): ");
        int b = scanner.nextInt();
        System.out.print("Digite o terceiro número (c): ");
        int c = scanner.nextInt();

        int temp;

        if (a > b) {
            temp = a; a = b; b = temp;
        }

        if (b > c) {
            temp = b; b = c; c = temp;
        }

        if (a > b) { temp = a; a = b; b = temp; }

        System.out.println("Ordem crescente: " + a + ", " + b + ", " + c);

    }
}
