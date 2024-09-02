
/* Dado uma letra, escreva um algoritmo que informe se ela é 
ou não uma vogal.
Para resolver este problema pode se utilizar do algoritmo 
descrito no fluxograma: */
import java.util.Scanner;

public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Informe uma letra: ");
        String entrada = teclado.next();
        if (entrada.length() != 1) {
            System.out.println("Entrada inválida. Insira apenas uma letra.");
        } else {
            char letra = entrada.toUpperCase().charAt(0);
            if (!Character.isLetter(letra)) {
                System.out.println("Entrada inválida. Insira apenas uma letra.");
            } else {
                if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
                    System.out.println("A letra informada é uma vogal.");
                } else {
                    System.out.println("A letra informada é uma consoante.");
                }
            }
        }
        teclado.close();
    }
}
