package org.example.grupo4;

import java.math.BigInteger;

public class ex49 {
    public static void main(String[] args) {
        BigInteger numero = BigInteger.valueOf(1);
        BigInteger numeroAnterior = BigInteger.valueOf(1);
        BigInteger numeroAuxiliar;

        System.out.println(1);
        for (int i = 1; i < 50; i++){
            System.out.println(numero);
            numeroAuxiliar = numero;
            numero = numero.add(numeroAnterior);
            numeroAnterior = numeroAuxiliar;
        }
    }
}
