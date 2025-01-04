package org.example.beginner;

import java.util.*;

/*
Faça um programa que leia 6 valores.
Estes valores serão somente negativos ou positivos (desconsidere os valores nulos).
A seguir, mostre a quantidade de valores positivos digitados.

Entrada
Seis valores, negativos e/ou positivos.

Saída
Imprima uma mensagem dizendo quantos valores positivos foram lidos.
*/

public class Problem30 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float num1 = scanner.nextFloat();
        float num2 = scanner.nextFloat();
        float num3 = scanner.nextFloat();
        float num4 = scanner.nextFloat();
        float num5 = scanner.nextFloat();
        float num6 = scanner.nextFloat();
        int quantity = 0;

        var listNumbers = List.of(num1, num2, num3, num4, num5, num6);

        for(float num : listNumbers ){
            if(num > 0){
                quantity += 1;
            }
        }
        System.out.println(quantity + " valores positivos");
    }
}
