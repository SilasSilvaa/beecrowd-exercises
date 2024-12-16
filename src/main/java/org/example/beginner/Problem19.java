package org.example.beginner;

import java.util.Scanner;

/*
Leia 3 valores reais (A, B e C) e verifique se eles formam ou não um triângulo.
Em caso positivo, calcule o perímetro do triângulo e apresente a mensagem:

Perimetro = XX.X

Em caso negativo, calcule a área do trapézio que tem A e B como base e C como altura, mostrando a mensagem

Area = XX.X

Entrada
A entrada contém três valores reais.

Saída
O resultado deve ser apresentado com uma casa decimal.

*/

public class Problem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextFloat();
        var b = scanner.nextFloat();
        var c = scanner.nextFloat();

        boolean isTriangle = (a + b) > c && (a + c) > b && (b + c) > a;
        var perimeter = a + b + c;
        var area = ((a + b) * c) / 2;

        if(isTriangle){
            System.out.println("Perimetro = " + perimeter);
        }else {
            System.out.println("Area = " + area);
        }
    }
}
