package br.divus.aj2.cap1;

/**
 * TesteProduto - AJ2 - Código 1.10 - Página 26
 */
public class TesteProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.inicializaValores(9.0, "Produto X", "Marca Y");
		p.imprime();
		//	aumento de 10% no preço do produto
		p.preco *= 1.1;
		p.descricao = "Nova descrição";
		p.marca = "Sem marca";
		p.imprime();
	}

}
