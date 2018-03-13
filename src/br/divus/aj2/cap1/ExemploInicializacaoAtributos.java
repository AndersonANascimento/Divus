package br.divus.aj2.cap1;

/**
 * ExemploInicializacaoAtributos - AJ2 - Código 1.5 - Página 20
 */
public class ExemploInicializacaoAtributos {

	public static void main(String[] args) {
		// Cria-se uma instância da classe Pessoa
		Pessoa p = new Pessoa();
		// Acessando os atributos para leitura
		System.out.println("Nome: " + p.nome + " " + p.sobrenome);
		System.out.println("Data Nasc: " + p.dataNasc);
		System.out.println("RG: " + p.rg);
		System.out.println("Telefones: " + p.telefones);
	}

}
