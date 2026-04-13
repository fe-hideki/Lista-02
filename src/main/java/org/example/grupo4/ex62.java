package org.example.grupo4;

import java.util.Scanner;

public class ex62 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int qtdLinhas = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= qtdLinhas; i++){

            if (i < 10){
                for (int j = 1; j <= i; j++){
                    System.out.print("0" + i + " ");
                }
            System.out.println();
            }

            else {
                for (int j = 1; j <= i; j++){
                    System.out.print(i + " ");
                }
                System.out.println();
            }
        }
    }
}
