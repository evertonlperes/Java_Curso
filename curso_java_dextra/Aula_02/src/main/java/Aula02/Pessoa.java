package Aula02;

public class Pessoa {
	
	String nome;
	String rg;
	String cpf;

	// Criando o costrutor
	public Pessoa(String nome, String rg, String cpf) {
		//Adicionar o this. na variavel para apontar o nome para a classe Pessoa.
		this.nome = nome;
		this.rg = rg;
		this.cpf = cpf;
	}
	
	@Override
	// Sobrescrever o toString e retorna a representação em String e não em hashcode.
	public String toString() {
		return nome + rg + cpf;
	}
}

