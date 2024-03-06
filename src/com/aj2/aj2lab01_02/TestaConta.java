package com.aj2.aj2lab01_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaConta {

    public static void main(String[] args) {
        // Criação da conta
    	Conta c = new Conta();
        // Inicialização da conta
    	c.inicializaConta(1000,"2171-7", "Anderson", 3715, 237);
        // Impressão dos dados da conta
    	c.imprimeDados();
        // Saque da conta
    	c.saque(10);
        // Impressão dos dados da conta
    	c.imprimeDados();
        // Deposito em conta
    	c.deposito(20);
        // Impressão dos dados da conta
    	c.imprimeDados();
    }
}
