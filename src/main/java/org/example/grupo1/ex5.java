package org.example.grupo1;

import java.util.Scanner;

public class ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor inicial do débito: ");
        Double valorInicial = scanner.nextDouble();

        System.out.println("Insira quantidade de meses: ");
        Double meses = scanner.nextDouble();

        System.out.println("Insira a taxa mensal: ");
        Double taxaMensal = scanner.nextDouble();

        Double taxaDecimal = taxaMensal / 100;

        Double totalJuros = valorInicial * taxaDecimal * meses;

        Double valorFinal = valorInicial + totalJuros;

        System.out.println("O total vai ser: " + valorFinal);

        scanner.close();
    }
}
