package org.example.beginner;

import java.util.*;

/*
Leia 3 valores inteiros e ordene-os em ordem crescente.
No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência como foram lidos.

Entrada
A entrada contem três números inteiros.

Saída
Imprima a saída conforme foi especificado.

Exemplo de Entrada: 7 21 -14

Exemplo de Saída: -14 7 21   7 21 -14
*/

public class Problem18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();
        var c = scanner.nextInt();

        List<Integer> list = new ArrayList<>();
        list.add(a);
        list.add(b);
        list.add(c);

        Collections.sort(list);
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
        System.out.println();
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
