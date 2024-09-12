/*
 As tarifas de um estacionamento são as seguintes:

1° e 2° hora - R$ 5,00 cada
3° e 4° hora - R$ 7,50 cada
5° hora e seguintes - R$ 10,00 cada

O número de horas a pagar é sempre inteiro e arredondado para cima ou para baixo
 dependendo do tempo. Até 29 minutos depois da chegada, arredonda-se para baixo e 
 após 30 minutos arredonda-se para cima. Por exemplo, quem estacionar durante 1 hora e 15
  minutos pagará por 1 hora e quem estacionar por 1 hora e 35 minutos pagará por duas horas. 
  Entretanto, se a pessoa permaneceu menos de 30 minutos, também pagará por uma hora. Os horários 
  de chegada e partida são apresentados na forma de pares de inteiros, representando horas e minutos.
  Por exemplo, o par 12 50 representará meio dia e cinquenta. Assim, faça um algoritmo que leia os horários 
  de chegada e de partida e escreva na tela o tempo que ficou estacionado, e o preço a ser cobrado. 
  Deverá haver validação de dados. Admite-se que a chegada e a partida se dão com intervalo não superior 
  a 24 horas, e sempre chegam e saem no mesmo dia.
 */

import java.util.Scanner;

public class Uni4Exe27 {
    public static void main(String[] args) {
        // Criação do Scanner para leitura de dados
        Scanner teclado = new Scanner(System.in);

        // Entrada de dados
        System.out.print("Hora de Chegada: ");
        int horaChegada = teclado.nextInt();
        System.out.print("Minuto de Chegada: ");
        int minChegada = teclado.nextInt();
        System.out.print("Hora de Saída: ");
        int horaSaida = teclado.nextInt();
        System.out.print("Minuto de Saída: ");
        int minSaida = teclado.nextInt();
        if (horaChegada < 0 || horaChegada > 23 || minChegada < 0 || minChegada > 59 ||
                horaSaida < 0 || horaSaida > 23 || minSaida < 0 || minSaida > 59 ||
                (horaChegada > horaSaida) || (horaChegada == horaSaida && minChegada > minSaida)) {
            System.out.println("Dados inválidos. Verifique os horários de chegada e saída.");
            return;
        }
        int tempoChegada = horaChegada * 60 + minChegada;
        int tempoSaida = horaSaida * 60 + minSaida;
        int totalMinutos = tempoSaida - tempoChegada;
        int horas = totalMinutos / 60;
        int minutosRestantes = totalMinutos % 60;
        if (minutosRestantes > 30) {
            horas++; // +30
        } else if (minutosRestantes >= 30) {
            horas += 0; // -30
        } else {
            horas = Math.max(horas, 1); // mantem sempre a hora mínima como 1
        }
        double preco = 0;
        switch (horas) {
            case 1:
                preco = 5.00;
                break;
            case 2:
                preco = 5.00 * 2;
                break;
            case 3:
                preco = 5.00 * 2 + 7.50;
                break;
            case 4:
                preco = 5.00 * 2 + 7.50 * 2;
                break;
            default:
                if (horas > 4) {
                    preco = 5.00 * 2 + 7.50 * 2 + (horas - 4) * 10.00;
                }
                break;
        }
        System.out.println(String.format("Preço cobrado = R$ %.2f", preco));
    }
}