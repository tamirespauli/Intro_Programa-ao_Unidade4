/* 
 * Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
*/
import java.lang.Math;
import java.util.Scanner; 

public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in); 
        System.out.println("'T' para calcular a área de um triângulo de base b e altura h");
        System.out.println("'Q' para calcular a área de um quadrado de lado l");
        System.out.println("'R' para calcular a área de um retângulo de base b e altura h");
        System.out.println("'C' para calcular a área de um círculo de raio r");
        char opcao = teclado.next().charAt(0);
        switch (opcao) {
            case 'T':
                System.out.println("Digite a base e altura do triângulo: ");
                double base = teclado.nextDouble();
                double altura = teclado.nextDouble();
                double trianguloArea = (base * altura) / 2;
                System.out.println("Area: " + trianguloArea); 
                break;
            case 'Q': 
                System.out.println("Digite o lado: ");
                double lado = teclado.nextDouble(); 
                double areaQuadrado = lado * lado; 
                System.out.println("Área do quadrado: " + areaQuadrado);
                break; 
            case 'R': 
                System.out.println("Digite a base e alltura do retângulo: ");
                double retanguloBase = teclado.nextDouble(); 
                double retanguloAltura = teclado.nextDouble();
                double retanguloArea = retanguloBase * retanguloAltura; 
                System.out.println("Área do retângulo: " + retanguloArea);
                break; 
            case 'C': 
                System.out.println("Diite o raio: ");
                double raio = teclado.nextDouble();
                double areaRaio = Math.PI * Math.pow(raio , 2);
                System.out.println("Área circulo: " + areaRaio);
                break; 
            default: 
                System.out.println("Opção Inválida"); 
        }

        teclado.close(); 
    }
}
