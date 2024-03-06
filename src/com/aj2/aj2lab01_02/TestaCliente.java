package com.aj2.aj2lab01_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaCliente {

    public static void main(String[] args) {
        // Criação do cliente
    	Cliente cli = new Cliente();
        // Inicialização do cliente
    	cli.inicializaCliente("Anderson", "45612536291");
        // Impressão dos dados do cliente
    	cli.imprimeDados();
    }
}
