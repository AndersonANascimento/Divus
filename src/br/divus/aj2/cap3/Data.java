package br.divus.aj2.cap3;

/**
 * Data - AJ2 - Código 3.3 - Página 57
 * @implNote
 *           Código 3.8 - Encapsulamento de atributos - Página 63
 */
public class Data {
	private int dia, mes, ano;

	int getDia() {
		return dia;
	}

	void setDia(int dia) {
		this.dia = dia;
	}

	int getMes() {
		return mes;
	}

	void setMes(int mes) {
		this.mes = mes;
	}

	int getAno() {
		return ano;
	}

	void setAno(int ano) {
		this.ano = ano;
	}

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
