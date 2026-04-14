package org.example.grupo3;

public class ex39 {

    public boolean numPerfeito(int i){

        int soma = 0;
        boolean perfeito;

        for(int j = 0; j < i; j++){

            if (i % j == 0) {
                soma += j;
            }

        }

        if(soma == i){
            perfeito = true;
        }
        else{
            perfeito = false;
        }

        return perfeito;

    }

}
