package br.divus.aj2.cap6;

/**
 * CalculadoraStatic - AJ2 - Código 6.6 - Página 122
 */
public class CalculadoraStatic {
    public static int soma(int a, int b) {
        return a + b;
    }

    public static int soma(int a, int b, int c) {
        return soma(a, b) + c;
    }

    public static float soma(float a, float b) {
        return a + b;
    }

    public static long soma(int[] numeros) {
        long resultado = 0;
        for (int num : numeros) {
            resultado += num;
        }
        return resultado;
    }
}
