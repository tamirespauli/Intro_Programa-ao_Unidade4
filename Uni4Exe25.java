/* 
Faça um algoritmo que escreva o menu abaixo, 
leia uma opção do usuário e execute a operação
correspondente. O algoritmo deve exibir uma mensagem
de erro se a opção for inválida. O menu tem as seguintes opções:
Escolha uma opção:
1 - Soma de dois números.
2 - Diferença entre dois números.
3 - Produto entre dois números.
4 - Divisão entre dois números (o denominador não pode ser zero).
 */

import java.util.Scanner;

public class Uni4Exe25 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ecreva dois numeros: ");
        double numero1 = teclado.nextDouble();
        double numero2 = teclado.nextDouble();
        System.out.println("escolha uma opção: 1 (Soma), 2 (Diferença), 3 (Produto), 4 (Divisão)");
        int opcaoOP = teclado.nextInt();
        switch (opcaoOP) {
            case 1:
                double soma = numero1 + numero2;
                System.out.println("Soma: " + (String.format("%.2f", soma)));
                break;
            case 2:
                double diferenca = numero1 - numero2;
                System.out.println("Diferença: " + (String.format("%.2f", diferenca)));
                break;
            case 3:
                double produto = numero1 * numero2;
                System.out.println("Produto: " + (String.format("%.2f", produto)));
                break;
            case 4:
                if (numero2 != 0) {
                    double divisao = numero1 / numero2;
                    System.out.println("Divisão: " + (String.format("%.2f", divisao)));

                } else {
                    System.out.println("Digite um número diferente de 0");
                }
                break;

            default:
                System.out.println("Opção inválida");
        }

        teclado.close();
    }
}
