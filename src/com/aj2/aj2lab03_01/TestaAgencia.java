package com.aj2.aj2lab03_01;

/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
public class TestaAgencia {

    public static void main(String[] args) {
        // Inicializar um objeto do tipo Agencia
        Agencia ag = new Agencia();
        // usar o metodo inicializaAgencia (ver quais sao os parametros na classe
        // Agencia)
        ag.inicializaAgencia("3715", 237);
        // Imprimir os dados da agencia
        ag.imprimeDados();
    }
}
