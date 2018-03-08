package br.divus.aj1.cap5;

/**
 * TesteOperadorTernario - AJ1 - Código 29 - Página 91
 */
public class TesteOperadorTernario {

	public static void main(String[] args) {
		String mensagem = "O número é ";
		int numero = 15;
		int resto = numero % 2;
		mensagem += (resto == 0) ? "Par" : "Impar";
		System.out.println(mensagem);
	}

}
