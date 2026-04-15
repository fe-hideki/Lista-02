package org.example.grupo4;

import java.util.Scanner;

public class ex56 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro candidato: ");
        String candidatoA = scanner.nextLine();

        System.out.print("Digite o nome do segundo candidato: ");
        String candidatoB = scanner.nextLine();

        System.out.print("Digite o nome do terceiro candidato: ");
        String candidatoC = scanner.nextLine();

        int opcao = 0;
        int votosCandidatoA = 0;
        int votosCandidatoB = 0;
        int votosCandidatoC = 0;
        int votosBrancos = 0;
        int votosTotal = 0;

        eleicaoLoop:
        while (true) {
            System.out.println("Digite o número correspondente ao seu candidato");
            System.out.println("1 - " + candidatoA);
            System.out.println("2 - " + candidatoB);
            System.out.println("3 - " + candidatoC);
            System.out.println("4 - branco");
            System.out.println("5 - sair");
            System.out.println();

            opcao = Integer.parseInt(scanner.nextLine());

            switch (opcao) {
                case 1:
                    votosCandidatoA++;
                    break;
                case 2:
                    votosCandidatoB++;
                    break;
                case 3:
                    votosCandidatoC++;
                    break;
                case 4:
                    votosBrancos++;
                    break;
                case 5:
                    break eleicaoLoop;
                default:
                    System.out.println("Digite uma opção válida");

            }
            votosTotal = votosCandidatoA + votosCandidatoB + votosCandidatoC + votosBrancos;
            if (votosTotal == 0) {
                System.out.println("Não houve votos válidos suficientes");
            }
            else {
                System.out.println(candidatoA + " Votos: " + votosCandidatoA + " " +
                        ((double)votosCandidatoA / (double)votosTotal) * 100 + "%");
                System.out.println(candidatoB + " Votos: " + votosCandidatoB + " " +
                        ((double)votosCandidatoB / (double)votosTotal) * 100 + "%");
                System.out.println(candidatoC + " Votos: " + votosCandidatoC + " " +
                        ((double)votosCandidatoC / (double)votosTotal) * 100 + "%");
                System.out.println("Branco Votos: " + votosBrancos + " " +
                        ((double)votosBrancos / (double)votosTotal) * 100 + "%");
            }
        }
        if (votosCandidatoA > votosCandidatoB && votosCandidatoA > votosCandidatoC){
            System.out.println("O candidato " + candidatoA + " está eleito");
        }
        else if (votosCandidatoB > votosCandidatoA && votosCandidatoB > votosCandidatoC){
            System.out.println("O candidato " + candidatoB + " está eleito");
        }
        else if (votosCandidatoC > votosCandidatoA && votosCandidatoC > votosCandidatoB){
            System.out.println("O candidato " + candidatoC + " está eleito");
        }
        else {
            System.out.println("Houve um empate");
        }
        System.out.println();
    }
}
