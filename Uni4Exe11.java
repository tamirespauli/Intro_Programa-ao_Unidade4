/*Escreva um algoritmo para ler o ano de nascimento de 3 irmãos, 
escrever uma mensagem que indique se eles são TRIGÊMEOS, GÊMEOS, APENAS IRMÃOS.
 Considere que eles são GÊMEOS se dois deles possuem a mesma idade e o outro diferente dos demais, 
 e apenas irmãos se todas as idades forem diferentes. */

import java.util.Scanner;

public class Uni4Exe11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int anoAtual = 2024;
        System.out.print("Escreva o ano de nascimento do irmão 1: ");
        int ano1 = teclado.nextInt();
        System.out.print("Escreva o ano de nascimento do irmão 2: ");
        int ano2 = teclado.nextInt();
        System.out.print("Escreva o ano de nascimento do irmão 3: ");
        int ano3 = teclado.nextInt();
        int idadeIrmao1 = anoAtual - ano1;
        int idadeIrmao2 = anoAtual - ano2;
        int idadeIrmao3 = anoAtual - ano3;
        if (idadeIrmao1 == idadeIrmao2 && idadeIrmao2 == idadeIrmao3) {
            System.out.print("Os irmão são TRIGÊMIOS");
        } else if ((idadeIrmao1 == idadeIrmao2 && idadeIrmao2 != idadeIrmao3) ||
                (idadeIrmao1 == idadeIrmao3 && idadeIrmao2 != idadeIrmao3) ||
                (idadeIrmao2 == idadeIrmao1 && idadeIrmao1 != idadeIrmao3)) {
            System.out.print("Os irmãos são GÊMIOS");
        } else {
            System.out.print("São apenas irmãos");
        }

        teclado.close();

    }
}
