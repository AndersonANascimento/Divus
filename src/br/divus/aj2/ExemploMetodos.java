package br.divus.aj2;

/**
 * ExemploMetodos - AJ2 - Código 1.6 - Página 23
 */
public class ExemploMetodos {

	// void indica que o método não terna nada
	void imprime() {
		System.out.println("Este método não retorna nada!");
	}
	// o método deve retornar um int ou tipo primitivo compatível, caso contrário haverá um erro de compilação
	int calculaFrete() {
		return 19;
	}
	// o método deve retornar um objeto da classe String, ou seja, um tipo reference
	String getNome() {
		return "Este método retorna uma String!";
	}
}
