package br.divus.aj2;

/**
 * Data - AJ2 - Código 1.1 - Página 11
 */
public class Data {
	//	Código 1.3 - declaração de atributos - Página 17
	int dia, mes, ano;
	//	Código 1.11 - declaração de métodos - Página 27
	boolean isAnoBissexto() {
		if (((ano % 4 == 0) && !(ano % 100 == 0)) || (ano % 400 == 0)) {
			return true;
		} else {
			return false;
		}
	}
	void imprime() {
		System.out.println(dia + "/" + mes + "/" + ano);
	}
}
