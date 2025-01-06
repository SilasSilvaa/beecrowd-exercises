package org.example.beginner;

import java.util.*;

/*
Faça um programa que leia 5 valores inteiros. Conte quantos destes valores digitados são pares e mostre esta informação.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, indicando a quantidade de valores pares lidos.

*/

public class Problem33 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var d = scanner.nextInt();
        var e = scanner.nextInt();

        var count = 0;

        var list = List.of(a, b, c, d, e);
        for (int i : list){
            if(i % 2 == 0){
                count += 1;
            }
        }

        System.out.println(count + " valores pares");
    }
}
