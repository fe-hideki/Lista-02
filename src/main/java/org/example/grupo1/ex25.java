package org.example.grupo1;

import java.util.Scanner;

public class ex25 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a hora: ");
        int hora = scanner.nextInt();

        System.out.println("Digite o minuto: ");
        int minuto = scanner.nextInt();

        System.out.println("Digite o segundo: ");
        int segundo = scanner.nextInt();

        if(hora >= 0 && hora < 24 && minuto >= 0 && minuto < 60 && segundo >= 0 && segundo < 60){
            System.out.println("O horário é valido");
        } else {
            System.out.println("O horário é inválido");
        }

        scanner.close();

    }
}
