/*
 *O custo do selo de uma carta com até 50 gramas é de R$ 0,45.
As cartas com peso superior pagam um adicional de R$ 0,45 por 
cada 20 gramas, ou fração, em que excedem aquele peso. Escreva
um algoritmo que dado o peso da carta, em gramas, determine o 
custo do selo. Para resolver este problema pode se utilizar do algoritm
o descrito no fluxograma:

entrada 
peso da carata em gramas 

se o valor for <= 50 então valor a pagar = R$0,45
se não, então 

pesoExcedido = peso - 50 
qtAdicional = (pesoExcedido/20) + 1 
valor a pagar = 0,45 + 0,45 * qtAdicional

saida 
 
valor da carta 
 */

import java.util.Scanner;

public class Uni4Exe07 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int pesoBase = 50;
        double valorBase = 0.45;
        System.out.print("Escreva o peso da carta em gramas: ");
        double pesoCarta = teclado.nextDouble();
        if (pesoCarta <= pesoBase) {
            System.out.print("Valor a pagar: R$" + valorBase);
        } else {
            double pesoExedido = pesoCarta - pesoBase;
            double qtAdicional = (pesoExedido / 20) + 1;
            double valorPagar = valorBase + valorBase * qtAdicional;
            System.out.print("Valor a pagar: R$" + String.format("%.2f", valorPagar));
        }
        teclado.close();
    }
}
