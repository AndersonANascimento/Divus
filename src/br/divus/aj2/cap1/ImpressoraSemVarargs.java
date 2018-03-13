package br.divus.aj2.cap1;

/**
 * ImpressoraSemVarargs - AJ2 - Código 1.16 - Página 31
 */
public class ImpressoraSemVarargs {
	void listaNomes(String[] nomes) {
		System.out.println("Lista de nomes recebidos: ");
		for (String nome : nomes) {
			System.out.println("\t" + nome);
		}
	}
	
	void listaNotas(double[] notas) {
		System.out.println("Lista de notas recebidos: ");
		for (double nota : notas) {
			System.out.println("\t" + nota);
		}
	}
	
}
