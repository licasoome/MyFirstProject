package fundamentos;

public class TipoString {
 public static void main(String[] args) {
	
	  System.out.println("Olá pessoal".charAt(2));
	  
	  String s = "Boa tarde!";
	  System.out.println(s.concat("!!!"));
	  
	  System.out.println(s.concat("!!!"));
	  System.out.println(s + "!!!");
	  
	  System.out.println(s.startsWith("Boa"));
	  System.out.println(s.startsWith("boa"));
	  System.out.println(s.toLowerCase().startsWith("boa"));
	  System.out.println(s.endsWith("dia!"));
	  System.out.println(s.toUpperCase().endsWith("TARDE!"));
	  
	  System.out.println(s.length());
	  System.out.println(s.equals("Boa tarde!"));
	  
	  var nome = "Pedro";
	  var sobrenome = "Santos";
	  var idade = 33;
	  var salario = 12345.789;
	  
	  
	   System.out.println("Nome: " + nome + "\nSobrenome: " + sobrenome + "\nIdade: " 
			   				+ idade + "\nSalário: " + salario + "\n \n");
	   
	   System.out.printf("O senhor %s %s tem %d e ganha %.2f."
			   , nome, sobrenome, idade, salario);
	   
	   String frase = String.format("\n \nO senhor %s %s tem %d e ganha %.2f."
			   , nome, sobrenome, idade, salario);
	   
	   System.out.println(frase);
	   
	  
	  
	  
}
	
}
