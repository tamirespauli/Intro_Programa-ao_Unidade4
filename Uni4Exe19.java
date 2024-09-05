/*
 Dadas as coordenadas (X e Y) de um Ponto, 
 você deve informar em qual quadrante ele 
 está localizado

0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se x for positivo e y, negativo
3, se os dois valores forem negativos
4, se x for negativo e y, positivo
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
 */

import java.util.Scanner;

public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("X = ");
        double x = teclado.nextDouble();
        System.out.print("Y = ");
        double y = teclado.nextDouble();
        if (x == 0 && y == 0){
            System.out.print("Quadrante 0");
        } else if (x > 0 && y > 0 ){
            System.out.print("Quadrante 1");
        } else if (x > 0 && y < 0) {
            System.out.print("Quadrante 2");
        }else if (x < 0 && y < 0){
            System.out.print("Quadrante 3");
        }else if (x < 0 && y > 0) {
            System.out.print("Quadrante 4");
        }
        teclado.close();
    }
}
