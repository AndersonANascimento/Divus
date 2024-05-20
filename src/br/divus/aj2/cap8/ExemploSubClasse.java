package br.divus.aj2.cap8;

/**
 * ExemploSubClasse - AJ2 - Código 8.16 - Página 171
 */
public class ExemploSubClasse extends ExemploSuperClasse {
    int campo = 15;
    {
        System.out.println("Bloco de inicialização da subclasse");
    }

    ExemploSubClasse() {
        System.out.println("Construtor da subclasse");
    }
}
