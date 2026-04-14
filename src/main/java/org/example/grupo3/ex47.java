package org.example.grupo3;

import java.util.Scanner;

public class ex47 {

    public void pacientes(){

        Scanner scanner = new Scanner(System.in);

        boolean fim = false;
        int qtdPaciente = 0;
        int somaIdadeH = 0;
        int qtdMulheresE = 0;
        int qtdPessoasE = 0;

        int idadeMaior = 0;
        String pacienteVelho = "" ;
        Double tamanhoBaixo = 0.0;
        String mulherBaixa = "" ;

        while(!fim){

            System.out.println("Digite as informações sobre os pacientes:");
            System.out.println("Digite o nome: ");
            String nomeVez = scanner.nextLine();

            System.out.println("É mulher? (Use 'S' para sim e 'N' para não) ");
            String eMulher = scanner.nextLine();

            System.out.println("Digite o peso: ");
            Double peso = scanner.nextDouble();

            System.out.println("Digite a idade:");
            int idade = scanner.nextInt();

            System.out.println("Digite a altura:");
            Double altura = scanner.nextDouble();

            if(qtdPaciente == 0){
                tamanhoBaixo = altura;
            }

            qtdPaciente++;

            if (eMulher == "N"){
                somaIdadeH += idade;
            }
            if ((eMulher == "S") && (altura >= 1.6 && altura <= 1.7) && (peso > 70.0) ){
                qtdMulheresE++;
            }
            if (idade >= 18 && idade <= 25){
                qtdPessoasE++;
            }
            if (idade > idadeMaior ){
                pacienteVelho = nomeVez;
            }
            if(altura < tamanhoBaixo){
                mulherBaixa = nomeVez;
            }
            if (nomeVez == "fim"){
                fim = true;
                qtdPaciente--;
            }

        }

        double media = (double) somaIdadeH / qtdPaciente;

        System.out.println("Quantidade de pacientes: " + qtdPaciente);
        System.out.println("Média de idade dos homens: " + media );
        System.out.println("Quantidade de mulheres com altura entre 1,60 e 1,70 e peso acima de 70kg: " + qtdMulheresE);
        System.out.println("Quantidade de pessoas com idade entre 18 e 25: " + qtdPessoasE);
        System.out.println("Nome do paciente mais velho: " + pacienteVelho);
        System.out.println("Nome da mulher mais baixa: " + mulherBaixa);

        scanner.close();

    }

}
