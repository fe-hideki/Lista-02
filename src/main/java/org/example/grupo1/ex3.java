package org.example.grupo1;

import java.util.Scanner;

public class ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de homens: ");
        Integer qtdHomens = scanner.nextInt();

        System.out.println("Digite a quantidade de mulheres: ");
        Integer qtdMulheres = scanner.nextInt();

        Double totalPessoas = (double)qtdHomens + (double)qtdMulheres;
        Double percentualHomens = qtdHomens * 100 / totalPessoas ;
        Double percentualMulheres = qtdMulheres * 100 / totalPessoas;

        System.out.println("Percentual de Homens: " + percentualHomens + "%");
        System.out.println("Percentual de Mulheres: " + percentualMulheres + "%");

        scanner.close();
    }
}
