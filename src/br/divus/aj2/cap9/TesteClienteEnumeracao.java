package br.divus.aj2.cap9;

import br.divus.aj2.cap9.Cliente.TipoCliente;

/**
 * TesteClienteEnumeracao - AJ2 - Código 9.4 - Página 196
 */
public class TesteClienteEnumeracao {
    public static void main(String[] args) {
        Cliente c = new Cliente("Maria", "maria@gc.com.br", TipoCliente.PESSOA_FISICA);
        System.out.println("tipo de cliente criado = " + c.getTipo());
    }
}
