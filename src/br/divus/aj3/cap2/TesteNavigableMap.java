package br.divus.aj3.cap2;

import java.util.NavigableMap;
import java.util.TreeMap;

public class TesteNavigableMap {
    public static void main(String[] args) {
        Integer[] chaves = {1,5,7,4,9,6,10,8,2,3};
        NavigableMap<Integer, String> elementos = new TreeMap<>();
        for (Integer chave : chaves) {
            elementos.put(chave, "Elemento" + chave);
        }
        Integer chaveMenor = elementos.lowerKey(6);
        System.out.println("1ª chave menor que 6 => " + chaveMenor);

        NavigableMap<Integer, String> subConjunto = elementos.subMap(2, true, 5, true);
        System.out.println("Elementos do sub-conjunto:");
        for (Integer chave : subConjunto.keySet()) {
            System.out.println("Chave: " + chave + "\tValor: " + subConjunto.get(chave));
        }
    }
}
