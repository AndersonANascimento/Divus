package br.divus.aj2.cap1;

/**
 * Produto - AJ2 - Código 1.9 - Página 26
 */
public class Produto {
	double preco;
	String descricao, marca;
	
	void inicializaValores(double umPreco, String umaDescricao, String umaMarca) {
		preco = umPreco;
		descricao = umaDescricao;
		marca = umaMarca;
	}
	
	void imprime() {
		System.out.println("------------------------------");
		System.out.println("Produto: " + descricao);
		System.out.println("Marca  : " + marca);
		System.out.println("Preço  : R$ " + preco);
		System.out.println("------------------------------");
	}
}
