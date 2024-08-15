package br.divus.aj3.cap2;

import java.util.ArrayDeque;
import java.util.Deque;

public class TesteDeque {
    public static void main(String[] args) {
        Deque<String> nomes = new ArrayDeque<>();
        nomes.add("João");
        nomes.add("Maria");
        nomes.add("Ana Paula");
        nomes.add("Amanda");

        while (!nomes.isEmpty()) {
            System.out.println(nomes.pollLast());
        }
    }
}
