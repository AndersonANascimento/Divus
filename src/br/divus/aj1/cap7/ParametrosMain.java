package br.divus.aj1.cap7;
/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Anderson A. Nascimento
 */
class ParametrosMain {
	/**
	 * Método para que esta classe possa ser executada com o utilitário java.
	 * 
	 * @param args - argumentos para o método main
	 */
	public static void main(String[] args) {

		if (args.length < 5) {
			System.err
					.println("java Parametros <nome> <data nascimento> <rg> <salario> <sexo>");
			return;
		}
		String nome = args[0];
		String dataNascimento = args[1];
		String rg = args[2];
		String salario = args[3];
		String sexo = args[4];

		String textNome = "O(a) Senhor(a) " + nome;
		String textNasc = "nascido(a) em " + dataNascimento;
		String textRg = " portador(a) do rg de numero " + rg + ", \n";
		String textSexo = " do sexo " + sexo;
		String textTrabalho = ", está registrado(a) com o salário de R$ "
				+ salario + ".";
		System.out.println(textNome + textRg + textNasc + textSexo
				+ textTrabalho);
	}
}
