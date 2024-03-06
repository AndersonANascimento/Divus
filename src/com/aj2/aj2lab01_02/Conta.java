package com.aj2.aj2lab01_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * O método inicializaConta e util para evitar a necessidade de inicializar
 * atributo por atributo, desta forma podemos chamar um único método e passar
 * todos os parâmetros em uma única chamada.
 * 
 * 1) Implemente os métodos que nao foram implementados na classe Conta de 
 * acordo com a especificação nos métodos.
 */
class Conta {

	double saldo;
	String numero;
	String titular;
	int agencia;
	int banco;

	/**
	 * @param saldoInicial
	 *            : Saldo Inicial da conta
	 * @param num
	 *            : Número da conta
	 * @param tit
	 *            : Titular da conta
	 * @param ag
	 *            : Agência a qual a conta pertence
	 * @param bc
	 *            : Banco a qual a agência pertence
	 */
	void inicializaConta(double saldoInicial, String num, String tit, int ag,
			int bc) {
		System.out.println("Inicializando uma conta com os seguintes dados:");
		saldo = saldoInicial;
		numero = num;
		titular = tit;
		agencia = ag;
		banco = bc;
	}

	/*
	 * 1. Verificar se o valor do saque e positivo. 2. Verificar se ha saldo
	 * suficiente para efetuar o saque 2.1. Se o saldo for suficiente, efetuar o
	 * saque 2.2. Se o saldo for insuficiente imprimir na tela que o saldo e
	 * insuficiente
	 */
	/**
	 * @param valor
	 *            : valor a ser sacado da conta
	 */
	void saque(double valor) {
		if (valor < 0) {
			System.out
					.println("Saque não permitido, somente valores positivos são aceitos");
		} else {
			if (valor > saldo) {
				System.out.println("Saldo em conta insuficiente");
			} else {
				this.saldo -= valor;
				System.out.println("Saque de R$" + valor
						+ " realizado com sucesso");
			}
		}
	}

	/*
	 * 1. Verificar se o valor do deposito e positivo, se for efetue o deposito
	 */
	/**
	 * @param valor
	 *            : Valor a ser depositado da conta
	 */
	void deposito(double valor) {
		if (valor < 0) {
			System.out.println("Não são permitidos valores negativos");
		} else {
			this.saldo += valor;
			System.out.println("Deposito de R$"+ valor +" realizado com sucesso");
		}
	}

	/**
	 * Método para impressão de todos os dados da classe
	 */
	void imprimeDados() {
		System.out.println("\n----------------------------");
		System.out.println("AGÊNCIA: " + agencia + "\t BANCO:\t" + banco);
		System.out.println("NÚMERO.: " + numero);
		System.out.println("TITULAR: " + titular);
		System.out.println("SALDO..: " + saldo);
		System.out.println("-----------------------------\n");
	}

	/**
	 * @return saldo da conta
	 */
	double getSaldo() {
		return saldo;
	}
}
