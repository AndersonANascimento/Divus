package br.divus.aj3;

public class ComAutoboxing {
    public static void main(String[] args) {
        int i = 10;
        Integer objeto = i;
        if (objeto == 10) {
            System.out.println("objeto é igual a 10!");
        }
    }
}
