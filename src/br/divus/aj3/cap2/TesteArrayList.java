package br.divus.aj3.cap2;

import java.util.ArrayList;
import java.util.List;

public class TesteArrayList {
    public static void main(String[] args) {
        // Instanciando objetos da classe Pessoa
        Pessoa p1 = new Pessoa("Marcio Oliveira", 1192030021L, "04/10/1970");
        Pessoa p2 = new Pessoa("Armando Silva", 321654987L, "11/12/1987");
        Pessoa p3 = new Pessoa("Fernanda Santos", 1995116277L, "09/05/1964");

        // Adicionando as pessoas no ArrayList pessoas
        List<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        imprimeElementos(pessoas);

        // removendo elemento de indice 1
        System.out.println("\n=== removendo elemento (1)");
        Pessoa pessoaRemovida = pessoas.remove(1);
        System.out.println("    Pessoa removida \n\t" + pessoaRemovida);
        imprimeElementos(pessoas);
    }

    // método auxiliar para impressão dos elementos do ArrayList
    private static void imprimeElementos(List<Pessoa> pessoas) {
        System.out.println("\n=== Nº de pessoas: " + pessoas.size());
        // imprimindo os elementos do array
        for (int i = 0; i < pessoas.size(); i++) {
            System.out.println(" (" + i + ") ===> " + pessoas.get(i));
        }
    }
}
