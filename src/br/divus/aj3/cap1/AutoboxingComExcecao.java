package br.divus.aj3.cap1;

public class AutoboxingComExcecao {
    static Integer x;

    static void geraExcecao(int z) {
        int z2 = 5;
        System.out.println(z2 - z);
    }

    public static void main(String[] args) {
        // x = 3;
        geraExcecao(x);
    }
}
