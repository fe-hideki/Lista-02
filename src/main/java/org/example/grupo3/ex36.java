package org.example.grupo3;

import java.util.Scanner;

public class ex36 {

    public void impares(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o intervalo de números");
        System.out.println("Número menor:");
        int intervaloMenor = scanner.nextInt();
        System.out.println("Número maior");
        int intervaloMaior = scanner.nextInt();

        for (int i = intervaloMenor; i <= intervaloMaior; i++) {

            if(!(i % 2 == 0)){
                System.out.println(i);
            }

        }

    }

}
