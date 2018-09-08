package Aula02;

import java.util.Scanner;

public class TestarPessoa {
	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o nome: ");
		String nome = scanner.next();

		System.out.println("Digite o RG: ");
		String rg = scanner.next();

		System.out.println("Digite o CPF: ");
		String cpf = scanner.next();

		// Instanciando a classe Pessoa.
		Pessoa pessoa = new Pessoa(nome, rg, cpf);

		System.out.println("Valores capturados da Classe Pessoa: ");
		System.out.println(pessoa);

		scanner.close();

	}
}
