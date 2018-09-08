package Aula02;

import java.util.Random;
import java.util.Scanner;

public class GameRandom {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o seu numero da sorte: ");

		int numeroSorte = scanner.nextInt();
		int numero = new Random().nextInt(10) + 1;
		int aux = 1; // Inicializa com 1 pq já está solicitando para digitar um valor antes do for.

		for (; numeroSorte != numero ;) {
			
			System.out.println("Chute Errado!!! Tente Novamente...");
			
			System.out.println("Digite o seu numero da sorte: ");
			numeroSorte = scanner.nextInt();
			
			aux++; // variavel para mostrar tentativas
		}

		System.out.println("Você Acertou!!!! " + aux + " em tentativas");
		scanner.close();

	}

}