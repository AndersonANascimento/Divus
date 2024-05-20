package com.aj2.aj2lab05_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java 
 * 1) Construa um objeto da classe Conta com cada construtor e chame o metodo imprimeDados 
 * 2) Construa um objeto da classe Cliente e chame o metodo imprimeDados
 * 
 */
public class TestaConstrutores {

    public static void main(String[] args) {
        Conta c1 = new Conta("2171-7", "Anderson Nascimento", "3715", 237);
        Conta c2 = new Conta(13000d, "2171-7", "Anderson Abreu", "3715", 237);
        c1.imprimeDados();
        c2.imprimeDados();

        Cliente cli = new Cliente("Anderson Nascimento", "456.125.362-91");
        cli.imprimeDados();
    }
}
