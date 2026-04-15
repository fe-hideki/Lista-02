package org.example.grupo1;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

public class ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu ano de nascimento: ");
        Integer anoNascimento = scanner.nextInt();

        System.out.println("Digite o ano atual: ");
        Integer anoAtual = scanner.nextInt();

        Integer idade = anoAtual - anoNascimento;

        System.out.println("Sua idade é: " + idade);

        scanner.close();

    }




}
