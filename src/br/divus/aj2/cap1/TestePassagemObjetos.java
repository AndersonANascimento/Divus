package br.divus.aj2.cap1;

/**
 * TestePassagemObjetos - AJ2 - Código 1.22 - Página 36
 */
public class TestePassagemObjetos {

	public static void main(String[] args) {
		Data data1 = new Data();
		System.out.println("Valores iniciais para data1: ");
		System.out.println("Dia: " + data1.dia);
		System.out.println("Mês: " + data1.mes);
		System.out.println("Ano: " + data1.ano);
		TestePassagemObjetos testador = new TestePassagemObjetos();
		testador.alteraData(data1);
		System.out.println("Valores atuais para data1: ");
		System.out.println("Dia: " + data1.dia);
		System.out.println("Mês: " + data1.mes);
		System.out.println("Ano: " + data1.ano);
	}
	
	void alteraData(Data data2) {
		data2.dia = 10;
		data2.mes = 12;
		data2.ano = 2018;
	}

}
