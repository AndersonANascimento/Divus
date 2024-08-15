package br.divus.aj3.cap2;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class TesteLinkedHashSet {
    public static void main(String[] args) {
        Set<String> nomes = new LinkedHashSet<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Ana Paula");
        nomes.add("Amanda");
        nomes.add("João");

        Iterator<String> iterator = nomes.iterator();

        int i = 0;
        System.out.println("Lista dos Nomes: \n");
        while (iterator.hasNext()) {
            String nome = iterator.next();
            System.out.println("Nome[" + i++ + "] " + nome);
        }
    }
}
