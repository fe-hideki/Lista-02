package org.example.grupo1;

import java.util.Scanner;

public class ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota 1: ");
        Double nota1 = scanner.nextDouble();

        System.out.println("Insira a nota 2: ");
        Double nota2 = scanner.nextDouble();

        System.out.println("Insira a nota 3: ");
        Double nota3 = scanner.nextDouble();

        System.out.println("Insira a nota 4: ");
        Double nota4 = scanner.nextDouble();

        Double media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("A média da snotas é: " + media);

        scanner.close();
    }
}
