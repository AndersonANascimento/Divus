package br.divus.aj2.cap5;

/**
 * TesteInicializador - AJ2 - Código 5.11 - Página 102
 */
public class TesteInicializador {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			new ExemploInicializador();

			// System.gc();
			// ou
			Runtime.getRuntime().gc();
		}
	}

}
