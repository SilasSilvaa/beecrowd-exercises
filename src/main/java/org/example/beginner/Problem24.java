package org.example.beginner;

import java.util.Scanner;

/*
A empresa ABC resolveu conceder um aumento de salários a seus funcionários de acordo com a tabela abaixo:

    Salário	            Percentual de Reajuste
    0 - 400.00                  15%
   400.01 - 800.00              12%
   800.01 - 1200.00             10%
   1200.01 - 2000.00            7%
   Acima de 2000.00             4%

Leia o salário do funcionário e calcule e mostre o novo salário, bem como o valor de reajuste ganho e o índice reajustado, em percentual.

Entrada
A entrada contém apenas um valor de ponto flutuante, com duas casas decimais.

Saída
Imprima 3 linhas na saída: o novo salário, o valor ganho de reajuste (ambos devem ser apresentados com 2 casas decimais) e o percentual de reajuste ganho, conforme exemplo abaixo.
*/

public class Problem24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var salary = scanner.nextDouble();

        calculateAdjustment(salary);
    }

    private static void calculateAdjustment(double salary){
        double percentage;

        if(salary >= 0 && salary <= 400){
            percentage = 0.15;
        } else if (salary > 400 && salary <= 800) {
            percentage = 0.12;
        } else if (salary > 800 && salary <= 1200) {
            percentage = 0.10;
        } else if (salary > 1200 && salary <= 2000) {
            percentage = 0.07;
        }else {
            percentage = 0.4;
        }

        double adjustment = salary * percentage;
        double newSalary = salary + adjustment;

        System.out.println("Novo salario: " + String.format("%.2f", newSalary));
        System.out.println("Reajuste ganho: " + String.format("%.2f", adjustment));
        System.out.println("Em percentual: " + String.format("%.0f", percentage * 100) + " %" );
    }
}
