package org.example.grupo1;

import java.util.Scanner;

public class ex13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira a nota 1: ");
        Double nota1 = scanner.nextDouble();

        System.out.println("Insira a nota 2: ");
        Double nota2 = scanner.nextDouble();

        System.out.println("Insira a nota 3: ");
        Double nota3 = scanner.nextDouble();

        Double media = (nota1 + nota2 + nota3) / 3;

        System.out.println("Média: " + media);

        if (media >= 7.0){
            System.out.println("Você foi aprovado");
        } else if(media >= 5.0 && media < 7.0){
            System.out.println("Você está de recuperação");
            System.out.println("Insira a nota da prova de recuperação: ");
            Double notaProva = scanner.nextDouble();
            if (notaProva >= 5.0){
                System.out.println("Você recuperou");
            } else {
                System.out.println("Você foi reprovado");
            }

        } else {
            System.out.println("Você foi reprovado");
        }


        scanner.close();
    }
}
