package br.divus.aj2.cap4;
/**
 * TesteCalculadoraAmbiguaVarargs - AJ2 - Código 4.9 - Página 86
 */
public class TesteCalculadoraAmbiguaVarargs {

	public static void main(String[] args) {
		CalculadoraAmbiguaVarargs calc = new CalculadoraAmbiguaVarargs();
		calc.soma(15, 20);
		calc.soma(15.0, 20.0);
		calc.soma(15, 20, 25);
	}

}