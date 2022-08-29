package fundamentos;

public class Inferencia {
	public static void main(String[] args) {
		
		double a = 4.5;
		System.out.println(a);
		
		var b =  4.5;
		System.out.println(b);
		
		var c = "texto";
		System.out.println(c);
		c = "outro texto";
		System.out.println(c);
		// c = 4.5; <-- não pode acontecer!!!
		
		double d; //variável foi declarada.
		d = 132.65; //variável foi inicializada.
		System.out.println(d); //variável foi usada.
		
		/*
		 * var e;
		 * f = 132.56; <-- não pode acontecer pois a variável não foi explicitada.
		 */
		
		var f =  12;
		System.out.println(f);
		//f = 12.01; <-- não pode pois a varoável já foi explicitada como int.
		
		
	}
}
