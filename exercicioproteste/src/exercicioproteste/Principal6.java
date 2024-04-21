package exercicioproteste;

public class Principal6 {

	public static void main(String[] args) {

		Long tempoInicio = System.currentTimeMillis();

		// String texto = " ";

		StringBuilder sb = new StringBuilder(210000);

		for (int i = 0; i < 200_000; i++) {
			// texto = texto + "#";
			sb.append("#");
		}

		System.out.println(sb.toString());

		double duracao = (System.currentTimeMillis() - tempoInicio) / 1000d;

		System.out.println(duracao);

	}

}
