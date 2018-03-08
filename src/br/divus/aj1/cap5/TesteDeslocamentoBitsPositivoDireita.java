package br.divus.aj1.cap5;

/**
 * TesteDeslocamentoBitsPositivoDireita - AJ1 - Código 18 - Página 80
 */
public class TesteDeslocamentoBitsPositivoDireita {

	public static void main(String[] args) {
		System.out.println("Regra a cada deslocamento: (numero)/2 ");

		int numero = 16;
		System.out.println(Integer.toBinaryString(numero) + " = " + numero);

		int resultado = numero;
		
		for (int i = 0; i < 5; i++) {
			resultado = resultado >>> 1;
			System.out.println(Integer.toBinaryString(resultado) + " = " + resultado);
		}
	}

}
