package org.example.grupo3;

import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class ex48 {

    public void situacao(){

        Scanner scanner = new Scanner(System.in);

        double soma = 0.0;

        System.out.println("Digite a quantodade de notas para a média: ");
        int qtdNotas = scanner.nextInt();

        for (int i = 0; i < qtdNotas; i++){

            System.out.println("Digite a nota:");
            soma += scanner.nextDouble();

        }

        System.out.println("Digite a quantidade de aulas dadas: ");
        int qtdAula = scanner.nextInt();

        System.out.println("Digite a quantidade de faltas: ");
        int qtdFalta = scanner.nextInt();

        double media = (double) soma / qtdNotas;
        double faltas = (double) (qtdFalta / qtdAula) * 100;

        if(media > 6.0 && faltas < 25.00){
            System.out.println("Aprovado");
        }
        if (media < 6.0 ) {
            System.out.println("Reprovado por nota");
        }
        if (faltas > 25.00){
            System.out.println("Reprovado por faltas");
        }
    }
}
