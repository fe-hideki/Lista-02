package org.example.grupo2;

import java.util.*;


public class ex42 {

    public static void main(String[] args) {

                Random random = new Random();
                int totalGrupos = 40;
                int numerosPorGrupo = 3;

                for (int i = 1; i <= totalGrupos; i++) {
                    TreeSet<Integer> grupo = new TreeSet<>();
                    while (grupo.size() < numerosPorGrupo) {
                        grupo.add(random.nextInt(60)); // Sorteia de 0 a 59
                    }


                    System.out.println("Grupo " + i + ": " + grupo);
                }






    }

    }
