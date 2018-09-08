import java.util.Scanner;


public class gameVerify {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Digite o nome do primeiro jogador: ");
		String player01 = scanner.next();
		
		System.out.println("Digite o valor PAR: ");
		int valuePlayer1 = scanner.nextInt();
				
		System.out.println("Digite o nome do segundo jogado: ");
		String player02 = scanner.next();
		
		System.out.println("Digite o valor IMPAR: ");
		int valuePlayer2 = scanner.nextInt();
		
		int valorFinal = (valuePlayer1 + valuePlayer2);
		
		System.out.println((valorFinal % 2) == 0 ? "Numero PAR" : "Numero IMPAR");
		System.out.println((valorFinal % 2) == 0 ? "O jogador " + player01 + " venceu!" : "O Jogador " + player02 + " venceu!");
					
		scanner.close();
		
	}

}
