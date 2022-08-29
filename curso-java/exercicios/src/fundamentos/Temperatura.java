package fundamentos;

public class Temperatura {

	public static void main(String[] args) {
		// (F - 32) * 5/9 = C
		
		final int Menos = 32;
		final double Divide = 5.0 / 9.0;
		double fahrenheit = 115;
		double celsius =  (fahrenheit - Menos) * Divide;
		
		System.out.println("Brasil");
		System.out.println("temperatura em fahrenheit = " + fahrenheit);
		System.out.println("temperatura em celsius = " + celsius);
		
		fahrenheit = 76;
		celsius =  (fahrenheit - Menos) * Divide;
		System.out.println("EUA");
		System.out.println("temperatura em fahrenheit = " + fahrenheit);
		System.out.println("temperatura em celsius = " + celsius);
	}
}
