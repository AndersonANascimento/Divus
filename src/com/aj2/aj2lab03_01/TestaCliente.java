package com.aj2.aj2lab03_01;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
/**
 * @author Globalcode
 * 
 */
public class TestaCliente {

    public static void main(String[] args) {
        // Criacao do cliente
        Cliente cli = new Cliente();
        // Inicializacao do cliente usando o metodo inicializaCliente
        cli.inicializaCliente("Anderson Nascimento", "456.125.362-91");
        // Impressao dos dados do cliente
        cli.imprimeDados();
    }
}
