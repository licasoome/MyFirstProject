package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		
		// AMBOS DERAM CERTO
		boolean trabalhoterca = true;
		boolean trabalhoquinta = true;
		
		boolean tv50s = trabalhoterca && trabalhoquinta;
		boolean tv32s = trabalhoterca ^ trabalhoquinta;
		
		boolean sorvete = trabalhoterca || trabalhoquinta;	
		
		System.out.println("Trabalho terça deu certo: " + trabalhoterca);
		System.out.println("Trabalho quinta deu certo: " + trabalhoquinta);
		System.out.println("Ambos trabalhos deram certo: " + tv50s);
		System.out.println("Compraram tv32': " + tv32s);
		System.out.println("Compraram tv50': " + tv50s);
		System.out.println("Tomaram sorvete: " + sorvete);
		
		
	
		
		
	}

}
