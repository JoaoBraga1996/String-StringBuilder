package exercicioproteste;

public class Principal {

	public static void main(String[] args) {
		String nome = "João";
		String nome2 = new String("joão");
		String vazia = "";
		String nome3 = "João Silva Braga";

		System.out.println("São Iguais ? " + nome.equalsIgnoreCase(nome2));

		System.out.println("Está vazia? " + (vazia.length() == 0));
		System.out.println("Está vazia? " + vazia.isEmpty());

		System.out.println("Começam com a letra a ? " + nome.startsWith("a"));
		System.out.println("Termina com a letra o ? " + nome.endsWith("o"));
		
		System.out.println("Contem a palavra Silva? " + nome3.contains("Silva"));
		
		
		System.out.println("o index do espaço é = " + nome3.indexOf(" "));
		System.out.println(" A partir de qual index você quer retornar algo ? = " + nome3.substring(4));
		System.out.println(" A partir de qual index você quer retornar algo e até qual?" + nome3.substring(4, 13));

	}

}
