/* Leia uma data e determine se ela é válida. 
Ou seja, verifique se o mês está entre 1 e 12,
 e se o dia existe naquele mês. Note que fevereiro tem 29 dias em anos
  bissextos, e 28 dias em anos não bissextos.
Para resolver este problema pode se utilizar do algoritmo descrito no 
fluxograma: */

import java.util.Scanner;

public class Uni4Exe14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Escreva o dia: ");
        int dia = teclado.nextInt();
        System.out.print("Escreva o mês: ");
        int mes = teclado.nextInt();
        System.out.print("Escreva o ano: ");
        int ano = teclado.nextInt();

        boolean anoBissexto = (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
        boolean dataValida = false;

        if (mes >= 1 && mes <= 12) {
            if (mes == 2) {
                if ((anoBissexto && dia >= 1 && dia <= 29) || (!anoBissexto && dia >= 1 && dia <= 28)) {
                    dataValida = true;
                }
            } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    dataValida = true;
                }
            } else {
                if (dia >= 1 && dia <= 31) {
                    dataValida = true;
                }
            }
        }
        if (dataValida) {
            System.out.println("Válida");
        } else {
            System.out.println("Não válida");
        }
        teclado.close();
    }
}