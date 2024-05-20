package br.divus.aj2.cap4;

/**
 * Produto - AJ2 - Código 4.4 - Página 82
 */
public class Produto {
	private double preco;
	private String descricao, marca;

	void inicializaValores(double umPreco, String umaMarca) {
		preco = umPreco;
		marca = umaMarca;
	}

	void inicializaValores(double umPreco, String umaDescricao, String umaMarca) {
		inicializaValores(umPreco, umaMarca);
		descricao = umaDescricao;
	}

	String getDescricao() {
		return descricao;
	}

	void setDescricao(String novaDescricao) {
		descricao = novaDescricao;
	}

	String getMarca() {
		return marca;
	}

	void setMarca(String marca) {
		this.marca = marca;
	}

	double getPreco() {
		return preco;
	}

	void setPreco(double preco) {
		if (preco > 0) {
			this.preco = preco;
		}
	}

	void aumentarPreco(double porcentagem) {
		if (porcentagem > 0) {
			System.out.println("aumentando o preço em " + porcentagem + "%!");
			porcentagem = 1 + (porcentagem / 100);
			preco *= porcentagem;
			System.out.println("Novo preço = " + preco);
		} else {
			System.out.println("aumento deve ser maior do que zero!");
		}
	}

	void imprime() {
		System.out.println("------------------------------");
		System.out.println("Produto: " + descricao);
		System.out.println("Marca  : " + marca);
		System.out.println("Preço  : R$ " + preco);
		System.out.println("------------------------------");
	}

}
