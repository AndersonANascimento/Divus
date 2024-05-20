package br.divus.aj2.cap4;

/**
 * CalculadoraAmbigua - AJ2 - Código 4.6 - Página 84
 */
public class CalculadoraAmbigua {
    public int soma(byte a, byte b) {
        System.out.println("Soma de byte");
        return a + b;
    }

    public long soma(long a, long b) {
        System.out.println("Soma de long");
        return a + b;
    }

    public double soma(double a, double b) {
        System.out.println("Soma de double");
        return a + b;
    }
}
