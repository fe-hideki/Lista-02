package org.example.grupo4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Integer> numeros = new ArrayList<>();
        Integer novoNumero;

        for (int i = 0; i < 100; i++) {
            System.out.print("Digite um número inteiro: ");
            novoNumero = Integer.parseInt(scanner.nextLine());

            if (numeros.isEmpty()) {
                numeros.add(novoNumero);
            }
            else if (numeros.size() == 1) {
                if (novoNumero <= numeros.getFirst()){
                    numeros.add(1, novoNumero);
                }
                else {
                    numeros.add(novoNumero);
                }
            }
            else {
                for (int j = 0; j < numeros.size(); j++) {
                    if (j == numeros.size() - 1) {
                        numeros.add(novoNumero);
                        break;
                    }
                    else if (novoNumero <= numeros.get(j)) {
                        numeros.add(j, novoNumero);
                        break;
                    }
                    else if (numeros.get(j) < novoNumero && novoNumero <= numeros.get(j + 1)) {
                        numeros.add(j + 1, novoNumero);
                        break;
                    }
                }
            }
        }
        System.out.println("O maior número é: " + numeros.getLast());
    }
}
