package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		
		int dez =(int) Math.pow(10, 3);
		
		int multi1 =  6 * (3 + 2);
		int elev1 = (int) Math.pow(multi1, 2);
		int divid1 = elev1 / (2 * 3);
		
		System.out.println(divid1);
		
		int multi2 =  (1 - 5) * (2 - 7);
		int divid2 =  multi2 / 2;
		int elev2 = (int) Math.pow(divid2, 2);
		
		System.out.println(elev2);
		
		int sub = divid1 - elev2;
		int elev3 =(int) Math.pow(sub, 3);
		int fim = elev3 / dez;
		
		System.out.println("o resultado da equação é " + fim);
		
		
	}
}
