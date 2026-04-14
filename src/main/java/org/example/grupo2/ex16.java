package org.example.grupo2;

import java.util.Scanner;

public class ex16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o dia do aniversário: ");
        int dia = scanner.nextInt();
        System.out.print("Digite o número do mês (1-12): ");
        int mes = scanner.nextInt();

        String nomeMes = "";
        int diasMaximos = 0;
        boolean mesValido = true;
        String signo = "";

        switch (mes) {
            case 1: nomeMes = "Janeiro"; diasMaximos = 31; break;
            case 3: nomeMes = "Março"; diasMaximos = 31; break;
            case 2: nomeMes = "Fevereiro"; diasMaximos = 29; break;
            case 4: nomeMes = "Abril"; diasMaximos = 30; break;
            case 5: nomeMes = "Maio"; diasMaximos = 31; break;
            case 6: nomeMes = "Junho"; diasMaximos = 30; break;
            case 7: nomeMes = "Julho"; diasMaximos = 31; break;
            case 8: nomeMes = "Agosto"; diasMaximos = 31; break;
            case 9: nomeMes = "Setembro"; diasMaximos = 30; break;
            case 10: nomeMes = "Outubro"; diasMaximos = 31; break;
            case 11: nomeMes = "Novembro"; diasMaximos = 30; break;
            case 12: nomeMes = "Dezembro"; diasMaximos = 31; break;
            default: mesValido = false; break;
        }

        if (!mesValido) {
            System.out.println("Mês inválido!");
        } else if (dia < 1 || dia > diasMaximos) {
            System.out.println("Dia inválido para o mês de " + nomeMes + "!");
        } else {
            System.out.println("Data de aniversário ok: " + dia + " de " + nomeMes + ".");
        }

        if (mes >= 1 && mes <= 3){
            System.out.println("1º semestre");
        } else if (mes >= 4 && mes <=6) {
            System.out.println("2º semestre");
        } else if (mes >= 7 && mes <= 9) {
            System.out.println("3º semestre");
        } else if (mes >= 8 && mes <= 12) {
            System.out.println("4º trimestre");
        }

        scanner.close();
    }
}
