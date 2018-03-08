package br.divus.aj1.cap5;

/**
 * TesteDeslocamentoBitsParEsquerda - AJ1 - Código 17 - Página 79
 */
public class TesteDeslocamentoBitsParEsquerda {

	public static void main(String[] args) {
		System.out.println("Regra a cada deslocamento: (numero)*2 ");

		int numero = 16;
		System.out.println(Integer.toBinaryString(numero) + " = " + numero);

		int resultado = numero << 1;
		for (int i = 0; i < 5; i++) {
			System.out.println(Integer.toBinaryString(resultado) + " = " + resultado);
			resultado = resultado << 1;
		}
	}

}
