package br.divus.aj3;

import br.ConsoleColors;

public class TesteString {
    public static void main(String[] args) {
        String nome = "Globalcode";
        char inicial = nome.charAt(0);
        System.out.print(ConsoleColors.GREEN_BRIGHT);
        System.out.println("Caracter Inicial = " + inicial);

        String nome1 = "Global";
        String nome2 = "code";
        String nome3 = nome1.concat(nome2);
        System.out.println("Nome: " + nome3);

        String nome4 = new String("Globalcode");
        int posicao = nome4.indexOf("code");
        System.out.println("Posição de \'code\': " + posicao);

        String nome5 = "GLOBALCode";
        String minusculas = nome5.toLowerCase();
        System.out.println(nome5);
        System.out.println(minusculas);

        String nome6 = " Globalcode ";
        String semEspaco = nome6.trim();
        System.out.println("String com espaço -" + nome6 + "-");
        System.out.println("String sem espaço -" + semEspaco + "-");
    }
}
