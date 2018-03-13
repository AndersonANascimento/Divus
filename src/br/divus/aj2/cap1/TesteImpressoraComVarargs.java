package br.divus.aj2.cap1;

/**
 * TesteImpressoraComVarargs - AJ2 - Código 1.19 - Página 33
 */
public class TesteImpressoraComVarargs {
	public static void main(String[] args) {
		ImpressoraComVarargs imp = new ImpressoraComVarargs();
		imp.listaNomes("Marcos da Silva","Roberto da Costa","Ana Maria Soares");
		// método que recebe uma String e varargsdo tipo double
		imp.listaNotas("Lista de notas recebidos: ", 7.5, 8.75, 5.5);
	}
}
