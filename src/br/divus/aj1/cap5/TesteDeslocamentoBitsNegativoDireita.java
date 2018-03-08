package br.divus.aj1.cap5;

/**
 * TesteDeslocamentoBitsNegativoDireita - AJ1 - Código 19 - Página 81
 */
public class TesteDeslocamentoBitsNegativoDireita {

	public static void main(String[] args) {
		System.out.println("Sem regras de deslocamento!");

		int numero = -17;
		System.out.println(Integer.toBinaryString(numero) + " = " + numero);

		int resultado = numero;

		for (int i = 0; i < 5; i++) {
			resultado = resultado >>> 1;
			System.out.println(Integer.toBinaryString(resultado) + " = " + resultado);
		}
	}

}
