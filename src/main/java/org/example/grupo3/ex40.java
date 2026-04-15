package org.example.grupo3;

import java.util.Scanner;

public class ex40 {

    public void media(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a quantidade de pessoas do seu grupo:");
        int qtd = scanner.nextInt();

        int somaIdade = 0;
        int maiorIdade = 0;
        int menorIdade = 0;
        int qtdMaior = 0;

        for (int i = 0; i < qtd; i++) {

            System.out.println("Digite a idade do colega de grupo:");
            int idadeDig = scanner.nextInt();
            somaIdade += idadeDig;

            if(i == 0){
                maiorIdade = idadeDig;
            }

            if( idadeDig >= 18 ){
                qtdMaior++;
            }
            if(idadeDig > maiorIdade){
                maiorIdade = idadeDig;
            }
            if(idadeDig < menorIdade){
                menorIdade = idadeDig;
            }

        }

        double media = (double) somaIdade / qtd;

        System.out.println("Média de idade do grupo: " + media);
        System.out.println("Menor idade do grupo: " + menorIdade);
        System.out.println("Maior idade do grupo: " + maiorIdade);
        System.out.println("Quantidade de pessoas maior de idade no grupo: " + qtdMaior);

        scanner.close();

    }

}
