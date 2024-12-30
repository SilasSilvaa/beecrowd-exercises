package org.example.beginner;

import java.time.Month;
import java.util.*;

/*Leia um valor inteiro entre 1 e 12, inclusive. Correspondente a este valor,
deve ser apresentado como resposta o mês do ano por extenso, em inglês, com a primeira letra maiúscula.

Entrada
A entrada contém um único valor inteiro.

Saída
Imprima por extenso o nome do mês correspondente ao número existente na entrada, com a primeira letra em maiúscula.
*/

public class Problem28 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var number = scanner.nextInt();
        var month = Month.of(number).toString().toLowerCase();
        System.out.println(month.substring(0, 1).toUpperCase() + month.substring(1).toLowerCase());

    }
}
