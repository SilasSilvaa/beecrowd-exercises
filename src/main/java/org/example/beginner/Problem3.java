package org.example.beginner;

import java.util.Scanner;
//Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem
// “eh o maior”. Utilize a fórmula:
//Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo,
//portanto é necessário para chegar no resultado esperado.

//Entrada
//O arquivo de entrada contém três valores inteiros.

//Saída
//Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".

public class Problem3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();

        var x = a > b ? Math.max(a, c) : Math.max(b, c);

        System.out.println(x + " eh o maior");
    }
}
