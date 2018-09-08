import java.util.Scanner;


public class caixaEletronicoSaque {
	
	public static void main(String[] args) {
				
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Digite o valor do saque: ");
		int valueSaque = scanner.nextInt();
		
		int restante = valueSaque;
		
		int qtdNota100 =  restante / 100;
		restante = restante % 100;
		
		// Verifica nota de 100
		if (qtdNota100 != 0) {
			
			System.out.println(qtdNota100 + " Nota(s) de R$100");
		}
					
		int qtdNota50 =  restante / 50;
		restante = restante % 50;
		
		// Verifica nota de 50
		if (qtdNota50 != 0) {
			
			System.out.println(qtdNota50 + " Nota(s) de R$50");
		}			
		
		int qtdNota20 =  restante / 20;
		restante = restante % 20;
		
		// Verifica nota de 20
		if (qtdNota20 != 0) {
			
			System.out.println(qtdNota20 + " Nota(s) de R$20");
		}
		
		int qtdNota10 =  restante / 10;
		restante = restante % 10;

		// Verifica nota de 10
		if (qtdNota10 != 0) {
			
			System.out.println(qtdNota10 + " Nota(s) de R$10");
		}
		
		int qtdNota5 =  restante / 5;
		restante = restante % 5;
		
		// Verifica nota de 5
		if (qtdNota5 != 0) {
			
			System.out.println(qtdNota5 + " Nota(s) de R$5");
		
		} 
		
	 scanner.close();
	 
	}
}
