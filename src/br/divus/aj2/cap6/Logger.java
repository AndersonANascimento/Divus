package br.divus.aj2.cap6;

/**
 * Logger - AJ2 - Código 6.8 - Página 123
 */
public class Logger {
    private static int qtdLogs;

    public static void logIt(String mensagem) {
        String dataHora = "" + new java.util.Date();
        System.out.println(dataHora + " : " + qtdLogs + " : " + mensagem);
        qtdLogs++;
    }
}
