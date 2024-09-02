/* 
Faça um algoritmo que leia um caractere.
 Caso seja digitada a letra 'M' escreva “Masculino”. 
 
 Se for digitada a letra 'F' escreva “Feminino”. Se for informado 
'I' escreva “Não Informado”. Qualquer outra letra digitada escreva
 “Entrada Incorreta”. Atenção: antes de testar a letra, converta-a para maiúscula.

*/

import java.util.Scanner;

public class Uni4Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe o sexo: ");
        String letra = teclado.next();
        char caractere = letra.toUpperCase().charAt(0);
        if (caractere == 'M') {
            System.out.print("Masculino");
        } else if (caractere == 'F') {
            System.out.print("Feminino");
        } else if (caractere == 'I') {
            System.out.print("Não informado");
        } else {
            System.out.print("Entrada incorreta");
        }

        teclado.close();
    }
}
