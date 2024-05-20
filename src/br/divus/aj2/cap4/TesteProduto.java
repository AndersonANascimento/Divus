package br.divus.aj2.cap4;

/**
 * TesteProduto - AJ2 - Código 4.5 - Página 83
 */
public class TesteProduto {

	public static void main(String[] args) {
		Produto p = new Produto();
		p.inicializaValores(9.0, "Produto X", "Marca Y");
		p.imprime();
		Produto p2 = new Produto();
		p2.inicializaValores(1000F, "Fiat");
		p2.imprime();
	}

}
