package br.divus.aj3.cap2;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;

public class Main {
    public static void main(String[] args) {
        Object a = new HashSet<>();
        System.out.println((a instanceof Set) + ", ");
        System.out.println(a instanceof SortedSet);
    }
}
