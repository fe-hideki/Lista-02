package org.example.grupo2;

import java.util.Scanner;

public class ex26 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a hora do primeiro horário: ");
        int hora1 = sc.nextInt();
        System.out.println("Digite os minutos do primeiro horário");
        int min1 = sc.nextInt();
        System.out.println("Digite os segundos do primeiro horário");
        int seg1 = sc.nextInt();


        //segundo horario
        System.out.println("Digite a hora do segundo horário: ");
        int hora2 = sc.nextInt();
        System.out.println("Digite os minutos do segundo horário: ");
        int min2 = sc.nextInt();
        System.out.println("Digite os segundos do segundo horário: ");
        int seg2 = sc.nextInt();

        int tempo1 = (hora1 * 3600) + (min1 * 60) + seg1;
        int tempo2 = (hora2 * 3600) + (min2 * 60) + seg2;
        int diferenca = 0;

        if (tempo1 >= tempo2){
            diferenca = tempo1 - tempo2;
        }else {
            diferenca = tempo2 - tempo1;
        }

        System.out.println("Tempo 1 em segundos: " + tempo1
        + "s\nTempo 2 em segundos: " + tempo2
        + "s\nDiferenca de tempo: " + diferenca + "s");
    }
}
