/*
Elabore um algoritmo para exibir o valor de reajuste que
 um funcionário receberá no seu salário. A empresa irá
  conceder 5% de reajuste para o funcionário que for admitido
   há até de 12 meses. Para funcionário admitido entre 13 e 
   48 meses, irá conceder 7% de reajuste. O seu algoritmo 
   deve solicitar ao usuário que digite a quantidade de meses
    que o funcionário foi admitido.
 */

import java.util.Scanner; 

public class Uni4Exe15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
            System.out.print("Quantidade de meses: "); 
            int qtMeses = teclado.nextInt(); 
            System.out.print("Salario base: R$");
            double salarioBase = teclado.nextDouble();
            double reajuste12 = 0.05;
            double reajuste13_48 = 0.07;
            if (qtMeses > 0 && qtMeses <= 12 ) { 
                double reajuste = (salarioBase * reajuste12) + salarioBase; 
                System.out.println("Salrio reajustado: R$" + String.format("%.2f", reajuste));
            } else if ( qtMeses >=13 && qtMeses < 48){
                double reajuste = (salarioBase * reajuste13_48) + salarioBase; 
                System.out.println("Salrio reajustado: R$" + String.format( "%.2f", reajuste));
            }
            teclado.close();   
    }
}
