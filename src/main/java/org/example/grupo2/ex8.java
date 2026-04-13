package org.example.grupo2;

public class ex8 {
    public static void main(String[] args) {
        int numerador = 7;
        int denominador = 5;

        if (denominador == 0){
            System.out.println("Denominador não pode ser 0");
        }

        double numeroReal = (double) numerador / denominador;

        System.out.println("Resultado: " + numeroReal);
    }
}
