package org.example.beginner;

import java.util.Scanner;

/*
Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano.
A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).

Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

Entrada
A entrada contem as coordenadas de um ponto.

Saída
A saída deve apresentar o quadrante em que o ponto se encontra.
*/

public class Problem17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var x = scanner.nextDouble();
        var y = scanner.nextDouble();

        System.out.println(determineLocation(x, y));
    }

    private static String determineLocation(double x, double y) {
        if (x == 0 && y == 0) return "Origem";
        if (x == 0) return "Eixo Y";
        if (y == 0) return "Eixo X";
        if (x > 0 && y > 0) return "Q1";
        if (x < 0 && y > 0) return "Q2";
        if (x < 0 && y < 0) return "Q3";
        return "Q4";
    }
}
