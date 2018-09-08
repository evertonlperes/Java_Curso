import java.util.Scanner;


public class calculoNotasAluno {
	public static void main(String[] args) {
		
		double result = 0;
		
		Scanner scanner = new Scanner (System.in);
		
		System.out.print("Digite o nome do Aluno: ");
		String nomeAluno = scanner.next();
		
		System.out.println("Digite a primeira nota: ");
		double valueNota1 = scanner.nextDouble();
		
		System.out.println("Digite a segunda nota: ");
		double valueNota2 = scanner.nextDouble();
		
		System.out.println("Digite a terceira nota: ");
		double valueNota3 = scanner.nextDouble();
		
		// Calculando a media das notas...
		result = ((valueNota1 + valueNota2 + valueNota3) / 3);
		
		System.out.println("Resultado: " + result);
		//System.out.println(result >= 7 ? "!!! Aprovado !!!" : "*** Reprovado ***" );
		
			if (result > 7) {
			
				System.out.println("Nome do Aluno: " + nomeAluno);
				System.out.println("Você foi Aprovado!!!");
			
			} else if (result >= 4 && result < 7) {
			
				System.out.println("Nome do Aluno: " + nomeAluno);
				System.out.println("Você está de Exame!!!");
			
			  } else {
			
				System.out.println("Nome do Aluno: " + nomeAluno);
				System.out.println("Infelizmente você foi Reprovado!!!");
			
			  }
			scanner.close();
		 }
				
	}

