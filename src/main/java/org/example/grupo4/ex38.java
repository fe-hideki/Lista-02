package org.example.grupo4;

import java.util.Scanner;

public class ex38 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = Integer.parseInt(scanner.nextLine());

        int divisores = 0;

        for (int i = 1; i <= numero; i++){
            if (numero % i == 0){
                divisores++;
            }
        }
        if (divisores == 2){
            System.out.println("é primo");
        }
        else {
            System.out.println("não é primo");
        }
    }
}
