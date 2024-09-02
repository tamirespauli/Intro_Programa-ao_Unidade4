
/*Dados 3 valores lado1, lado2, lado3, que representam os comprimentos dos lados de um triângulo,
 descreva um algoritmo que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo.
  Em caso afirmativo, verifique e informe se é "triângulo equilátero", "triângulo isósceles" ou "triângulo escaleno".
   Em caso negativo, informe que os mesmos não formam um triângulo. Considere que:

o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados
um triângulo equilátero tem três lados iguais
um triângulo isóscele tem dois lados iguais e um diferente
um triângulo escaleno tem três lados diferentes

Se tiveres dúvidas em pensar que quais três lados (segmentos reta) sempre formam um triângulo olhe este PDF: Uni4Exe12_duvida
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma: */

import java.util.Scanner;

public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Lado 1 do Triângulo: ");
        double lado1 = teclado.nextDouble();
        System.out.print("Lado 2 do Triângulo: ");
        double lado2 = teclado.nextDouble();
        System.out.print("Lado 3 do Triângulo: ");
        double lado3 = teclado.nextDouble();
        if ((lado1 + lado2) <= lado3 || (lado1 + lado3) <= lado2 || (lado2 + lado3) <= lado1) {
            System.out.print("Os lados não formam um Triângulo");
        } else if (lado1 == lado2 && lado2 == lado3) {
            System.out.println("O triângulo é EQUILÁTERIO");
        } else if (lado1 == lado2 && lado1 != lado3 ||
                lado1 == lado3 && lado2 != lado3 ||
                lado2 == lado3 && lado1 != lado2) {
            System.out.println("O triângulo é ISÓSCELE");
        } else {
            System.out.println("O triângulo é ESCALENO");
        }

        teclado.close();

    }
}
