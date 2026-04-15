package org.example.grupo2;

import java.util.*;


public class ex42 {

    public static void main(String[] args) {

                Random random = new Random();
                int totalGrupos = 40;

                for (int i = 1; i <= totalGrupos; i++) {

                    int n1;
                    int n2;
                    int n3;

                    n1 = random.nextInt(60);

                    do {
                        n2 = random.nextInt(60);
                    } while (n2 == n1);

                    do {
                        n3 = random.nextInt(60);
                    }while (n3 == n1 || n3 == n2);

                   int ordenar;
                   if (n1 > n2){
                       ordenar = n1;
                       n1 = n2;
                       n2 = ordenar;
                   }

                   if (n1 > n3){
                       ordenar = n1;
                       n1 = n3;
                       n3 = ordenar;
                   }

                   if (n2 > n3){
                       ordenar = n2;
                       n2 = n3;
                       n3 = ordenar;
                   }



                    System.out.println("Grupo " + i + ": " + n1 + " " + n2 + " " + n3);
                }






    }

    }
