package br.divus.aj2;

/**
 * TestePessoa - AJ2 - Código 1.4 - Página 18
 */
public class TestePessoa {

	public static void main(String[] args) {
		// Cria-se uma instância da classe Pessoa
		Pessoa p = new Pessoa();
		// Acessando os atributos da classe Pessoa para definir seus valores
		p.nome = "Anderson";
		p.sobrenome = "Nascimento";
		p.dataNasc = "21/12/1973";
		p.rg = 10811869;
		String osTelefones[] = { "092991326221", "09221216508" };
		p.telefones = osTelefones;
		// Acessando os atributos para leitura
		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Data Nasc: " + p.dataNasc);
		System.out.println("RG: " + p.rg);
		System.out.println("Telefones: ");
		for (String fone : osTelefones) {
			System.out.println(fone);
		}
	}

}
