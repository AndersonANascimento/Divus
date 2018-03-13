package br.divus.aj2;

/**
 * TestePassagemPrimitivos - AJ2 - Código 1.21 - Página 35
 */
public class TestePassagemPrimitivos {
	public static void main(String[] args) {
		int num1 = 4;
		int num2 = 2;
		CalculadoraMaluca calculadora = new CalculadoraMaluca();
		System.out.println("O valor de num1 antes do método multiplica: " + num1);
		System.out.println("O valor de num2 antes do método multiplica: " + num2);
		calculadora.multiplicaValores(num1, num2);
		System.out.println("O valor de num1 após o método: " + num1);
		System.out.println("O valor de num2 após o método: " + num2);
	}
}
