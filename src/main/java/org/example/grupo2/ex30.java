package org.example.grupo2;

import java.util.Scanner;

public class ex30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] x1 = new int[4];
        int[] x2 = new int[4];
        int[] y1 = new int[4];
        int[] y2 = new int[4];

        System.out.println("Digite os 4 vértices ");
        for (int i = 0; i < 4; i++){
            x1[i] = sc.nextInt();
            y1[i] = sc.nextInt();
        }

        System.out.println("Digite os 4 vertices do segundo retangulo ");
        for (int i = 0; i < 4; i++){
            x2[i] = sc.nextInt();
            y2[i] = sc.nextInt();
        }

        //Limitar retangulo

        int minX1 = x1[0];
        int maxX1 = x1[0];
        int minY1 = y1[0];
        int maxY1 = y1[0];

        for (int i = 0; i < 4; i++){
            if (x1[i] < minX1) minX1 = x1[i];
            if (x1[i] > maxX1) maxX1 = x1[i];
            if (y1[i] < minY1) minY1 = y1[i];
            if (y1[i] > maxY1) maxY1 = y1[i];
        }

        // limitando segundo retangulo

        int minX2 = x2[0];
        int maxX2 = x2[0];
        int minY2 = y2[0];
        int maxY2 = y2[0];

        for (int i = 0; i < 4; i++){
            if (x2[i] < minX2) minX2 = x2[i];
            if (x2[i] > maxX2) maxX2 = x2[i];
            if (y2[i] < minY2) minY2 = y2[i];
            if (y2[i] > maxY2) maxY2 = y2[i];
        }


        boolean erro = false;

        for (int i = 0; i < 4; i++){
            for (int j = i + 1; j < 4; j++){
                if (x1[i] == x1[j] && y1[i] == y1[j]) erro = true;
                if (x2[i] == x2[j] && y2[i] == y2[j]) erro = true;
            }
        }

        if (erro){
            System.out.println("Vertices sobrepostas");
        }else {
            if (maxX1 < minX2 || maxX2 < minX1 || maxY1 < minY2 || maxY2 < minY1){
                System.out.println("Não há interceptação");
            }else {
                System.out.println("Os retangulos se interceptam");
            }
        }
    }


}
