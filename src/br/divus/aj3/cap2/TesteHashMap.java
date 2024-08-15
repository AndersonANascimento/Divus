package br.divus.aj3.cap2;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class TesteHashMap {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marcio Oliveira", 11111L, "04/10/1970");
        Pessoa p2 = new Pessoa("Armando Silva", 22222L, "11/12/1987");
        Pessoa p3 = new Pessoa("Fernanda Santos", 33333L, "09/05/1964");

        Map<Long, Pessoa> pessoas = new HashMap<>();
        pessoas.put(p1.getCpf(), p1);
        pessoas.put(p2.getCpf(), p2);
        pessoas.put(p3.getCpf(), p3);

        imprimeMap(pessoas);
        removeElemento(pessoas, 22222L);
        imprimeMap(pessoas);
    }

    private static void removeElemento(Map<Long, Pessoa> pessoas, long chave) {
        Pessoa pessoaRemovida = null;
        if (pessoas.containsKey(chave)) {
            System.out.println("\n===== Removendo Elemento do Map =====\n");
            pessoaRemovida = pessoas.remove(chave);
            System.out.println("Pessoa removida: " + pessoaRemovida);
        } else {
            System.out.println("Chave não encontrada no HashMap");
        }
    }

    private static void imprimeMap(Map<Long, Pessoa> pessoas) {
        System.out.println("\n======= Impressão do Map =======");
        Set<Long> chaves = pessoas.keySet();
        Iterator<Long> i = chaves.iterator();
        while (i.hasNext()) {
            Long chave = i.next();
            System.out.println("[Chave]: " + chave);
            System.out.println(pessoas.get(chave) + "\n");
        }
    }
}
