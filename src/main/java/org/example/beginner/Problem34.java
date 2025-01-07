package org.example.beginner;

import java.util.*;

/*Leia 5 valores Inteiros. A seguir mostre quantos valores digitados foram pares,
quantos valores digitados foram ímpares, quantos valores digitados foram positivos e quantos valores digitados foram negativos.

Entrada
O arquivo de entrada contém 5 valores inteiros quaisquer.

Saída
Imprima a mensagem conforme o exemplo fornecido, uma mensagem por linha, não esquecendo o final de linha após cada uma.
*/

public class Problem34 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();
        var d = scanner.nextInt();
        var e = scanner.nextInt();

        var list = List.of(a, b, c, d, e);

        long evenNumber = list.stream().filter(i -> i % 2 == 0).count();
        long oddNumber = list.stream().filter(i -> i % 2 != 0).count();
        long positiveNumbers = list.stream().filter(i -> i > 0).count();
        long negativeNumbers = list.stream().filter(i -> i < 0).count();

        System.out.println(evenNumber + " valor(es) par(es)");
        System.out.println(oddNumber + " valor(es) impar(es)");
        System.out.println(positiveNumbers + " valor(es) positivo(s)");
        System.out.println(negativeNumbers + " valor(es) negativo(s)");
    }
}
