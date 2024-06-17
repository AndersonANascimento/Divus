package br.divus.aj2.cap11;

/**
 * TesteCastUp - AJ2 - Código 11.4 - Página 246
 */
public class TesteCastUp {
    public static void main(String[] args) {
        // O objeto c foi declarado e instanciado como Cliente
        Cliente c = new Cliente();
        // Casting Up explicito do objeto da classe Cliente para a classe Pessoa
        Pessoa p = (Pessoa)c;
        // Casting Up do objeto da classe Cliente para a classe Pessoa
        Pessoa p2 = c;
        // Casting Up do objeto da classe Cliente para Pessoa
        Pessoa p3 = new Cliente();
        // Casting Up explícito do objeto da classe Cliente para a classe Object
        Object o = (Object) c;
        // Casting Up do objeto da classe Cliente para a classe Object
        Object o2 = c;
        
        System.out.println(c);
        System.out.println(p);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(o);
        System.out.println(o2);
    }
}
