package org.example.beginner;

import java.util.Scanner;

/*
Leia um valor inteiro X. Em seguida apresente os 6 valores ímpares consecutivos a partir de X, um valor por linha, inclusive o X ser for o caso.

Entrada
A entrada será um valor inteiro positivo.

Saída
A saída será uma sequência de seis números ímpares.
*/

public class Problem36 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var x = scanner.nextInt();
        var y = 6;

        while (y != 0){
            if(x % 2 !=0){
                System.out.println(x);
                y--;
            }
            x += 1;
        }
    }
}
