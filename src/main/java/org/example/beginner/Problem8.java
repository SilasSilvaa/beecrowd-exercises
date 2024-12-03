package org.example.beginner;

import java.util.Scanner;

//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto.
// As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a relação de notas necessárias.

//Entrada
//O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

//Saída
//Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido.
// Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”.

//Exemplo de Entrada: 576
//Exemplo de Saída:
//5 nota(s) de R$ 100,00
//1 nota(s) de R$ 50,00
//1 nota(s) de R$ 20,00
//0 nota(s) de R$ 10,00
//1 nota(s) de R$ 5,00
//0 nota(s) de R$ 2,00
//1 nota(s) de R$ 1,00


public class Problem8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var typedValue = scanner.nextInt();
        var value = typedValue;
        int[] numbers = {100, 50, 20, 10, 5, 2, 1};
        int[] notes = new int[7];

        for(int i = 0; i < numbers.length; i++){
            notes[i] = Math.floorDiv(typedValue, numbers[i]);
            typedValue %= numbers[i];
        }

        System.out.println(value);
        System.out.println(notes[0] + " nota(s) de R$ 100,00");
        System.out.println(notes[1] + " nota(s) de R$ 50,00");
        System.out.println(notes[2] + " nota(s) de R$ 20,00");
        System.out.println(notes[3] + " nota(s) de R$ 10,00");
        System.out.println(notes[4] + " nota(s) de R$ 5,00");
        System.out.println(notes[5] + " nota(s) de R$ 2,00");
        System.out.println(notes[6] + " nota(s) de R$ 1,00");
    }
}
