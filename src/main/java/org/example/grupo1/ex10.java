package org.example.grupo1;

import java.util.Scanner;

public class ex10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Insira o valor do salário bruto: ");
        Double salarioBruto = scanner.nextDouble();

        System.out.println("Insira o valor dos descontos: ");
        Double descontos = scanner.nextDouble();

        System.out.println("Insira o valor do salário bruto: ");
        Double valorDoEmprestimo = scanner.nextDouble();

        Double salarioLiquido = salarioBruto - descontos;
        Double valorMaximo = salarioLiquido * 0.3;

        if(valorDoEmprestimo > valorMaximo){
            System.out.println("Você não pode fazer o empréstimo de: " + valorDoEmprestimo);
        } else {
            System.out.println("Você pode fazer o empréstimo de: " + valorDoEmprestimo);
        }

        scanner.close();
    }
}
