package br.divus.aj2.cap9;

/**
 * TesteImpressaoEnum - AJ2 - Código 9.7 - Página 198
 */
import br.divus.aj2.cap9.Cliente.TipoCliente;

public class TesteImpressaoEnum {
    public static void main(String[] args) {
        Cliente c = new Cliente("Maria", "maria@gc.com.br", TipoCliente.PESSOA_FISICA);
        System.out.println("tipo de cliente criado = " + c.getTipo());
        System.out.print("Tipos de cliente: { ");
        for (TipoCliente tipo : TipoCliente.values()) {
            System.out.print(tipo + ", ");
        }
        System.out.println("}");
        System.out.print("Meses do Ano: { ");
        for (Mes mes : Mes.values()) {
            System.out.print(mes + ", ");
        }
        System.out.println("}");
    }
}
