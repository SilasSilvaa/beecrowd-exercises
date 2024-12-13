package org.example.beginner;

import java.util.Scanner;

/*
Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
A seguir, calcule e mostre o valor da conta a pagar.

Codigo | Especificação   | Preço
  1    | Cachorro quente | R$ 4.00
  2    | X-Salada        | R$ 4.50
  3    | X-Bacon         | R$ 5.00
  4    | Torrada Simples | R$ 2.00
  5    | Refrigerante    | R$ 1.50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal.
*/

public class Problem15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int option = scanner.nextInt();
        int quantity = scanner.nextInt();

        switch (option) {
            case 1: {
                System.out.println("Total: R$ " + String.format("%.2f", (4.00 * quantity)));
                break;
            }
            case 2: {
                System.out.println("Total: R$ " + String.format("%.2f", 4.50 * quantity));
                break;
            }
            case 3: {
                System.out.println("Total: R$ " + String.format("%.2f", 5.00 * quantity));
                break;
            }
            case 4: {
                System.out.println("Total: R$ " + String.format("%.2f", 2.00 * quantity));
                break;
            }
            case 5: {
                System.out.println("Total: R$ " + String.format("%.2f", 1.50 * quantity));
                break;
            }
            default: {
                System.out.println("Digite um valor valido");
            }
        }
    }
}
