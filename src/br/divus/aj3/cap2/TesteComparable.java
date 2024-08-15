package br.divus.aj3.cap2;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteComparable {
    public static void main(String[] args) {
        Set<String> nomes = new TreeSet<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Ana Paula");
        nomes.add("Amanda");
        nomes.add("João");
        nomes.add("Anderson");
        nomes.add("Michele");

        Iterator<String> iterator = nomes.iterator();

        int i = 0;
        System.out.println("Lista dos Nomes em ordem alfabética dos nomes: \n");
        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println("Nome[" + i++ + "] " + nome);
        }
    }
}
