package br.divus.aj2.cap6;

/**
 * TestaCalculadoraStatic - AJ2 - Código 6.7 - Página 122
 */
public class TestaCalculadoraStatic {
    public static void main(String[] args) {
        System.out.println("1 + 9 = " + CalculadoraStatic.soma(1, 9));
        System.out.println("1 + 9.0F = " + CalculadoraStatic.soma(1, 9.0F));
        int[] numeros = { 1, 3, 6 };
        System.out.println("1 + 3 + 6 = " + CalculadoraStatic.soma(numeros));
    }
}
