package br.divus.aj2.cap4;

/**
 * TestaCalculadoraAmbigua - AJ2 - Código 4.7 - Página 84
 */
public class TestaCalculadoraAmbigua {
    public static void main(String[] args) {
        CalculadoraAmbigua calc = new CalculadoraAmbigua();
        calc.soma(24, 25);
        byte a = 24, b = 25;
        calc.soma(a, b);
        calc.soma((byte) 24, (byte) 25);
        calc.soma(24d, 25d);
    }
}
