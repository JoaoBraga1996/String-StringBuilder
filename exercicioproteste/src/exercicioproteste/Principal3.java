package exercicioproteste;

public class Principal3 {
	
	public static void main(String[] args) {
		
		String nome = "Pedro";
		
		nome.toUpperCase();
		
		System.out.println(nome);  // String são imutaveis, vai continuar minuscula, só vai alterar se vc atribuir a outra string
		
		System.out.println("=================");
		
		
		//atribuindo a outra string 
		
		String nomeEmMaisculo = nome.toUpperCase();  //assim são objetos completamento diferentes
		
		System.out.println(nomeEmMaisculo);
		
		
		
		
		
		
		
		
	}

}
