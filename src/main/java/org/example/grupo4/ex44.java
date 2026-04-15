package org.example.grupo4;

import java.util.Scanner;

public class ex44 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        System.out.print("Digite a quantidade de números: ");
        int qtdNumeros = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < qtdNumeros; i++){
            System.out.print("Digite um número: ");
            soma += Integer.parseInt(scanner.nextLine());

        }

        double media = (double) soma / qtdNumeros;
        System.out.println(media);

    }
}
