/*
 Dados 3 valores, escreva um algoritmo que os informe em uma
  determinada ordem a partir de um menu de opções:

se opção = 1, escreva os 3 valores em ordem crescente
se opção = 2, escreva os 3 valores em ordem decrescente
se opção = 3, escreva os 3 valores de forma que o maior valor fique no meio
 */

import java.util.Scanner;

public class Uni4Exe24 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Valor 1: ");
        double valor1 = teclado.nextDouble();
        System.out.print("Valor 2: ");
        double valor2 = teclado.nextDouble();
        System.out.print("Valor 3: ");
        double valor3 = teclado.nextDouble();

        System.out.println("Selecione uma opção: 1 (crescente), 2 (decrescente), 3 (maior no meio)");
        int opcao = teclado.nextInt();

        switch (opcao) {
            case 1:
                if (valor1 < valor2 && valor2 < valor3) {
                    System.out.println("Os valores em ordem crescente são: ");
                    System.out.print(valor1 + ", ");
                    System.out.print(valor2 + ", ");
                    System.out.print(valor3 + ".");
                }
                if (valor2 < valor1 && valor1 < valor3) {
                    System.out.println(valor2 + ", ");
                    System.out.println(valor1 + ", ");
                    System.out.print(valor3 + ".");
                }
                if (valor3 < valor1 && valor1 < valor2) {
                    System.out.println(valor3 + ", ");
                    System.out.println(valor1 + ", ");
                    System.out.print(valor2 + ".");
                }
                if (valor3 < valor2 && valor2 < valor1) {
                    System.out.println(valor3 + ", ");
                    System.out.println(valor2 + ", ");
                    System.out.print(valor1 + ".");
                }
                if (valor2 < valor3 && valor3 < valor1) {
                    System.out.println(valor2 + ", ");
                    System.out.println(valor3 + ", ");
                    System.out.print(valor1 + ".");
                }

                // break;

                // default:
                // break;
        }

        teclado.close();

    }
}
