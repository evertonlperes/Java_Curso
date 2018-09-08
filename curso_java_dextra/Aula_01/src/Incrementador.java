import java.util.Scanner;


public class Incrementador {
	
	public static void main(String[] args) {
		
		int i = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite um Numero: ");
		int valueNUM = scanner.nextInt();
		
		for(i = 0; i < valueNUM; i++){
			
			System.out.println("Resultado : " + i);
			
		}
		scanner.close();
		
	}

}
