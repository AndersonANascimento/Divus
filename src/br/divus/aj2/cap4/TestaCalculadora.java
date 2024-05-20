package br.divus.aj2.cap4;

/**
 * TestaCalculadora - AJ2 - Código 4.3 - Página 81
 */
public class TestaCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("1 + 9 = " + calc.soma(1, 9));
        System.out.println("1 + 9.0F = " + calc.soma(1, 9.0F));
        int[] numeros = { 1, 3, 6 };
        System.out.println("1 + 3 + 6 = " + calc.soma(numeros));
    }
}
