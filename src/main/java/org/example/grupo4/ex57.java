package org.example.grupo4;

import java.util.Scanner;

public class ex57 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número correspondente ao dia inicial: ");
        int diaInicio = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número correspondente ao mês inicial: ");
        int mesInicio = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número correspondente ao dia final: ");
        int diaFim = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número correspondente ao mês final: ");
        int mesFim = Integer.parseInt(scanner.nextLine());

        for (int i = mesInicio; i <= mesFim; i++) {

            boolean tem31Dias = i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 ||
                    i == 12;
            boolean tem30Dias = i == 4 || i == 6 || i == 9 || i == 11;

            if (mesInicio == mesFim){
                for (int j = diaInicio; j <= diaFim; j++) {
                    System.out.println(j + "/" + i + "/2026");
                }
            }

            else if (i == mesInicio){
                if (tem31Dias) {
                    for (int j = diaInicio; j <= 31; j++) {
                        System.out.println(j + "/" + i + "/2026");
                    }
                }
                else if (tem30Dias) {
                    for (int j = diaInicio; j <= 30; j++) {
                        System.out.println(j + "/" + i + "/2026");
                    }
                }
                else {
                    for (int j = diaInicio; j <= 28; j++) {
                        System.out.println(j + "/" + i + "/2026");
                    }
                }
            }

            else if (i == mesFim){
                for (int j = 1; j <= diaFim; j++) {
                    System.out.println(j + "/" + i + "/2026");
                }
            }

            else {
                if (tem31Dias) {
                    for (int j = 1; j <= 31; j++) {
                        System.out.println(j + "/" + i + "/2026");
                    }
                }
                else if (tem30Dias) {
                    for (int j = 1; j <= 30; j++) {
                        System.out.println(j + "/" + i + "/2026");
                    }
                }
                else {
                    for (int j = 1; j <= 28; j++) {
                        System.out.println(j + "/" + i + "/2026");
                    }
                }
            }
        }
    }
}
