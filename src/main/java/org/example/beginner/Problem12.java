package org.example.beginner;

import java.util.Scanner;

/*
Leia 4 valores inteiros A, B, C e D.
A seguir, se B for maior do que C e se D for maior do que A, e a soma de C com D for maior que a soma de A e B e se C e D,
ambos, forem positivos e se a variável A for par escrever a mensagem "Valores aceitos", senão escrever "Valores nao aceitos".

Entrada
Quatro números inteiros A, B, C e D.

Exemplo de Entrada: 5 6 7 8
Exemplo de Saída: Valores nao aceitos
*/

public class Problem12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int d = scanner.nextInt();

        if((b > c) && (d > a) && (c + d) > (a + b) && (c > 0) && (d > 0) && (a % 2 == 0)){
            System.out.println("Valores aceitos");
        }else {
            System.out.println("Valores não aceitos");
        }
    }
}
