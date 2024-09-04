/*Escreva um algoritmo que leia a idade de 2 homens
e 2 mulheres (considere que a idade entre homens e mulheres
sempre serão diferentes). Calcule e escreva a soma das idades
do homem mais velho com a mulher mais nova, e o produto das
idades do homem mais novo com a mulher mais velha. */

import java.util.Scanner;

public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Escreva a idade de dois homens abaixo respectivamente: ");
        int idadeH1 = teclado.nextInt();
        int idadeH2 = teclado.nextInt();
        System.out.println("Escreva a idade de duas mulheres abaixo respectivamente: ");
        int idadeM1 = teclado.nextInt();
        int idadeM2 = teclado.nextInt();
        int homemMaisVelho, homemMaisNovo;
        int mulherMaisVelha, mulherMaisNova;
        if (idadeH1 > idadeH2) {
            homemMaisVelho = idadeH1;
            homemMaisNovo = idadeH2;
        } else {
            homemMaisVelho = idadeH2;
            homemMaisNovo = idadeH1;
        }
        if (idadeM1 > idadeM2) {
            mulherMaisVelha = idadeM1;
            mulherMaisNova = idadeM2;
        } else {
            mulherMaisVelha = idadeM2;
            mulherMaisNova = idadeM1;
        }
        int soma = homemMaisVelho + mulherMaisNova;
        int produto = homemMaisNovo * mulherMaisVelha;
        System.out.println("A soma das idades do homem mais velho com a mulher mais nova é: " + soma);
        System.out.println("O produto das idades do homem mais novo com a mulher mais velha é: " + produto);

        teclado.close();
    }
}
