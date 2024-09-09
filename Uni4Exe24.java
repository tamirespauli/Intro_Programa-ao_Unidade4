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
            case 1: // Ordem crescente
                if (valor1 <= valor2 && valor2 <= valor3) {
                    System.out.println("Ordem crescente: " + valor1 + ", " + valor2 + ", " + valor3);
                } else if (valor1 <= valor3 && valor3 <= valor2) {
                    System.out.println("Ordem crescente: " + valor1 + ", " + valor3 + ", " + valor2);
                } else if (valor2 <= valor1 && valor1 <= valor3) {
                    System.out.println("Ordem crescente: " + valor2 + ", " + valor1 + ", " + valor3);
                } else if (valor2 <= valor3 && valor3 <= valor1) {
                    System.out.println("Ordem crescente: " + valor2 + ", " + valor3 + ", " + valor1);
                } else if (valor3 <= valor1 && valor1 <= valor2) {
                    System.out.println("Ordem crescente: " + valor3 + ", " + valor1 + ", " + valor2);
                } else {
                    System.out.println("Ordem crescente: " + valor3 + ", " + valor2 + ", " + valor1);
                }
                break;

            case 2: // Ordem decrescente
                if (valor1 >= valor2 && valor2 >= valor3) {
                    System.out.println("Ordem decrescente: " + valor1 + ", " + valor2 + ", " + valor3);
                } else if (valor1 >= valor3 && valor3 >= valor2) {
                    System.out.println("Ordem decrescente: " + valor1 + ", " + valor3 + ", " + valor2);
                } else if (valor2 >= valor1 && valor1 >= valor3) {
                    System.out.println("Ordem decrescente: " + valor2 + ", " + valor1 + ", " + valor3);
                } else if (valor2 >= valor3 && valor3 >= valor1) {
                    System.out.println("Ordem decrescente: " + valor2 + ", " + valor3 + ", " + valor1);
                } else if (valor3 >= valor1 && valor1 >= valor2) {
                    System.out.println("Ordem decrescente: " + valor3 + ", " + valor1 + ", " + valor2);
                } else {
                    System.out.println("Ordem decrescente: " + valor3 + ", " + valor2 + ", " + valor1);
                }
                break;

            case 3: // Maior no meio
                if ((valor1 >= valor2 && valor1 >= valor3)) {
                    if (valor2 >= valor3) {
                        System.out.println("Maior no meio: " + valor3 + ", " + valor1 + ", " + valor2);
                    } else {
                        System.out.println("Maior no meio: " + valor2 + ", " + valor1 + ", " + valor3);
                    }
                } else if ((valor2 >= valor1 && valor2 >= valor3)) {
                    if (valor1 >= valor3) {
                        System.out.println("Maior no meio: " + valor3 + ", " + valor2 + ", " + valor1);
                    } else {
                        System.out.println("Maior no meio: " + valor1 + ", " + valor2 + ", " + valor3);
                    }
                } else {
                    if (valor1 >= valor2) {
                        System.out.println("Maior no meio: " + valor2 + ", " + valor3 + ", " + valor1);
                    } else {
                        System.out.println("Maior no meio: " + valor1 + ", " + valor3 + ", " + valor2);
                    }
                }
                break;

            default:
                System.out.println("Opção inválida!");
                break;
        }

        teclado.close();
    }
}
