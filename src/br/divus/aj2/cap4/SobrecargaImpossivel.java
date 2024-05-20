package br.divus.aj2.cap4;

public class SobrecargaImpossivel {
    public int multiplica(int a, int b) {
        return a * b;
    }
    public long multiplica(int c, int d) {
        return c * d;
    }

    public void usaMultiplica() {
        multiplica(100, 350);
    }
}
