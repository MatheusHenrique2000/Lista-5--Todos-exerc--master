package lista5;

import java.util.Scanner;

public class exercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println(" Digite as horas: ");
        int horas = teclado.nextInt();
        System.out.println(" Digite os minutos: ");
        int minutos = teclado.nextInt();
        teclado.close();

        if (horas > 12) {
            horas = horas - 12;
            System.out.println(horas + ":" + minutos + " P.M ");
        } else {
            System.out.println(horas + ":" + minutos + " A.M ");
        }
    }

}

/*
 * Faça um programa que converta da notação de 24 horas para a notação de 12
 * horas. Por exemplo, o programa deve converter 14:25 em 2:25 P.M. A entrada é
 * dada em dois inteiros. Deve haver pelo menos duas funções: uma para fazer a
 * conversão e uma para a saída. Registre a informação A.M./P.M. como um valor
 * ‘A’ para A.M. e ‘P’ para P.M. Assim, a função para efetuar as conversões terá
 * um parâmetro formal para registrar se é A.M. ou P.M. Inclua um loop que
 * permita que o usuário repita esse cálculo para novos valores de entrada todas
 * as vezes que desejar.
 */