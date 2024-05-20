package br.divus.aj2.cap5;

/**
 * ExemploInicializador - AJ2 - Código 5.11 - Página 102
 */
public class ExemploInicializador {
	// declaração de atributos
	private static int id = 0;
	private int atributo = 15;
	// bloco inicializador
	{
		System.out.println("Dentro do inicializador de instância");
		atributo = ++id;
		System.out.println("Valor do atributo = " + atributo);
	}

	// construtor
	public ExemploInicializador() {
		System.out.println("Dentro do construtor");
	}
	
	@Override
	protected void finalize() throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("***Removendo objeto " + atributo + " da memoria");
	}
}
