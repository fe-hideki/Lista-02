package org.example.grupo3;

public class ex51 {

    public void tribonacci(int n){

        int num1 = 1;
        int num2 = 1;
        int num3 = 2;
        int soma = 0;

        for (int i = 1; i <= n; i++){

            soma = num1 + num2 + num3;

            num1 = num2;
            num2 = num3;
            num3 = soma;

            System.out.println(soma);
        }
    }
}
