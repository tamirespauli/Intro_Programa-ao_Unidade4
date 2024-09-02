
/*
 * 
 *A jornada de trabalho semanal de um funcionário é de 40 horas.
  O funcionário que trabalhar mais de 40 horas receberá hora extra, cujo cálculo 
é o valor da hora regular com um acréscimo de 50%. Escreva um algoritmo que leia o
número de horas trabalhadas em um mês, o valor por hora e escreva o salário total do funcionário,
 que deverá ser acrescido das horas extras, caso tenham sido trabalhadas (considere que o mês possua 4 semanas exatas).
Para resolver este problema pode se utilizar do algoritmo descrito no fluxograma:
 
// entreda 
Leia o número de horas trabalhadas em um mês, o valor por hora
1
hora base = 160 horas mensais

// processo 

Sem hora extra (Menor ou igual (<= ) a 160) = numero e horas trabalhadas * valor por hora; 

Com horas extra = (Maior que > 160) 

salario extra = (horas mes - 160) * (valorHoras/2);
salrioFinalExtra = (numero e horas trabalhadas * valor por hora) + salario extra); 


//Saida 

salário total do funcionário

 */

import java.util.Scanner;

public class Uni4Exe01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o número de horas trabalhas no mês: ");
        double horasTrabalhadas = teclado.nextDouble();
        System.out.print("Escreva o valor a receber por hora: ");
        double valorHora = teclado.nextDouble();
        int horaBase = 160;
        if (horasTrabalhadas <= horaBase) {
            double salarioBase = horasTrabalhadas * valorHora;
            System.out.print("Salário total: R$" + salarioBase);
        } else {
            double salarioExtra = (horasTrabalhadas - horaBase) * (valorHora / 2);
            double salarioFinalExtra = (horasTrabalhadas * valorHora) + salarioExtra;
            System.out.print("Salaário total: R$" + salarioFinalExtra);
        }
        teclado.close();
    }
}
