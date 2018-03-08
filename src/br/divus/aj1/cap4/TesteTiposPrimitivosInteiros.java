package br.divus.aj1.cap4;
/**
 * TesteTiposPrimitivosInteiros - Código 3 - AJ1 - Página 53
 */
public class TesteTiposPrimitivosInteiros {

    public static void main(String[] args) {
        int i = 10;
        System.out.println(" int i = 10 => i = " + i);
        
        long l = 2566L;
        System.out.println(" long l = 2566L => l = " + l);

        long l2 = 2236565656l;
        System.out.println(" long l2 = 2236565656l => l2 = " + l2);

        // este valor cabe em um byte
        byte b = (byte) 123;
        System.out.println(" byte b = (byte) 123 => b = " + b);

        // este valor não cabe em um byte
        byte b2 = (byte) 123568545;
        System.out.println(" byte b2 = (byte) 123568545 => b2 = " + b2);

        // este valor cabe em um short
        short s = (short) 12565;
        System.out.println(" short s = (short) 12565 => s = " + s);

        // este valor não cabe em um short
        short s2 = (short) 1231321;
        System.out.println(" short s2 = (short) 1231321 => s = " + s2);

    }
}