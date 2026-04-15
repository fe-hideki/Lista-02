package org.example.grupo4;

import java.util.Scanner;

public class ex65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número de linhas: ");
        int qtdLinhas = Integer.parseInt(scanner.nextLine());

        int qtdEstrelas = 1;
        int qtdEspacos;

        for (int i = 1; i <= qtdLinhas; i++){
            qtdEspacos = qtdLinhas - i;

            for (int j = 1; j <= qtdEspacos; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= qtdEstrelas; k++){
                System.out.print("*");
            }

            qtdEstrelas += 2;
            System.out.println();
        }
    }
}
