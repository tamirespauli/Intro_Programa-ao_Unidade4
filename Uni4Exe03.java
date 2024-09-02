
/* 
 * Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

Entrada 

numero a e numero b

Processo 

se a > b então o numero maior é o a, se não é o b 
sainda 

numero maior entre os dois numero / tente novamente 
 
 * 
 */

import java.util.Scanner;

public class Uni4Exe03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreve o primeiro número inteiro: ");
        int valorA = teclado.nextInt();
        System.out.print("Escreve o segundo número interiro: ");
        int valorB = teclado.nextInt();

        if (valorA >= 0 && valorB >= 0) {
            if (valorA > valorB) {
                System.out.print("Maior valor entre o primerio e o segundo valor inseridos é: " + valorA);
            } else {
                System.out.print("Maior valor entre o primerio e o segundo valor inseridos é: " + valorB);

            }
        } else {
            System.out.print("Só são aceitos valores inteiros!");
        }

        teclado.close();
    }
}
