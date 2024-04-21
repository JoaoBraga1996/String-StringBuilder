package exercicioproteste;

public class Principal4 {
	
	
	public static void main(String[] args) {
		
		String nome = "\n    Pedro    ";
		
		System.out.println(nome);
		
		System.out.println(nome.strip());  // tira os espaços dos lados - metodo a partir do Java 11
		
		System.out.println(nome.trim());  // faz basicamente a mesma coisa, mas é legado
		
		System.out.println(nome.stripLeading()); //remove os espaços só na esquerda
		
		System.out.println(nome.stripTrailing()); //remove os espaços só na direita
		
		
		
	}

}
