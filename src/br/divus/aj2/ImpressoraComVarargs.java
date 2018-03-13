package br.divus.aj2;

/**
 * ImpressoraComVarargs - AJ2 - Código 1.18 - Página 33
 */
public class ImpressoraComVarargs {
	void listaNomes(String ... nomes) {
		System.out.println("Lista de nomes recebidos: ");
		for (String nome : nomes) {
			System.out.println("\t" + nome);
		}
	}
	
	void listaNotas(String msg, double ... notas) {
		System.out.println(msg);
		for (double nota : notas) {
			System.out.println("\t" + nota);
		}
	}
}
