package com.aj2.aj2lab01_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 * 1) Crie um objeto da classe Cliente 
 * 2) Inicialize todos os atributos deste objeto
 * 3) Imprima os valores dos atributos da classe Cliente de forma a obter o seguinte resultado:
 * 
 * --------------------------------- 
 * NOME: Globalcode     CPF : 123154 
 * ---------------------------------
 * 
 * Sugestões: 
 * Utilizando '\t' para tab
 * Ex: System.out.println("Texto\tTexto");
 * 
 * voce produzira a seguinte saída: 
 * Texto  Texto
 */
class TestaCliente {

    public static void main(String[] args) {
    	Cliente c = new Cliente();
    	
    	c.nome = "Globalcode";
    	c.cpf = "03333345987";
    	
    	System.out.println("----------------------------------------");
    	System.out.println("NOME: "+ c.nome +"\tCPF: "+ c.cpf);
    	System.out.println("----------------------------------------");
    }
}
