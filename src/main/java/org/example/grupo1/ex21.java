package org.example.grupo1;

import java.util.Scanner;

public class ex21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o seu cargo: ");
        String cargo = scanner.nextLine();

        System.out.print("Digite o seu salario: ");
        Double salario = scanner.nextDouble();

        Double emprestimo;

        if (cargo.equals("Diretoria")){
            emprestimo = salario * 0.3;
        } else if (cargo.equals("Operacional")){
            emprestimo = salario * 0.2;
        } else {
            emprestimo = salario * 0.25;
        }

        System.out.println("O seu empréstimo é de: " + emprestimo);

        scanner.close();
    }
}
