package org.example.beginner;

/*
Leia 3 valores de ponto flutuante A, B e C e ordene-os em ordem decrescente, de modo que o lado A representa o maior dos 3 lados.
A seguir, determine o tipo de triângulo que estes três lados formam, com base nos seguintes casos, sempre escrevendo uma mensagem adequada:

se A ≥ B+C, apresente a mensagem: NAO FORMA TRIANGULO
se A2 = B2 + C2, apresente a mensagem: TRIANGULO RETANGULO
se A2 > B2 + C2, apresente a mensagem: TRIANGULO OBTUSANGULO
se A2 < B2 + C2, apresente a mensagem: TRIANGULO ACUTANGULO
se os três lados forem iguais, apresente a mensagem: TRIANGULO EQUILATERO
se apenas dois dos lados forem iguais, apresente a mensagem: TRIANGULO ISOSCELES
Entrada
A entrada contem três valores de ponto flutuante de dupla precisão A (0 < A) , B (0 < B) e C (0 < C).

Saída
Imprima todas as classificações do triângulo especificado na entrada.
*/

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Problem21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextFloat();
        var b = scanner.nextFloat();
        var c = scanner.nextFloat();

        List<Float> listNumbers = new ArrayList<>();
        listNumbers.add(a);
        listNumbers.add(b);
        listNumbers.add(c);

        listNumbers.sort(Collections.reverseOrder());
        triangleType(listNumbers);
    }

    private static void triangleType(List<Float> listNumbers) {
        var a = listNumbers.get(0);
        var b = listNumbers.get(1);
        var c = listNumbers.get(2);

        var aElevated = Math.pow(a, 2);
        var bAndCElevated = Math.pow(b, 2) + Math.pow(c, 2);

        if (a >= b + c) {
            System.out.println("NAO FORMA TRIANGULO");
        } else {
            if (aElevated == bAndCElevated) System.out.println("TRIANGULO RETANGULO");
            if (aElevated > bAndCElevated) System.out.println("TRIANGULO OBTUSANGULO");
            if (aElevated < bAndCElevated) System.out.println("TRIANGULO ACUTANGULO");
            if (a.equals(b) && b.equals(c)) {
                System.out.println("TRIANGULO EQUILATERO");
            } else if (a.equals(b) || b.equals(c) || a.equals(c)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
        }
    }
}
