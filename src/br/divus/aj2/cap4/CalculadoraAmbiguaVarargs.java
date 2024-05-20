package br.divus.aj2.cap4;

/**
 * CalculadoraAmbiguaVarargs - AJ2 - Código 4.8 - Página 85
 */
public class CalculadoraAmbiguaVarargs {

	public int soma(byte b1, byte b2) {
		System.out.println("Soma de byte");
		return b1 + b2;
	}

	public long soma(long lg1, long lg2) {
		System.out.println("Soma de long");
		return lg1 + lg2;
	}

	public double soma(double d1, double d2) {
		System.out.println("Soma de double");
		return d1 + d2;
	}

	public long soma(int... params) {
		System.out.println("Soma de varargs");
		int soma = 0;
		for (int i : params) {
			soma += i;
		}
		return soma;
	}

}