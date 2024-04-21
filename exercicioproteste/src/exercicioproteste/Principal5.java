package exercicioproteste;

public class Principal5 {
	
	public static void main(String[] args) {
		
		String nome = "Pedro Da Silva Da Costa De Oliveira";
		String nome1 = "Pedro";
		
		System.out.println(nome.replace('a', '@'));  //vai substituir todos os "a" por "@"
		
		System.out.println(nome.replace(" Da " , " ")); // tudo que tiver "da" vai virar só espaço
		
		System.out.println(nome1.repeat(3));  //vai repetir a String
	}
}
