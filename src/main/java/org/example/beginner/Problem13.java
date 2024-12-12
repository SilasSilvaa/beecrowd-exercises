package org.example.beginner;

import java.util.Scanner;

/*
Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara.
Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”,
caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular".
Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo.
Imprima sempre o final de linha após cada mensagem.

Exemplos de Entrada:
10.0 20.1 5.1

Exemplos de Saída:
R1 = -0.29788
R2 = -1.71212

*/

public class Problem13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();

        var delta = Math.pow(b, 2) - (4 * a * c);
        var r1 = (-b + Math.sqrt(delta)) / (2 * a);
        var r2 = (-b - Math.sqrt(delta)) / (2 * a);

        if(delta < 0 || (-b + Math.sqrt(delta) == 0)){
            System.out.println("Impossivel calcular");
            return;
        }

        System.out.println("R1 = " + String.format("%.5f", r1));
        System.out.println("R2 = " + String.format("%.5f", r2));
    }
}
