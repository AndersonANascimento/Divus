package br.divus.aj3;

public class A {
    public static void main(String[] args) {
        // Teste de bytes
        byte primitiveByte = 1;
        Byte bb1 = Byte.valueOf(primitiveByte);
        Byte bb2 = Byte.valueOf("1");
        System.out.println(bb1.byteValue() + bb2.byteValue());

        // Teste com booleanos
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf(false);
        // Boolean b3 = Boolean.valueOf(TRUE);
        // Boolean b4 = Boolean.valueOf(FALSE);
        Boolean b5 = Boolean.valueOf("TrUe");
        Boolean b6 = Boolean.valueOf("fAlSe");

        // Teste de Strings
        String s1 = " abc " + " def ";
        String s2 = new String(s1);
        if (s1 == s2)
            System.out.println(" == funciona!");
        if (s1.equals(s2)) 
            System.out.println(".equals() funciona!");
        System.out.println(s1);
        System.out.println(s2);

        StringBuilder builder = new StringBuilder("asdfg");
        builder.insert(3, "qwert").reverse().append(123).delete(6, 9);
        System.out.println(builder);

    }
}
