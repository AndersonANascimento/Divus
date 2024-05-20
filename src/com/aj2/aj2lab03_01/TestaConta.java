package com.aj2.aj2lab03_01;
/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */

public class TestaConta {

    public static void main(String[] args) {
        // Criar um objeto do tipo Conta
        Conta c = new Conta();
        // Usar o metodo inicializaConta para fazer a inicializacao do objeto criado
        c.inicializaConta(13000.00, "2171-7", "Anderson Nascimento", 3715, 237);
        // executar um deposito
        c.deposito(1000.00);
        // Imprimir o saldo apos o deposito
        c.imprimeDados();
        // executar um saque cujo valor seja menor que o saldo
        c.saque(500.00);
        // Imprimir o saldo apos o deposito
        c.imprimeDados();
        // executar uma retirada cujo valor seja maior que o saldo
        c.saque(15000.00);
        // Imprimir o saldo apos o deposito
        c.imprimeDados();
    }
}
