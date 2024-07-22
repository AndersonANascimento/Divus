package br.divus.aj3;

import br.ConsoleColors;

public class ComparacaoString {
    public static void main(String[] args) {
        if (args.length == 2) {
            String str1 = args[0];
            String str2 = args[1];

            if (str1 == str2) {
                System.out.println("Strings são iguais utilizando o operador == ");
            } else {
                System.out.println("Strings NÃO são iguais utilizando o operador == ");
            }

            if (str1.equals(str2)) {
                System.out.println("Strings são iguais utilizando o 'equals' ");
            } else {
                System.out.println("Strings NÃO são iguais utilizando o 'equals' ");
            }

            if (str1.equalsIgnoreCase(str2)) {
                System.out.println("Strings são iguais utilizando o 'equalsIgnoreCase' ");
            } else {
                System.out.println("Strings NÃO são iguais utilizando o 'equalsIgnoreCase' ");
            }

            int dif = str1.compareTo(str2);
            if (dif == 0) {
                System.out.println("Strings são iguais utilizando o 'compareTo' ");
            } else {
                System.out.println("Strings NÃO são iguais utilizando o 'compareTo' ");
            }
        } else {
            System.err.println(ConsoleColors.RED_BOLD_BRIGHT + "Sintaxe correta: java ComparacaoString <str1> <str2>" + ConsoleColors.RESET);
        }
    }
}
