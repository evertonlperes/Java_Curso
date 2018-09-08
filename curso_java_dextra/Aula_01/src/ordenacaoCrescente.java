import java.util.Scanner;

//Cagado!!! Refazer!!!

public class ordenacaoCrescente {
	
	public static void main(String[] args) {
		
		Scanner scanner  = new Scanner (System.in);
		
		System.out.println("Digite o Primeiro Numero: ");
		int numX = scanner.nextInt();
		
		System.out.println("Digite o Segundo Numero: ");
		int numY = scanner.nextInt();
		
		System.out.println("Digite o Terceiro Numero: ");
		int numZ = scanner.nextInt();
		
		if (numX < numY && numY < numX) {
			
			System.out.println("Ordem crescente é: " + numX + numY + numZ);
			
		} else if (numX < numZ && numZ < numY) {
			
			System.out.println("Ordem crescente é: " + numX + numZ + numY);
			
		} else if (numY < numX && numX < numZ) {
			
			System.out.println("Ordem crescente é: " + numY + numX + numZ);
			
		}
		
		
		scanner.close();
		
	}

}
