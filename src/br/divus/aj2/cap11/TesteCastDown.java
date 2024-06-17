package br.divus.aj2.cap11;

/**
 * TesteCastDown - AJ2 - Código 11.5 - Página 247
 */
public class TesteCastDown {
    public static void main(String[] args) {
        Cliente c = new Cliente();
        // Cast Up de Cliente para Pessoa
        Pessoa p = c;
        // Cast Down de Pessoa para Cliente
        Cliente c2 = (Cliente)p;
        // Criação de uma instância da classe Pessoa
        Pessoa p2 = new Pessoa();
        // Cast Down INVÁLIDO de Pessoa para Cliente
        // Cliente c3 = (Cliente)p2;

        System.out.println(c);
        System.out.println(p);
        System.out.println(c2);
        System.out.println(p2);
        // System.out.println(c3);
    }
}
