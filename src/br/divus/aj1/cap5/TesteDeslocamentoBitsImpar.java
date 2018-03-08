package br.divus.aj1.cap5;

/**
 * TesteDeslocamentoBitsImpar - AJ1 - Código 16 - Página 78
 */
public class TesteDeslocamentoBitsImpar {

	public static void main(String[] args) {
		System.out.println("Regra a cada deslocamento: (numero - 1)/2 ");

		int numero = 15;
		System.out.println(Integer.toBinaryString(numero) + " = " + numero);

		int resultado = numero >> 1;
		for (int i = 0; i < 5; i++) {
			System.out.println(Integer.toBinaryString(resultado) + " = " + resultado);
			resultado = resultado >> 1;
		}
	}

}
