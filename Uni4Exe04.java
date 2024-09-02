/*
 Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.
 

 //entrada 
  número de ponto flutuante maior do que 0
 
 //rocesso 
 se o valor tiver resto de divisão entao ele é um valor com casas decimais, se não, ele é um valor sm casas decimais 

// Saida 
valor com casas decimais / valor sem casas decimais =

 */

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite um valor com casas decimais ou não: ");
        double valor = teclado.nextDouble();
        if (valor % 1 == 0) {
            System.out.print("O valor não possui casa decimais.");
        } else {
            System.out.print("O valor possui casas decimais.");
        }
        teclado.close();
    }
}
