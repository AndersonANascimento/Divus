package br.divus.aj1.cap5;

/**
 * TesteOrInteiro - AJ1 - Código 26 - Página 88
 */
public class TesteOrInteiro {

	public static void main(String[] args) {
		int i = 4, j = 5;

		System.out.println("i = " + i + " = " + Integer.toBinaryString(i));
		System.out.println("j = " + j + " = " + Integer.toBinaryString(j));
		System.out.println("i | j = " + Integer.toBinaryString(i | j) + " = " + (i | j));
	}

}
