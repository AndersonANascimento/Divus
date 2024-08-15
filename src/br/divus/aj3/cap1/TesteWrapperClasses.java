package br.divus.aj3.cap1;

import br.ConsoleColors;

public class TesteWrapperClasses {
    public static void main(String[] args) {
        System.out.print(ConsoleColors.GREEN_BRIGHT);
        System.out.println("Exemplo de utilização da classe Boolean:");
        Boolean b1 = Boolean.valueOf(true);
        Boolean b2 = Boolean.valueOf("true");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        System.out.println("bb1 = " + b1.booleanValue());
        System.out.println("bb2 = " + b2.booleanValue());
        // System.out.print(ConsoleColors.RESET);

        System.out.print(ConsoleColors.GREEN_BRIGHT);
        System.out.println("Exemplo de utilização da classe Integer:");
        Integer i1 = Integer.valueOf(12);
        Integer i2 = Integer.valueOf("12");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        System.out.println("i1 = " + i1.intValue());
        System.out.println("i2 = " + i2.intValue());
        String binaryString = Integer.toBinaryString(23);
        System.out.println("23 (em binário) = " + binaryString);
        int i3 = Integer.parseInt("12456");
        // System.out.print(ConsoleColors.RESET);
        
        System.out.print(ConsoleColors.GREEN_BRIGHT);
        System.out.println("Exemplo de utilização da classe Double:");
        Double d1 = Double.valueOf(45.9);
        Double d2 = Double.valueOf(45.5);
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        System.out.println("d1 = " + d1.doubleValue());
        System.out.println("d2 = " + d2.doubleValue());
        System.out.println("d1 (int) = " + d1.intValue());
        // System.out.print(ConsoleColors.RESET);
        
        System.out.print(ConsoleColors.GREEN_BRIGHT);
        System.out.println("Exemplo de utilização da classe Character:");
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        Character c1 = Character.valueOf('1');
        System.out.println("c1 = " + c1.charValue());

        char c2 = '1';
        boolean isDigit = Character.isDigit(c2);
        System.out.println(c2 + " é digito? " + isDigit);
        
        char c3 = 'a';
        boolean isLetterOrDigit = Character.isLetterOrDigit(c3);
        System.out.println(c3 + " é digito/letra? " + isLetterOrDigit);

        System.out.print(ConsoleColors.RESET);

    }
}
