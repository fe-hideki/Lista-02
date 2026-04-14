package org.example.grupo3;

import java.util.Scanner;

public class ex41 {

    public void adivinharNum(){

        int numSort = (int)(Math.random() * (100 - 1 + 1) + 1);

        Scanner scanner = new Scanner(System.in);

        boolean errou = true;
        int contador = 1;

        while(errou){

            System.out.println("Tente adivinhar o número entre 1 a 100:");
            int tentativa = scanner.nextInt();

            if (tentativa == numSort){
                System.out.println("Parabéns!! Você acertou o número em " + contador + " tentativas");
                errou = false;
            } else if (tentativa > numSort) {
                System.out.println("Seu número é maior que o sorteado");
                contador++;
                System.out.println("Tente de novo");

            } else if (tentativa < numSort) {
                System.out.println("Seu número é menor que o sorteado");
                contador++;
                System.out.println("Tente de novo");
            }

        }

        scanner.close();

    }

}
