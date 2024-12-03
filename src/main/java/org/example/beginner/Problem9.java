package org.example.beginner;

import java.util.Scanner;

//Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica,
//e informe-o expresso no formato horas:minutos:segundos.

//Entrada
//O arquivo de entrada contém um valor inteiro N.

//Saída
//Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

//Exemplo de Entrada: 556

// Exemplo de Saída: 0:9:16

public class Problem9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var value = scanner.nextInt();

        int seconds = value % 60;
        int hour = value / 60;
        int minutes = hour % 60;
        hour /= 60;

        System.out.println(hour + ":" + minutes + ":" + seconds);
    }
}
