// 	double pow(double a, double b) (potencia)
// java.lang.Math
/* O índice de massa corporal (IMC) é uma medida 
internacional usada para calcular se uma pessoa está no peso ideal.
O IMC é determinado pela divisão da massa do indivíduo pelo quadrado 
de sua altura, onde a massa está em quilogramas e a altura está em metros, 
de acordo com a fórmula:

\normalsize&space;IMC=\frac{Massa}{Altura^2}

Faça um algoritmo para classificar o IMC e dizer o grau de obesidade do
 indivíduo, de acordo com a seguinte tabela:

IMC	Classificação
< 18.5	Magreza
18.5 - 24.9	Saudável
25.0 - 29.9	Sobrepeso
30.0 - 34.9	Obesidade Grau I
35.0 - 39.9	Obesidade Grau II (severa)
>= 40.0	Obesidade Grau III (mórbida) */

import java.lang.Math;
import java.util.Scanner;

public class Uni4Exe21 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Massa (kg): ");
        double massa = teclado.nextDouble();
        System.out.println("Altura (M): ");
        double altura = teclado.nextDouble();
        double imc =  massa / Math.pow(altura, 2); 
        if (imc < 18.5){
            System.out.println("Magreza");
        }else if (imc >= 18.5 && imc <=24.9) {
            System.out.println("Saudável");
        }else if (imc >= 25.0 && imc <= 29.9){
            System.out.println("Sobrepeso");
        }else if (imc >= 30.0 && imc <= 34.9){
            System.out.println("Obesidade grau 1");
        }else if (imc >= 35.0 && imc <= 39.9){
            System.out.println("Obesidade Grau 2 (severa)");
        }else {
            System.out.println("Obesidade Grau 3 (mórbida)");
        }
        teclado.close();
    }
}
