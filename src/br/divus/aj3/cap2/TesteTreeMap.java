package br.divus.aj3.cap2;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

public class TesteTreeMap {
    public static void main(String[] args) {
        Pessoa p2 = new Pessoa("Armando Silva", 22222L, "11/12/1987");
        Pessoa p1 = new Pessoa("Marcio Oliveira", 11111L, "04/10/1970");
        Pessoa p3 = new Pessoa("Fernanda Santos", 33333L, "09/05/1964");

        Map<Long, Pessoa> pessoas = new TreeMap<>();
        pessoas.put(p3.getCpf(), p3);
        pessoas.put(p1.getCpf(), p1);
        pessoas.put(p2.getCpf(), p2);

        imprimeMap(pessoas);
    }

    private static void imprimeMap(Map<Long, Pessoa> pessoas) {
        Set<Long> chaves = pessoas.keySet();
        Iterator<Long> iterator = chaves.iterator();
        while (iterator.hasNext()) {
            Long chave = iterator.next();
            System.out.println("[Chave]: " + chave);
            System.out.println(pessoas.get(chave));
        }
    }
}
