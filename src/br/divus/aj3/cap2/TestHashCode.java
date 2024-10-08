package br.divus.aj3.cap2;

public class TestHashCode {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Marcio Oliveira", 1192030021L, "04/10/1970");
        Pessoa p2 = new Pessoa("Armando Silva", 321654987L, "11/12/1987");
        Pessoa p3 = new Pessoa("Marcio Oliveira", 1192030021L, "04/10/1970");

        System.out.println("codigo hash de p1: " + p1.hashCode());
        System.out.println("codigo hash de p2: " + p2.hashCode());
        System.out.println("codigo hash de p3: " + p3.hashCode());

        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p2 equals p3: " + p2.equals(p3));
        System.out.println("p3 equals p1: " + p3.equals(p1));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        p1.setNome("Armando Silva");
        p1.setCpf(321654987L);
        System.out.println("Nome em p1: " + p1.getNome());
        System.out.println("Nome em p3: " + p3.getNome());

        System.out.println("codigo hash de p1: " + p1.hashCode());
        System.out.println("codigo hash de p2: " + p2.hashCode());
        System.out.println("codigo hash de p3: " + p3.hashCode());
        
        System.out.println("p1 equals p2: " + p1.equals(p2));
        System.out.println("p2 equals p3: " + p2.equals(p3));
        System.out.println("p3 equals p1: " + p3.equals(p1));

        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
