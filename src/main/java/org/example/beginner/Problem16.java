package org.example.beginner;

import java.util.Scanner;

/*
Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno.
Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "average: ".
Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.".
Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.".
Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno.
Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada.
Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2).
e imprima a mensagem "Aluno aprovado." (caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.",
(caso a média tenha ficado 4.9 ou menos).
Para estes dois casos (aprovado ou reprovado após ter pego exame)
apresente na última linha uma mensagem "average final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal.
As mensagens devem ser impressas conforme a descrição do problema.
Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error".
*/

public class Problem16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextDouble(); // 2
        var b = scanner.nextDouble(); // 3
        var c = scanner.nextDouble(); // 4
        var d = scanner.nextDouble(); // 1

        var average = Math.floor((a * 2) + (b * 3) + (c * 4) + (d * 1)) / 10;

        if(average >= 7.0){
            System.out.println("Media: " + String.format("%.1f",average));
            System.out.println("Aluno aprovado.");
        }else if (average >= 5.0 && average <= 6.9) {
            var e = scanner.nextDouble();
            var finalAverage = (average + e) / 2;

            if(finalAverage >= 5.0){
                System.out.println("Media: " + String.format("%.1f",average));
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame: " + e);
                System.out.println("Aluno aprovado.");
                System.out.println("Media final: " + String.format("%.1f",finalAverage));
            }else {
                System.out.println("Media: " + average);
                System.out.println("Aluno em exame.");
                System.out.println("Nota do exame: " + e);
                System.out.println("Aluno reprovado.");
                System.out.println("Media final: " + String.format("%.1f",finalAverage));
            }

        }else {
            System.out.println("Media: " + String.format("%.1f", average));
            System.out.println("Aluno reprovado.");
        }
    }
}
