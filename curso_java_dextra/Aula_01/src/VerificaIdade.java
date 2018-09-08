import java.util.Scanner;



public class VerificaIdade {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite a idade: ");
		
		int idade = scanner.nextInt();
		
		System.out.println("Valor da idade digitado:" + idade);	
		
		// Usando operador condicional
		System.out.println(idade >= 18 ? "--> Maior de idade" : "--> Menor de idade");
		// Verifica se a idade é PAR ou IMPAR
		System.out.println((idade % 2) == 0  ? "--> Numero PAR" : "--> Numero Impar");
		
		// usando IF e ELSE
		/*
		if (idade >= 18) {
			
			System.out.println("Maior de 18 anos!!!");
			
			
		} else {
			
			System.out.println("Menor de 18 anos!!!");
						
		} 
		*/
		
		scanner.close();
		
	}
	
}
