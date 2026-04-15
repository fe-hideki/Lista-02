package org.example.grupo1;

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro aniversariante: ");
        String nome1 = scanner.nextLine();

        System.out.println("Digite o dia do aniversário do primeiro aniversariante: ");
        Integer dia1 = scanner.nextInt();

        System.out.println("Digite o mês do aniversário do primeiro aniversariante: ");
        Integer mes1 = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o nome do segundo aniversariante: ");
        String nome2 = scanner.nextLine();

        System.out.println("Digite o dia do aniversário do segundo aniversariante: ");
        Integer dia2 = scanner.nextInt();

        System.out.println("Digite o mês do aniversário do segundo aniversariante: ");
        Integer mes2 = scanner.nextInt();

        if(mes1 < mes2){
            System.out.println(nome1 + " faz aniversário primeiro.");
        } else if (mes2 < mes1){
            System.out.println(nome2 + " faz aniversário primeiro.");
        } else if (dia1 < dia2){
            System.out.println(nome1 + " faz aniversário primeiro.");
        } else if (dia2 > dia1){
            System.out.println(nome2 + " faz aniversário primeiro.");
        } else {
            System.out.println(nome1 + " e " + nome2 + " fazem aniversário no mesmo dia.");
        }

        scanner.close();
    }
}
