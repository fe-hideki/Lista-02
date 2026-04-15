package org.example.grupo4;

import java.util.Scanner;

public class ex60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor da dívida: ");
        double divida = Double.parseDouble(scanner.nextLine());

        System.out.print("Digite o valor da taxa de correção em porcentagem: ");
        double taxa = Double.parseDouble(scanner.nextLine()) / 100;

        System.out.print("Digite a quatidade de anos: ");
        int anos = Integer.parseInt(scanner.nextLine());

        int anoAtual = 2007;

        System.out.println("Anos Jan    Fev    Mar    Abr    Mai    Jun    " +
                "Jul    Ago    Set    Out    Nov    Dez   ");

        for (int i = 0; i < anos; i++){
            System.out.print(anoAtual);

            for (int j = 0; j < 12; j++){
                System.out.printf(" %.2f", divida);
                divida *= (1 + taxa);
            }
            System.out.println();
            anoAtual++;
        }
    }
}
