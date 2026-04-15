package org.example.grupo3;

import java.util.Scanner;

public class ex54 {

    public void conversao(){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor inicial: ");
        Double valorInicial = scanner.nextDouble();

        System.out.println("Digite o valor final: ");
        Double valorFinal = scanner.nextDouble();

        System.out.println("Digite o valor do incremento: ");
        Double valorIncremento = scanner.nextDouble();

        System.out.println("Digite o valor de 1 dolar");
        Double valorDolar = scanner.nextDouble();

        for (double reais = valorInicial; reais <= valorFinal; reais += valorIncremento) {
            double dolares = reais / valorDolar;

            System.out.printf("R$ %12.2f | $ %12.2f%n", reais, dolares);
        }
        scanner.close();
    }
}
