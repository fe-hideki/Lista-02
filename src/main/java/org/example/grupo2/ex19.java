package org.example.grupo2;

import java.util.Scanner;

public class ex19 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();

        if (n1 > n2){
            System.out.println(n2 + " " + n1);
        }else {
            System.out.println(n1 + " " + n2);
        }
    }



}
