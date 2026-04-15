package org.example.grupo4;

import java.util.Scanner;

public class ex63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int qtdLinhas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= qtdLinhas; i++) {
            for (int j = 1; j <= i; j++) {
                if (j < 10) {
                    System.out.print("0" + j + " ");
                }
                else {
                    System.out.print(j + " ");
                }
            }
            System.out.println();
        }
    }
}
