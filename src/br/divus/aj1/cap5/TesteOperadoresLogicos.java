package br.divus.aj1.cap5;

/**
 * TesteOperadoresLogicos - AJ1 - Código 23 - Página 85
 */
public class TesteOperadoresLogicos {

	public static void main(String[] args) {
		int x = 9, y = 0;

		boolean a = x > y && x > 0;
		System.out.println("X>Y e X>0 = " + a);

		boolean b = y == 0 || x == 0;
		System.out.println("Um dos dois é igual a zero = " + b);
	}

}
