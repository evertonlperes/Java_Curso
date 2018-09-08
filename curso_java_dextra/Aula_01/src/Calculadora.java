import java.util.Scanner;


public class Calculadora {
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double value01 = scanner.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double value02 = scanner.nextDouble();
		
		System.out.println("Mostrando os resultados....");
		System.out.println("Resultado Soma: " + (value01 + value02));
		System.out.println("Resultado Subtracao: " + (value01 - value02));
		System.out.println("Resultado Multiplicacao: " + (value01 * value02));
		System.out.println("Resultado Divisao: " + (value01 / value02));
		System.out.println("Resultado Resto Div: " + (value01 % value02));
		
		scanner.close();
	}

}
