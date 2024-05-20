package br.divus.aj2.cap8;

/**
 * ExemploSuperClasse - AJ2 - Código 8.15 - Página 171
 */
public class ExemploSuperClasse {
    int campoSuper = 25;
    {
        System.out.println("Bloco de inicialização da superclasse");
    }

    ExemploSuperClasse() {
        System.out.println("Construtor da superclasse");
    }
}
