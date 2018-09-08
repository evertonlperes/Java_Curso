package teste.lampada;

public class Lampada {

	int watts;
	String fabricante;
	boolean ligada;

	public Lampada(int watts, String fabricante) {

		this.watts = watts;
		this.fabricante = fabricante;

	}

	@Override
	public String toString() {
		return watts + fabricante;
	}

	public boolean estaLigada() {

		return ligada;

	}

	public void ligar() {

		System.out.println("Lampada Ligada!!!");
		this.ligada = true;

	}

	public void desligar() {

		System.out.println("Lampada Desligada!!!!");
		this.ligada = false; //seta o retorno boolean para FALSE, senao ficara sempre em TRUE.

	}

}
