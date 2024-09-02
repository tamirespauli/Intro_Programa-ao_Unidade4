/*
 Um casal possui três filhos: Marquinhos,
  Zezinho e Luluzinha. Faça um algoritmo para ler as
   idades dos filhos e exibir quem é o caçula da família; 
   suponha que não haja empates.
 */

import java.util.Scanner;

public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Idade de Marquinhos: ");
        int idadeMarquinhos = teclado.nextInt();
        System.out.print("Idade de Zezinho: ");
        int idadeZezinho = teclado.nextInt();
        System.out.print("Idade de Luluzinha: ");
        int idadeLuluzinha = teclado.nextInt();
        if (idadeMarquinhos < idadeZezinho && idadeMarquinhos < idadeLuluzinha) {
            System.out.print("Marquinhos é o irmão caçula");

        } else if (idadeZezinho < idadeMarquinhos && idadeZezinho < idadeLuluzinha) {
            System.out.print("Zezinho é o irmão caçula");
        } else {
            System.out.print("Luluzinha é a irmã caçula");
        }
        teclado.close();

    }
}
