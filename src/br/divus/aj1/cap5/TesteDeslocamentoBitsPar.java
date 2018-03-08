package br.divus.aj1.cap5;

/**
 * TesteDeslocamentoBitsPar - AJ1 - Código 15 - Página 77
 */
public class TesteDeslocamentoBitsPar {

	public static void main(String[] args) {
		System.out.println("Regra a cada deslocamento: (numero)/2 ");

		int numero = 16;
		System.out.println(Integer.toBinaryString(numero) + " = " + numero);

		int resultado = numero >> 1;
		for (int i = 0; i < 5; i++) {
			System.out.println(Integer.toBinaryString(resultado) + " = " + resultado);
			resultado = resultado >> 1;
		}
	}

}
