package br.divus.aj1.cap5;
/**
 * TesteOperadorPrePos - AJ1 - Código 10 - Página 68
 */
public class TesteOperadorPrePos {
    public static void main(String[] args) {
        // incremento pós-fixado, primeiro imprime depois incrementa
        int x = 5;
        System.out.println("x = " + x++);

        // decremento pós-fixado, primeiro imprime depois decrementa
        int y = 5;
        System.out.println("y = " + y--);

        // incremento prefixado, primeiro incrementa depois imprime
        int w = 5;
        System.out.println("w = " + ++w);

        // decremento prefixado, primeiro decrementa depois imprime
        int z = 5;
        System.out.println("z = " + --z);
    }    
}