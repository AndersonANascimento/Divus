package br.divus.aj2.cap9;

/**
 * TesteCliente - AJ2 - Código 9.2 - Página 194
 */
public class TesteCliente {
    public static void main(String[] args) {
        Cliente c = new Cliente("Maria", "maria@gc.com.br", Cliente.PESSOA_FISICA);
        System.out.println("tipo de cliente criado = " + c.getTipo());
    }
}
