package org.example.grupo3;

import java.util.Random;
import java.util.Scanner;

public class ex35 {

    public void numSort(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de números que deverá ser sorteada");
         int qtdNum = scanner.nextInt();
        System.out.println("Digite o intervalo de números para ser sorteado");
        System.out.println("Número menor:");
         int intervaloMenor = scanner.nextInt();
        System.out.println("Número maior");
         int intervaloMaior = scanner.nextInt();

        for (int i = 0; i < qtdNum; i++){
            int sorteio = (int)(Math.random() * (intervaloMaior - intervaloMenor + 1) + intervaloMenor);
            System.out.println(sorteio);
        }

        scanner.close();

    }

}
