package org.example.grupo1;

import java.util.Scanner;

public class ex11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira sua idade: ");
        Integer idade = scanner.nextInt();

        if (idade < 16){
            System.out.println("Você não pode votar");
        } else if(idade == 16 || idade >= 65){
            System.out.println("Voto facultativo");
        } else {
            System.out.println("Voto Obrigatório");
        }

        scanner.close();
    }
}
