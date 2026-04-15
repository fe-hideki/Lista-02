package org.example.grupo2;

import java.util.Scanner;

public class ex29 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o x1");
        int x1 = sc.nextInt();

        System.out.println("Digite o y1");
        int y1 = sc.nextInt();
        
        System.out.println("Digite o x2");
        int x2 = sc.nextInt();

        System.out.println("Digite o y2");
        int y2 = sc.nextInt();
        
        if (x1 != 2 && y1 != 2){
            System.out.println("Forma um retangulo");
            
            int base = x2-x1;
            int altura = y1 - y2;
            int area = base * altura;

            System.out.println("Área: " + area);

            System.out.println("Digite o x do ponto");
            int xp = sc.nextInt();

            System.out.println("Diigte o y do ponto");
            int yp = sc.nextInt();
            
            if (xp > x1 && xp < x2 && yp < y1 && yp > y2){
                System.out.println("Dentro do retângulo");
            } else if ((xp == x1 || xp == x2) && yp <= y1 && yp >= y2 ||
                    (yp == y1 || yp == y2) && xp >= x1 && xp <= x2) {
                System.out.println("Na linha do retângulo");
            } else if (xp < x1 && xp > y1) {
                System.out.println("Em cima na esquerda");
            } else if (xp > x1 && xp > y1) {
                System.out.println("Em cima na direita");
            } else if (xp < x1 && xp < y1) {
                System.out.println("Embaixo na esquerda");
            } else if (xp > x1 && xp < y1) {
                System.out.println("Embaixo na direita");
            } else if (yp > y1) {
                System.out.println("Em cima");
            } else if (yp < y2) {
                System.out.println("Embaixo");
            } else if (xp > x1) {
                System.out.println("Esquerda");
            } else if (xp > x2) {
                System.out.println("Direita");
            } else if (x1 == x2 && y1 == y2) {
                System.out.println("É um ponto");

            } else if (y1 == y2) {
                System.out.println("É uma reta");
            }else {
                System.out.println("É uma reta vertical");
            }

        }
    }
}
