package br.divus.aj2.cap4;

/**
 * Calculadora - AJ2 - Código 4.2 - Página 81
 */
public class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public int soma(int a, int b, int c) {
        return soma(a, b) + c;
    }

    public float soma(float a, float b) {
        return a + b;
    }

    public long soma(int[] numeros) {
        long resultado = 0;
        for (int num : numeros) {
            resultado += num;
        }
        return resultado;
    }
}
