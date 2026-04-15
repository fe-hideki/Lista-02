package org.example.grupo1;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor da despesa: ");
        Double valorDespesa = scanner.nextDouble();

        Double comissao = valorDespesa * 0.1;
        System.out.println("Valor da comissao: " + comissao);

        scanner.close();
    }
}
