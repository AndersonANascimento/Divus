package com.aj2.aj2lab01_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 
 * 1) Crie um objeto da classe Conta 
 * 2) Inicialize todos os atributos deste objeto 
 * 3) Imprima os valores dos atributos da classe Conta de forma a obter o seguinte resultado:
 * 
 * ----------------------------- 
 * AGENCIA: 1 BANCO : 234 
 * NUMERO : 01945 
 * TITULAR: Globalcode 
 * SALDO : R$10000.0
 * -----------------------------
 * 
 * Sugestões: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saída: 
 * Texto  Texto
 */
class TestaConta {

    public static void main(String[] args) {
    	Conta c = new Conta();
    	
    	c.agencia = 3715;
    	c.banco = 237;
    	c.numero = "2171-7";
    	c.saldo = 1000L;
    	c.titular = "Anderson";
    	
    	System.out.println("--------------------------------------------");
    	System.out.println("AGENCIA: "+ c.agencia +"\tBanco: "+ c.banco);
    	System.out.println("Numero : "+ c.numero);
    	System.out.println("Titular: "+ c.titular);
    	System.out.println("Saldo  : R$ "+ c.saldo);
    	System.out.println("--------------------------------------------");
    }
}
