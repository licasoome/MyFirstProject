package fundamentos;

public class Wrappers {
	public static void main(String[] args) {
		
		//Byte
		Byte b = 100;
		Short s = 1000;
		
		// Integer.parseInt(entrada.next());
		Integer i = 1000; // int
		Long l = 100000000000L;

		System.out.println(b.byteValue());
		System.out.println(s.toString());
		System.out.println(i * 3);
		System.out.println(l / 3);
		
		Float f = 123.0F;
		System.out.println(f);
		
		Double d = 132.0;
		System.out.println(d);
		
		
		Boolean bo = Boolean.parseBoolean("true");
		System.out.println(bo);
		System.out.println(bo.toString().toUpperCase());
		
		Character c = '#'; //char
		System.out.println(c.toString());
		
		
	}
}
