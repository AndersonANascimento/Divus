package br.divus.aj1.cap6;

/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoCondicional {
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

		String sexoPorExtenso = null;
		if (sexo == 'M') {
			sexoPorExtenso = "masculino";
		} else {
			sexoPorExtenso = "feminino";
		}

		double impostoDevido = salario * aliquota;

		String textNome = null;
		String textNasc = null;
		String textRg = null;
		String textSexo = null;
		String textTrabalho = null;
		String textImposto = null;

		switch (sexo) {
			case 'M':
				textNome = "O Senhor " + nome;
				textNasc = ", nascido no ano de " + anoNascimento;
				textRg = ", portador do rg de numero " + rg;
				textSexo = ", do sexo " + sexoPorExtenso;
				textTrabalho = ", está registrado com o salário de R$ " + salario;
				textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
				break;
			case 'F':
				textNome = "A Senhora " + nome;
				textNasc = ", nascida no ano de " + anoNascimento;
				textRg = ", portadora do rg de numero " + rg;
				textSexo = ", do sexo " + sexoPorExtenso;
				textTrabalho = ", está registrada com o salário de R$ " + salario;
				textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
				break;

			default:
				textNome = "O(a) Senhor(a) " + nome;
				textNasc = ", nascido(a) no ano de " + anoNascimento;
				textRg = ", portador(a) do rg de numero " + rg;
				textSexo = ", do sexo " + sexoPorExtenso;
				textTrabalho = ", está registrado(a) com o salário de R$ " + salario;
				textImposto = " e pagará R$ " + impostoDevido + " de imposto.";
				break;
		}
		System.out.println(textNome + textNasc + textRg + textSexo + textTrabalho
				+ textImposto);
	}
}
