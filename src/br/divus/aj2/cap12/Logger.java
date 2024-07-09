package br.divus.aj2.cap12;

/**
 * Logger - AJ2 - Código 12.17 - Página 282
 */
public class Logger {
    public static final int DEBUG = 0;
    public static final int ERROR = 0;
    public static void log(String msg, int level) {
        System.out.println("[" + level + "]" + msg);
    }
}
