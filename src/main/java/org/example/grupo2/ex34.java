package org.example.grupo2;

import java.util.Random;

public class ex34 {
    public static void main(String[] args) {
        Random random = new Random();

        for (int i = 1; i <= 50; i++){
            int numeros = random.nextInt(100) + 1;
            System.out.println(numeros);
        }
    }
}
