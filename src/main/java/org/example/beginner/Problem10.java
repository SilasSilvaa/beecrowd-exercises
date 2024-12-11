package org.example.beginner;

import java.util.Scanner;

/*
Leia um valor inteiro correspondente à idade de uma pessoa em dias e informe-a em anos, meses e dias

Obs.: apenas para facilitar o cálculo, considere o ano com 365 dias e o mês com 30 dias.
Nos casos de teste nunca haverá uma situação que permite 12 meses e alguns dias, como 360, 363 ou 364.
Este é apenas um exercício com objetivo de testar raciocínio matemático simples.

Entrada
O arquivo de entrada contém um valor inteiro.

Exemplo de Entrada: 400
Exemplo de Saída: 1 ano(s) | 1 mes(es) | 5 dia(s)

*/

public class Problem10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextInt();

        int[] values = {365, 30, 1};
        int[] result = new int[3];

        for (int i = 0; i < values.length ; i++){
            result[i] = Math.floorDiv(a, values[i]);
            a %= values[i];
        };

        System.out.println(result[0] + " ano(s)");
        System.out.println(result[1] + " mes(es)");
        System.out.println(result[2] + " dia(s)");
    }
}
