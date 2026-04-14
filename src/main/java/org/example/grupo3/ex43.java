package org.example.grupo3;

import java.util.Scanner;

public class ex43 {

    public double media500(){

        Scanner scanner = new Scanner(System.in);

        int soma = 0;

        for (int i = 0; i < 500; i++){
            System.out.println("Digite um número:");
            soma += scanner.nextInt();

        }

        double media = (double) soma / 500;
        return media;
    }

}
