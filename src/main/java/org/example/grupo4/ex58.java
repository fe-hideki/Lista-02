package org.example.grupo4;

import java.util.Scanner;

public class ex58 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o número do dia: ");
        int diaNumero = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número do mês: ");
        int mesNumero = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite o número do ano: ");
        int anoNumero = Integer.parseInt(scanner.nextLine());

        System.out.print("Digite a quantidade de dias: ");
        int qtdDias = Integer.parseInt(scanner.nextLine());

        boolean tem31Dias;
        boolean tem30Dias;
        boolean tem28Dias;

        while (qtdDias > 0){
            tem31Dias = mesNumero == 1 || mesNumero == 3 || mesNumero == 5 ||
                    mesNumero == 7 || mesNumero == 8 || mesNumero == 10 ||
                    mesNumero == 12;

            tem30Dias = mesNumero == 4 || mesNumero == 6 || mesNumero == 9
                    || mesNumero == 11;

            tem28Dias = mesNumero == 2;

            if (tem31Dias && diaNumero == 31){
                if (mesNumero == 12){
                    anoNumero++;
                    mesNumero = 1;
                }
                else {
                    mesNumero++;
                }
                diaNumero = 1;
            }
            else if (tem30Dias && diaNumero == 30){
                mesNumero++;
                diaNumero = 1;
            }
            else if (tem28Dias && diaNumero == 28) {
                mesNumero++;
                diaNumero = 1;
            }
            else {
                diaNumero++;
            }
            qtdDias--;
        }
        System.out.println(diaNumero + "/" + mesNumero + "/" + anoNumero);
    }
}
