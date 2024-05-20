package br.divus.aj2.cap8;

public class Sub extends Super{
    private int value = 15;

    @Override
    public int getValue() {
        return value;
    }

    public static void main(String[] args) {
        Sub sub = new Sub();
    }
}
