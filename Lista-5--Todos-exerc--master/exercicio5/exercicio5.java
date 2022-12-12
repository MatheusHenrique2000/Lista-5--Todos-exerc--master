package lista5;

import java.util.Scanner;

public class exercicio5 {
    /*
     * Faça um programa com uma função chamada somaImposto. A função possui dois
     * parâmetros formais: taxaImposto, que é a quantia de imposto sobre vendas
     * expressa em porcentagem e custo, que é o custo de um item antes do imposto. A
     * função “altera” o valor de custo para incluir o imposto sobre vendas.
     */
    public static void main(String[] args) {
        double preço_do_produto;
        double imposto_sobre_o_produto;
        double preço_total_com_imposto;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Qual é o valor do produto ?");
        preço_do_produto = entrada.nextDouble();
        System.out.println(" Qual a porcentagem do imposto sobre o produto ?");
        imposto_sobre_o_produto = entrada.nextDouble();
        entrada.close();
        preço_total_com_imposto = somaImposto(imposto_sobre_o_produto, preço_do_produto);
        System.out.println(" O preço do produto com o imposto é R$: " + preço_total_com_imposto);

    }

    public static double somaImposto(double taxaImposto, double custo) {
        double porcentagem = taxaImposto / 100;
        return custo + (custo * porcentagem);
    }
}
