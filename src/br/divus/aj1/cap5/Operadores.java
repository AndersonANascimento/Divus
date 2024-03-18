package br.divus.aj1.cap5;

/**
 * Classe com o objetivo de praticar a utilização dos operadores com tipos
 * primitivos.
 * 
 * @author Melissa
 */
public class Operadores {
	/**
	 * Método para que esta classe possa ser executada com o utilitário java.
	 * 
	 * @param args
	 *             - argumentos para o método main
	 */
	public static void main(String[] args) {
		String nome = "Anderson Nascimento";
		int idade = 50;
		String rg = "1081186-9";
		char sexo = 'M';
		double salario = 13000.0;
		int anoAtual = 2024;
		double aliquota = 0.27;
		int anoNascimento = anoAtual - idade;
		String sexoPorExtenso = (sexo == 'M') ? "masculino" : "feminino";
		double impostoDevido = salario * aliquota;
		System.out.print("O(a) Senhor(a) " + nome + ", nascido(a) no ano de ");
		System.out.println(anoNascimento + ", portador(a) do RG de número " + rg);
		System.out.print(", do sexo " + sexoPorExtenso);
		System.out.print(", está registrado(a) com o salário de R$ " + salario);
		System.out.println(" e pagará R$ " + impostoDevido + " de imposto.");
	}
}
