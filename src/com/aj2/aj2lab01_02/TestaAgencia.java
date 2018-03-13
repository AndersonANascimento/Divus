package com.aj2.aj2lab01_02;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
class TestaAgencia {

    public static void main(String[] args) {
        // Criacao da agencia
    	Agencia ag = new Agencia();
        // Inicializacao da agencia
    	ag.inicializaAgencia("3715", 237);
        // Impressao dos dados da agencia
    	ag.imprimeDados();
    }
}
