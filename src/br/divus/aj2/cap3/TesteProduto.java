package br.divus.aj2.cap3;

/**
 * TesteProduto - AJ2 - Código 3.2 - Página 56
 * 
 * @implNote
 *           Código 3.7 - Tentativa de acesso a atributos privados - Página 62
 */
public class TesteProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.inicializaValores(9.0, "Produto X", "Marca Y");
		p.imprime();
		
		// tentativa aumento de 10% no preço do produto - Página 62
		// p.preco *= 1.1;
		// p.descricao = "Nova descrição";
		// p.marca = "Sem marca";

		p.aumentarPreco(10);
		p.setDescricao("Casual Class");
		p.setMarca("Globalcode");
		p.imprime();
	}

}
