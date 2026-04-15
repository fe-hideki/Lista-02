package org.example.grupo4;

import java.math.BigInteger;
import java.util.Scanner;

public class ex50 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int n = Integer.parseInt(scanner.nextLine());

        BigInteger numero = BigInteger.valueOf(1);
        BigInteger numeroAnterior = BigInteger.valueOf(1);
        BigInteger numeroAuxiliar;

        for (int i = 2; i < n; i++){
            numeroAuxiliar = numero;
            numero = numero.add(numeroAnterior);
            numeroAnterior = numeroAuxiliar;
        }
        System.out.println(numero);
    }
}
