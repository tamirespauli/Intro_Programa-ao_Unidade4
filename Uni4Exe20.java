/*Dadas 3 notas obtidas por um aluno em 3 provas e a média dos 
exercícios, descreva um algoritmo que calcule a média de
 aproveitamento e o conceito do aluno, usando a fórmula:

\normalsize&space;media=(notaProva1+notaProva22+notaProva33+notaExercicios)/7

A atribuição dos conceitos obedece à tabela abaixo: */


import java.util.Scanner; 

public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota 1: ");
        double notaProva1 = teclado.nextDouble();
        System.out.print("Nota 2: ");
        double notaProva2 = teclado.nextDouble();
        System.out.print("Nota 3: ");
        double notaProva3 = teclado.nextDouble();
        System.out.print("Nota média exercícios: ");
        double notaExerc = teclado.nextDouble();
        double media = (notaProva1 + notaProva2 * 2 + notaProva3 * 3 + notaExerc)/7;
        if (media >= 9. ){
            System.out.print("Sua nota é " + media + " (A), você está APROVADO!");
        } else if (media >= 7.5 && media < 9.0){
            System.out.print("Sua nota é " + String.format("%.2f", media) + " (B), você está APROVADO!");
        }else if(media >= 6.0 && media < 7.5){
            System.out.print("Sua nota é " + String.format("%.2f", media) + " (C), você está APROVADO!");
        }else if (media >= 4.0 && media < 6.0){
            System.out.print("Sua nota é " + String.format("%.2f", media) + " (D), você está REPROVADO!");
        }else{
            System.out.print("Sua nota é " + String.format("%.2f", media) + " (E), você está REPROVADO!");
        }



        teclado.close();

    }
}
