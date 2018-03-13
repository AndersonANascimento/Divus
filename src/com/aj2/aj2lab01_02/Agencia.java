package com.aj2.aj2lab01_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Seguindo o modelo da classe Cliente, crie o metodo 
 *    inicializaAgencia da classe Agencia
 * 
 */
class Agencia {

	String numero;
	int banco;

	/**
	 * 
	 * @param numero
	 * 			número da agência
	 * @param banco 
	 * 			código de identificação do banco
	 */
	public void inicializaAgencia(String numero, int banco) {
		this.numero = numero;
		this.banco = banco;
	}

	/**
	 * Metodo para impressao de todos os dados da classe
	 */
	void imprimeDados() {
		System.out.println("----------------------");
		System.out.println("Agencia Nº " + numero);
		System.out.println("Banco Nº " + banco);
		System.out.println("----------------------");
	}
}
