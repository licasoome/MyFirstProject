package fundamentos;

public class TiposPrimitivos {
	public static void main(String[] args) {
		// Informações do funcionário.
		
		// Tipos numéricos interios.
		byte anosDeEmpresa = 23;
		short numeroDeVoos = 568;
		int id  = 1355674;
		long pontosAcumulados = 5_235_456_231L;
		
		// Tipos numéricos reais.
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		 
		// Tipo Booleano.
		boolean estaDeFerias = false; // ou true.
		
		
		// Tipo caractere.
		char status = 'A'; // ativo
		
		// Dias de emrpesa.
		System.out.println("Anos de emrpesa: " + anosDeEmpresa);
		System.out.println("Dias de empresa: " + anosDeEmpresa * 365);
		
		// Número de viagens.
		System.out.println(numeroDeVoos * 2);
		
		// Pontos por real.
		System.out.println(pontosAcumulados / vendasAcumuladas);
		System.out.println(id + " ganha " + salario);
		
		System.out.println("Férias? " + estaDeFerias);
		System.out.println("Status " + status);
		
		
		
		
	}

}
