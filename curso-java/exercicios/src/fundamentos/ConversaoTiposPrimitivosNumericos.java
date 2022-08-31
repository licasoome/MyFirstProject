package fundamentos;

public class ConversaoTiposPrimitivosNumericos {
	public static void main(String[] args) {
		
		double a = 1; // implicita
		System.out.println(a);
		
		float b = (float) 1.0; //explicíta (cast)
		System.out.println(b);
		
		int c = 340;
		byte d = (byte) c; //explicíta (cast)
		System.out.println(d);
		
		double e = 1;
		int f =(int) e; //explicíta (cast)
		System.out.println(f);
		
		
		
		
		
	}

}
