package lista5;

import java.util.Scanner;

public class exercicio4 {
    /*
     * Faça um programa, com uma função que necessite de um argumento.
     * A função retorna o valor de caractere ‘P’, se seu argumento for positivo, e
     * ‘N’, se seu argumento
     * for zero ou negativo.
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Por favor, entre com um argumento: ");
        double a = teclado.nextDouble();
        System.out.println(P_ou_N(a));
        teclado.close();

    }

    public static String P_ou_N(double a) {
        String b;
        if (a <= 0) {
            b = "N";
        } else {
            b = "P";
        }
        return b;

    }

}
