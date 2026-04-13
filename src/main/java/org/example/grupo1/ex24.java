package org.example.grupo1;

import java.util.Scanner;

public class ex24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia: ");
        int dia = scanner.nextInt();

        System.out.println("Digite o mês: ");
        int mes = scanner.nextInt();

        System.out.println("Digite o ano: ");
        int ano = scanner.nextInt();

        int diaMaximo;

        if (mes == 2) {
            if ((ano % 4 == 0 && ano % 100 == 0) || (ano % 400 == 0)) {
                diaMaximo = 29;
            } else {
                diaMaximo = 28;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            diaMaximo = 30;
        } else {
            diaMaximo = 31;
        }

        if (mes >= 1 && mes <= 12 && dia >= 1 && dia <= diaMaximo) {
            System.out.println("Data válida");
        } else {
            System.out.println("Data inválida");
        }

        scanner.close();
    }
}
