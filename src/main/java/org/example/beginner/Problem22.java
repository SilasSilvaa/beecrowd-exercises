package org.example.beginner;

import java.util.Scanner;
/*
Leia a hora inicial e a hora final de um jogo.
A seguir calcule a duração do jogo, sabendo que o mesmo pode começar em um dia e terminar em outro,
tendo uma duração mínima de 1 hora e máxima de 24 horas.

Entrada
A entrada contém dois valores inteiros representando a hora de início e a hora de fim do jogo.

Saída
Apresente a duração do jogo conforme exemplo abaixo.
*/

public class Problem22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var a = scanner.nextInt();
        var b = scanner.nextInt();

        System.out.println(checkGameTime(a, b));

    }
    private static String checkGameTime(int a, int b){
        if(a == b) return "O JOGO DUROU 24 HORA(S)";
        if(a >= 12 ) return "O JOGO DUROU " + ((24 - a) + b) + " HORA(S)";

        return "O JOGO DUROU "+ (-(a - b)) + " HORA(S)";
    }
}
