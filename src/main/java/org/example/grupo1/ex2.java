package org.example.grupo1;

import java.util.Scanner;

public class ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        Double salario = scanner.nextDouble();

        System.out.println("Digite o valor do salário mínimo atual: ");
        Double salarioMinimo = scanner.nextDouble();

        Double qtdSalariosMinimos = salario / salarioMinimo;

        System.out.println("Seu salário equivale a " + qtdSalariosMinimos + " salários mínimos");

        scanner.close();
    }
}
