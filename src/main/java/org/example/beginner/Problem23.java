package org.example.beginner;

import java.util.Scanner;

/*
Leia a hora inicial, minuto inicial, hora final e minuto final de um jogo. A seguir calcule a duração do jogo.

Obs: O jogo tem duração mínima de um (1) minuto e duração máxima de 24 horas.

Entrada
Quatro números inteiros representando a hora de início e fim do jogo.

Saída
Mostre a seguinte mensagem: “O JOGO DUROU XXX HORA(S) E YYY MINUTO(S)” .
*/

public class Problem23 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        var initialHour = scanner.nextInt();
        var initialMinute = scanner.nextInt();

        var finalHour = scanner.nextInt();
        var finalMinute = scanner.nextInt();

        System.out.println(checkGameTime(initialHour, initialMinute, finalHour, finalMinute));

    }

    private static String checkGameTime(int initialHour, int initialMinute, int finalHour, int finalMinute) {
        var initialInMinutes = initialHour * 60 + initialMinute;
        var finalInMinutes = finalHour * 60 + finalMinute;
        int totalInMinutes;

        if (initialInMinutes == finalInMinutes) return "O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)";

        if (initialInMinutes > finalInMinutes) {
            totalInMinutes = (1440 + finalInMinutes) - initialInMinutes;
        } else {
            totalInMinutes = finalInMinutes - initialInMinutes;

        }

        var hours = totalInMinutes / 60;
        var minutes = totalInMinutes % 60;

        return "O JOGO DUROU " + hours + " HORA(S) E " + minutes + " MINUTO(S)";
    }
}