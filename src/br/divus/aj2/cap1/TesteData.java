package br.divus.aj2.cap1;

/**
 * TesteData - AJ2 - Código 1.12 - Página 27
 */
public class TesteData {

	public static void main(String[] args) {
		Data d = new Data();
		d.dia = 12;
		d.mes = 1;
		d.ano = 2004;
		d.imprime();

		String bi = d.isAnoBissexto() ? "" : " não ";
		System.out.println("O ano " + d.ano + " " + bi + "é bissexto");

		Data d2 = new Data();
		d2.dia = -20;
		d2.mes = 23;
		d2.ano = 9;
		d2.imprime();

		String bi2 = d2.isAnoBissexto() ? "" : "não ";
		System.out.println("O ano " + d2.ano + " " + bi2 + "é bissexto");
	}

}
