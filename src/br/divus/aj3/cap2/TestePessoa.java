package br.divus.aj3.cap2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TestePessoa {
    public static void main(String[] args) {
        // Criando várias instâncias da classe Pessoa
        PessoaComp p1 = new PessoaComp("João Silva", 123, "20/05/1965");
        PessoaComp p2 = new PessoaComp("Joana Soares", 1, "28/02/1934");
        PessoaComp p3 = new PessoaComp("Mauricio Costa", 1236, "14/07/1977");
        PessoaComp p4 = new PessoaComp("Carina Salgado", 11111, "1/5/1982");
        PessoaComp p5 = new PessoaComp("João Silva", 123, "20/05/1965");
        PessoaComp p6 = new PessoaComp("João Silva", 1234, "20/05/1965");

        Set<PessoaComp> pessoas = new TreeSet<>();
        pessoas.add(p1);
        pessoas.add(p2);
        pessoas.add(p3);
        pessoas.add(p4);
        pessoas.add(p5);
        pessoas.add(p6);

        Iterator<PessoaComp> iterator = pessoas.iterator();

        System.out.println("Lista dos Nomes em ordem alfabética dos nomes: \n");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
