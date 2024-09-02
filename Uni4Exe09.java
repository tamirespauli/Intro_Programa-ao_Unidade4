
/*Dados dois valores inteiros, escreva um
 algoritmo que informe se eles são múltiplos ou não. */
import java.util.Scanner;

public class Uni4Exe09 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escrevaum o 1º valor: ");
        double valor1 = teclado.nextDouble();
        System.out.print("Escrevaum o 2º valor: ");
        double valor2 = teclado.nextDouble();
        if (valor1 % valor2 == 0) {
            System.out.println("Os valores são multiplos");
        } else {
            System.out.println("Os valores não são multiplos");
        }
        teclado.close();
    }
}
