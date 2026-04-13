package org.example.grupo4;

import java.util.Scanner;

public class ex61 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int qtdLinhas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= qtdLinhas; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
