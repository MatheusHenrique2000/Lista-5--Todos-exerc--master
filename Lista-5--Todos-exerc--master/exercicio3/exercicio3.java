package lista5;

import java.util.Scanner;

public class exercicio3 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Por favor, entre com o primeiro argumento:");
        double argumento1 = entrada.nextDouble();
        System.out.println("Por favor, entre com o segundo argumento");
        double argumento2 = entrada.nextDouble();
        System.out.println("Por favor, entre com o terceiro argumento");
        double argumento3 = entrada.nextDouble();
        entrada.close();
        double resultadoSoma = somar(argumento1, argumento2, argumento3);
        System.out.println(resultadoSoma);

    }

    public static double somar(double argumento1, double argumento2, double argumento3) {
        return (argumento1 + argumento2 + argumento3);
    }
}
/*
 * Faça um programa, com uma função que necessite de três argumentos, e que
 * forneça a
 * soma desses três argumentos.
 */