package exercicioproteste;

public class Principal2 {

	public static void main(String[] args) {

		String nome = "João Silva Souza";
		System.out.println(obterSobreNome(nome));

		System.out.println("=================");

		System.out.println(obterSegundoNome(nome));

		System.out.println("=================");

		System.out.println(obterUltimoNome(nome));

	}

	private static String obterSobreNome(String nome) {

		int posicaoPrimeiroEspaco = nome.indexOf(" ");

		if (posicaoPrimeiroEspaco < 0) {
			throw new RuntimeException(" O nome não está completo");
		}

		return nome.substring(posicaoPrimeiroEspaco + 1);

	}

	private static String obterSegundoNome(String nome) {

		int posicaoPrimeiroEspaco = nome.indexOf(" ");
		int posicaoSegundoEspaco = nome.indexOf(" ", posicaoPrimeiroEspaco + 1);

		if (posicaoPrimeiroEspaco < 0) {
			throw new RuntimeException(" O nome não está completo");
		}

		return nome.substring(posicaoPrimeiroEspaco + 1,
				posicaoSegundoEspaco < 0 ? nome.length() : posicaoSegundoEspaco);

	}

	private static String obterUltimoNome(String nome) {

		int posicaoUltimoEspaco = nome.lastIndexOf(" ");

		if (posicaoUltimoEspaco < 0) {
			throw new RuntimeException(" O nome não está completo");
		}

		return nome.substring(posicaoUltimoEspaco + 1);

	}

}
