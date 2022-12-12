package lista5;

import java.util.Arrays;
import java.util.List;
import java.util.Collections;
import java.util.Scanner;

public class exercicio12 {
    public static String embaralhaPalavra(List<String> embaralharpalavra, String palavradigitada) {
        Collections.shuffle(embaralharpalavra);
        StringBuilder saida = new StringBuilder(palavradigitada.length());

        saida.append("A palavra digitada embaralhada fica assim: ");

        for (String a : embaralharpalavra) {
            saida.append(a);
        }

        return saida.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Digite alguma palavra: ");
        String palavra = sc.nextLine();
        List<String> embaralhar = Arrays.asList(palavra.split(""));
        System.out.println(embaralhaPalavra(embaralhar, palavra));
        sc.close();
    }
}

/*
 * Embaralha palavra. Construa uma função que receba uma string como parâmetro e
 * devolva outra string com os carateres embaralhados. Por exemplo: se função
 * receber a palavra python, pode retornar npthyo, ophtyn ou qualquer outra
 * combinação possível, de forma aleatória. Padronize em sua função que todos os
 * caracteres serão devolvidos em caixa alta ou caixa baixa, independentemente
 * de como foram digitados.
 * 
 */
