package br.divus.aj2.cap13;

/**
 * ExemploLancaRuntimeException - AJ2 - Código 13.2 - Página 311
 */
public class ExemploLancaRuntimeException {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Valor do parametro recebido = " + args[0]);
        } else {
            throw new RuntimeException();
        }
    }
}
