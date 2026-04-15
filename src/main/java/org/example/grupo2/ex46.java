package org.example.grupo2;

import java.util.Scanner;

public class ex46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int homens = 0;
        int mulheres = 0;

        for (int i = 1; i<= 200; i++){
            System.out.println("Pessoa " + i);

            System.out.println("Sexto(M/F): ");
            char sexo = sc.next().charAt(0);

            System.out.println("Idade: " );
            int idade = sc.nextInt();

            if (idade >= 18){
                if (sexo == 'M' || sexo == 'm'){
                    homens++;
                } else if (sexo == 'F' || sexo == 'f') {
                    mulheres++;
                }else {
                    System.out.println("Sexo não identificado!");
                }

                System.out.println("Homens maiores de idade: " + homens);
                System.out.println("Mulheres maiores de idade: " + mulheres);
            }
        }
    }
}
