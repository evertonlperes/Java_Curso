import java.util.Scanner;


public class CompararString {
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String getNome1 = scanner.next();
		String getNome2 = scanner.next();
		
		System.out.println("Primero nome: " + getNome1);
		System.out.println("Segundo nome: " + getNome2 );
		
		
		// Compara o endereco da memoria
		if (getNome1 == getNome2) {
			
			System.out.println("Funcionou, mas esta cagado!!");
			
		
		// Compara o conteudo da memoria - metodo correto	
		} if (getNome1.equalsIgnoreCase(getNome2)) {
			
			System.out.println("Correto!!");
			
			
			} else {

				System.out.println("Deu merda!!");
				
		
			}
		
		
		/*Comparando as Strings - Se usar o == compara o endereço de memoria, usar .equals para
		* comparar o conteudo da memoria.
		*/
		//System.out.println("Resultado da comparacao :" + getNome1.equalsIgnoreCase(getNome2));
				
		scanner.close();
		
	}	

	
	
}
