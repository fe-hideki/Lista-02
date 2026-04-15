package org.example.grupo3;

import java.util.Scanner;

public class ex55 {

    public void planoVaiVai() {

        Scanner scanner = new Scanner(System.in);

        double saldoMinGeral = 100.0;
        double saldoMinVaiVai = 50.0;
        double valorExcedente = 0.0;
        String continuar;

        do {
            System.out.print("Tipo de ligação \n" +
                    "o: Outras \n" +
                    "v: Vai-Vai \n" +
                    "f: Fixo \n");
            String tipo = scanner.next().toLowerCase();

            System.out.println("Quantidade de minutos: ");
            double minGastos = scanner.nextDouble();

            double consumoReal = minGastos;

            if (tipo == "f") {
                consumoReal = minGastos / 2;
            }

            if (tipo == "v") {

                if (saldoMinVaiVai >= consumoReal) {
                    saldoMinVaiVai -= consumoReal;
                } else {
                    double sobra = consumoReal - saldoMinVaiVai;
                    saldoMinVaiVai = 0;
                    if (saldoMinGeral >= sobra) {
                        saldoMinGeral -= sobra;
                    } else {
                        double excedente = sobra - saldoMinGeral;
                        saldoMinGeral = 0;
                        valorExcedente += excedente * 0.20;
                    }
                }
            } else {
                if (saldoMinGeral >= consumoReal) {
                    saldoMinGeral -= consumoReal;
                } else {
                    double excedente = consumoReal - saldoMinGeral;
                    saldoMinGeral = 0;
                    valorExcedente += excedente * 0.65;
                }
            }

            System.out.printf("Saldo Restante: Geral: %.1f min | Vai-Vai: %.1f min%n \n ", saldoMinGeral, saldoMinVaiVai);
            System.out.printf("Valor atual a pagar (Mensalidade + Excedentes): R$ %.2f%n \n", (50.0 + valorExcedente));

            System.out.print("Deseja inserir outra ligação? (s/n): ");
            continuar = scanner.next().toLowerCase();

        } while (continuar == "s");

        scanner.close();
    }
}
