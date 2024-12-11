package org.example.beginner;

import java.math.BigDecimal;
import java.util.Scanner;

/*
Leia um valor de ponto flutuante com duas casas decimais. Este valor representa um valor monetário.
A seguir, calcule o menor número de notas e moedas possíveis no qual o valor pode ser decomposto.
As notas consideradas são de 100, 50, 20, 10, 5, 2. As moedas possíveis são de 1, 0.50, 0.25, 0.10, 0.05 e 0.01.
A seguir mostre a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor de ponto flutuante N (0 ≤ N ≤ 1000000.00).

Saída
Imprima a quantidade mínima de notas e moedas necessárias para trocar o valor inicial, conforme exemplo fornecido.

Obs: Utilize ponto (.) para separar a parte decimal.
*/

public class Problem11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextBigDecimal();

        double[] values = {100, 50, 20, 10, 5, 2, 1, 0.50, 0.25, 0.10, 0.05, 0.01};
        BigDecimal[] result = new BigDecimal[12];

        for (int i = 0; i < values.length ; i++){
            result[i] = a.divideToIntegralValue(BigDecimal.valueOf(values[i]));
            a = a.remainder(BigDecimal.valueOf(values[i]));
        };

        System.out.println("NOTAS:");
        System.out.println(String.format("%.0f", result[0]) + " nota(s) de R$ 100.00");
        System.out.println(String.format("%.0f", result[1]) + " nota(s) de R$ 50.00");
        System.out.println(String.format("%.0f", result[2]) + " nota(s) de R$ 20.00");
        System.out.println(String.format("%.0f", result[3]) + " nota(s) de R$ 10.00");
        System.out.println(String.format("%.0f", result[4]) + " nota(s) de R$ 5.00");
        System.out.println(String.format("%.0f", result[5]) + " nota(s) de R$ 2.00");

        System.out.println("MOEDAS:");
        System.out.println(String.format("%.0f", result[6]) + " moeda(s) de R$ 1.00");
        System.out.println(String.format("%.0f", result[7]) + " moeda(s) de R$ 0.50");
        System.out.println(String.format("%.0f", result[8]) + " moeda(s) de R$ 0.25");
        System.out.println(String.format("%.0f", result[9]) + " moeda(s) de R$ 0.10");
        System.out.println(String.format("%.0f", result[10]) + " moeda(s) de R$ 0.05");
        System.out.println(String.format("%.0f", result[11]) + " moeda(s) de R$ 0.01");
    }
}
