package br.divus.aj2.cap13;

/**
 * ExemploLancaException - AJ2 - Código 13.3 - Página 312
 */
public class ExemploLancaException {
    public static void main(String[] args) {
        if (args.length > 0) {
            System.out.println("Valor do parametro recebido = " + args[0]);
        } else {
            throw new Exception();
        }
    }
}
