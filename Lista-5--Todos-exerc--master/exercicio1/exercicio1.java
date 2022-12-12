package lista5;

import java.util.Scanner;

public class exercicio1 {
    public static void main(String[] args) {
        int n;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Digite um número");
        n = teclado.nextInt();
        teclado.close();
        // 1
        // 2 2
        // 3 3 3
        // 4 4 4 4
        // 5 5 5 5 5
        // n n n n n n...
        imprimeNumeros(n);
    }

    static void imprimeNumeros(int n) {
        int i, l;

        for (i = 1; i <= n; i++) {
            for (l = 0; l < i; l++) {
                System.out.print(i + " ");
            }

            System.out.println(" ");
        }

    }
}
