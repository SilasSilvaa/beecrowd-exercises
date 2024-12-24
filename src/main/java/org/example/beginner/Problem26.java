package org.example.beginner;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/*
Leia um número inteiro que representa um código de DDD para discagem interurbana. Em seguida, informe à qual cidade o DDD pertence, considerando a tabela abaixo:

    61  Brasilia
    71  Salvador
    11  Sao Paulo
    21  Rio de Janeiro
    32  Juiz de fora
    19  Campinas
    27  Vitoria
    31  Belo Horizonte

Se a entrada for qualquer outro DDD que não esteja presente na tabela acima, o programa deverá informar:
DDD nao cadastrado

Entrada
A entrada consiste de um único valor inteiro.

Saída
Imprima o nome da cidade correspondente ao DDD existente na entrada. Imprima DDD nao cadastrado caso não existir DDD correspondente ao número digitado.
 */


public class Problem26 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Map<Integer, String> map = new HashMap<>();

        map.put(61, "Brasilia");
        map.put(71, "Salvador");
        map.put(11, "Sao Paulo");
        map.put(21, "Rio de Janeiro");
        map.put(32, "Juiz de Fora");
        map.put(19, "Campinas");
        map.put(27, "Vitoria");
        map.put(31, "Belo Horizonte");

        int value = scanner.nextInt();
        if(map.get(value) != null){
            System.out.println(map.get(value));
        }else {
            System.out.println("DDD nao cadastrado");
        }
    }
}
