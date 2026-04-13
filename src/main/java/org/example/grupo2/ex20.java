package org.example.grupo2;

import java.util.Scanner;

public class ex20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nome e idade: ");
        String nome1 = sc.next();
        int idade1 = sc.nextInt();

        System.out.println("Nome e idade: ");
        String nome2 = sc.next();
        int idade2 = sc.nextInt();

        if(idade1 > idade2){
            System.out.println("Mais velho: " + nome1 + "\nMais novo: " + nome2);
        }else {
            System.out.println("Mais velho: " + nome2 + "\nMais novo: " + nome1);
        }


    }
}
