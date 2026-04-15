package org.example.grupo1;

import java.util.Scanner;

public class ex22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do primeiro aniversário: ");
        Integer dia1 = scanner.nextInt();

        System.out.print("Digite o mês do primeiro aniversário: ");
        Integer mes1 = scanner.nextInt();

        System.out.print("Digite o dia do segundo aniversário: ");
        Integer dia2 = scanner.nextInt();

        System.out.print("Digite o mês do segundo aniversário: ");
        Integer mes2 = scanner.nextInt();

        if ((dia1 == dia2) && (mes1 == mes2)){
            System.out.println("Os aniversários são iguais");
        } else {
            System.out.println("Os aniversário são diferentes");
        }

        scanner.close();
    }
}
