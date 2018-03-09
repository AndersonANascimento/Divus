package br.divus.aj1.cap7;

/**
 * TesteArray - AJ1 - Código 39 - Página 118
 */
public class TesteArray {

	public static void main(String[] args) {
		// Declaração de um array e inicialização
		float[] teste = {1f, 2.5f, 3f, 4.12f, 5.6f};
		
		System.out.println("--- Imprimindo os elementos do array ---");
		for (int i = 0; i < teste.length; i++) {
			// Para acessarmos as linhas da matriz, utilizamos: teste[posicao]
			System.out.println(teste[i]);
		}
		
		// número de caracteres do alfabeto
		int numeroCaracteres = 26;
		// caractere ASCII da letra 'A'
		int ascCaractereA = 65;
		// criamos um array de char com 26 posições
		char[] arrayCaractere = new char[numeroCaracteres];
		// vamos inicilizar o array com as letras do alfabeto
		for (int i = 0; i < numeroCaracteres; i++) {
			arrayCaractere[i] = (char)(ascCaractereA + i);
		}
		System.out.println(arrayCaractere);
	}

}
