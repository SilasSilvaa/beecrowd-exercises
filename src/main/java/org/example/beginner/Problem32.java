package org.example.beginner;
import java.util.*;

/*
Leia 6 valores. Em seguida, mostre quantos destes valores digitados foram positivos.
Na próxima linha, deve-se mostrar a média de todos os valores positivos digitados, com um dígito após o ponto decimal.

Entrada
A entrada contém 6 números que podem ser valores inteiros ou de ponto flutuante. Pelo menos um destes números será positivo.

Saída
O primeiro valor de saída é a quantidade de valores positivos. A próxima linha deve mostrar a média dos valores positivos digitados.


Exemplo de Entrada
7
-5
6
-3.4
4.6
12
*/


public class Problem32 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        float a = scanner.nextFloat();
        float b = scanner.nextFloat();
        float c = scanner.nextFloat();
        float d = scanner.nextFloat();
        float e = scanner.nextFloat();
        float f = scanner.nextFloat();

        var numberList = List.of(a, b, c, d, e, f);
        float sumPositiveNumbers = 0;
        float positiveNumbersCount = 0;

        for (float number : numberList){
            if(number > 0) {
                sumPositiveNumbers += number;
                positiveNumbersCount += 1;
            }
        }

        System.out.println(String.format("%.0f", positiveNumbersCount) + " valores positivos");
        System.out.println(String.format("%.1f", sumPositiveNumbers / positiveNumbersCount));
    }
}
