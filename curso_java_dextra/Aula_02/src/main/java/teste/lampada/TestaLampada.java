package teste.lampada;

public class TestaLampada {
	
	public static void main(String[] args) {
			
		Lampada lampada = new Lampada(60, "xpto");
		Interruptor interruptor = new Interruptor(lampada);
		
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		interruptor.apertar();
		
		System.out.println(lampada);
		
	}

}
