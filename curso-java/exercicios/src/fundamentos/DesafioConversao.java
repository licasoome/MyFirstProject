package fundamentos;

import java.util.Scanner;


public class DesafioConversao {
	public static void main(String[] args) {

		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Primeiro salário: ");
		String salario1 = entrada.next().replace(",",".");

		System.out.println("Segundo salário: ");
		String salario2 = entrada.next().replace(",",".");
		
		System.out.println("Terceiro salário: ");
		String salario3 = entrada.next().replace(",",".");
		
		double valor1 = Double.parseDouble(salario1);
		double valor2 = Double.parseDouble(salario2);
		double valor3 = Double.parseDouble(salario3);
		
		double soma = valor1 + valor2 + valor3;
		double media = soma / 3;
		
		entrada.close();
		
		System.out.println("A soma dos salários recebidos é de: " + soma);
		System.out.println("A média dos salários recebidos é de: " + media);
	}

}
