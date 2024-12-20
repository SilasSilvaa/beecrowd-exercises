package org.example.beginner;

//Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.
//b) a área do círculo de raio C. (pi = 3.14159)
//c) a área do trapézio que tem A e B por bases e C por altura.
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

//Entrada
//O arquivo de entrada contém três valores com um dígito após o ponto decimal.

//Saída
//O arquivo de saída deverá conter 5 linhas de dados. Cada linha corresponde a uma das áreas descritas acima,
// sempre com mensagem correspondente e um espaço entre os dois pontos e o valor.
// O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.

import java.util.Scanner;

public class Problem2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextDouble();
        var b = scanner.nextDouble();
        var c = scanner.nextDouble();


        var pi = 3.14159;

        var triangle = (a * c)/ 2;
        var circle = pi * Math.pow(c, 2);
        var trapeze = ((a + b) * c) /2;
        var square = Math.pow(b, 2);
        var rectangle = a * b;

        System.out.println("TRIANGULO: " + String.format("%.3f", triangle));
        System.out.println("CIRCULO: " + String.format("%.3f", circle));
        System.out.println("TRAPEZIO: " + String.format("%.3f", trapeze));
        System.out.println("QUADRADO: " + String.format("%.3f", square));
        System.out.println("RETANGULO: " + String.format("%.3f", rectangle));
    }
}
