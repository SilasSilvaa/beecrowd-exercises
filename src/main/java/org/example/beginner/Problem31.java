import java.util.*;

/*
Pedrinho está organizando um evento em sua Universidade.
O evento deverá ser no mês de Abril, iniciando e terminando dentro do mês.
O problema é que Pedrinho quer calcular o tempo que o evento vai durar,
uma vez que ele sabe quando inicia e quando termina o evento.

Sabendo que o evento pode durar de poucos segundos a vários dias,
você deverá ajudar Pedrinho a calcular a duração deste evento.

Entrada
Como entrada, na primeira linha vai haver a descrição “Dia”,
seguido de um espaço e o dia do mês no qual o evento vai começar.
Na linha seguinte, será informado o momento no qual o evento vai iniciar,
no formato hh : mm : ss. Na terceira e quarta linha de entrada haverá outra informação
 no mesmo formato das duas primeiras linhas, indicando o término do evento.


Exemplo de Entrada
Dia 5
08 : 12 : 23
Dia 9
06 : 13 : 23

Saída
Na saída, deve ser apresentada a duração do evento, no seguinte formato:
W dia(s)
X hora(s)
Y minuto(s)
Z segundo(s)

Obs: Considere que o evento do caso de teste para o problema tem duração mínima de 1 minuto.
*/

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var a = scanner.nextLine();
        var b = scanner.nextLine();
        var c = scanner.nextLine();
        var d = scanner.nextLine();

        int initialDay = stringToInt(a, " ", 1);
        int initialHour = stringToInt(b, " : ", 0);
        int initialMinute = stringToInt(b, " : ", 1);
        int initialSeconds = stringToInt(b, " : ", 2);

        int finalDay = stringToInt(c, " ", 1);
        int finalHour = stringToInt(d, " : ", 0);
        int finalMinute = stringToInt(d, " : ", 1);
        int finalSeconds = stringToInt(d, " : ", 2);

        checkTime(initialDay, initialHour, initialMinute, initialSeconds, finalDay, finalHour, finalMinute, finalSeconds);
    }

    private static int stringToInt(String value, String splitChar, int index) {
        return Integer.parseInt(value.split(splitChar)[index]);
    }

    private static void checkTime(int initialDay, int initialHour, int initialMinute, int initialSeconds, int finalDay, int finalHour, int finalMinute, int finalSeconds) {
        var initialDayInSeconds = initialDay * 24 * 3600;
        var finalDayInSeconds = finalDay * 24 * 3600;

        var initialInSeconds = initialDayInSeconds + ((initialHour * 3600) + (initialMinute * 60) + initialSeconds);
        var finalInSeconds = finalDayInSeconds + ((finalHour * 3600) + (finalMinute * 60) + finalSeconds);

        int totalInSeconds = finalInSeconds - initialInSeconds;
        int days = totalInSeconds / 86400;
        totalInSeconds %= 86400;
        int hours = totalInSeconds / 3600;
        totalInSeconds %= 3600;
        int minutes = totalInSeconds / 60;
        totalInSeconds %= 60;
        int seconds = totalInSeconds % 60;

        System.out.println(days + " dia(s)");
        System.out.println(hours + " hora(s)");
        System.out.println(minutes + " minuto(s)");
        System.out.println(seconds + " segundo(s)");
    }
}