package br.divus.aj3.cap2;

public class TesteEquals {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Gabriela", 1112345L, "01/01/1980");
        Pessoa p2 = new Pessoa("Gabriela", 1112345L, "01/01/1980");

        if (p1.equals(p2)) {
            System.out.println("p1 == p2 utilizando comparador equals");
        } else {
            System.out.println("p1 != p2 utilizando comparador equals");
        }
    }
}
