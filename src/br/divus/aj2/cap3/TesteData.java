package br.divus.aj2.cap3;

/**
 * TesteData - AJ2 - Código 3.4 - Página 58
 * @implNote
 *           Código 3.9 - Tentativa de acesso a atributos privados - Página 63
 */
public class TesteData {

	public static void main(String[] args) {
		Data d = new Data();
		// tentativa de acesso a atributos privados - Página 63
		// d.dia = 12;
		// d.mes = 1;
		// d.ano = 2004;

		d.setDia(12);
		d.setMes(1);
		d.setAno(2004);
		d.imprime();

		String bi = d.isAnoBissexto() ? "" : " não ";
		System.out.println("O ano " + d.getAno() + " " + bi + "é bissexto");
	}

}
