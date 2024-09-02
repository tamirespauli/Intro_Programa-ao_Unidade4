/* 
Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar.
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:

// entrada

valor 

// processo

valor % 2 == 0 

se true entaão é par, se não é imprar 
se nao for nenhum dos dois o número nao é inteiro 


// saida 

impar ou par ou insira nivaente 


 */

import java.util.Scanner;

public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva um valor maior que 0 e inteiro: ");
        int valor = teclado.nextInt();
        if (valor > 0) {
            if (valor % 2 == 0) {
                System.out.print("Valor é par");
            } else {
                System.out.print("O valor é impar");
            }
        } else {
            System.out.println("Insira um número inteiro maior do que 0: ");
        }
        teclado.close();
    }
}
