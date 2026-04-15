package org.example.grupo4;

import java.util.Scanner;

public class ex64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da pirâmide: ");
        int qtdTriangulos = Integer.parseInt(scanner.nextLine());

        for (int i = 1; i <= qtdTriangulos; i++){
            for (int j = 1; j <= i; j++){
                for (int k = 1; k <= j; k++){
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
