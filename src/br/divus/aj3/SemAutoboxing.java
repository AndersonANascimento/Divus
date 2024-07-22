package br.divus.aj3;

public class SemAutoboxing {
    public static void main(String[] args) {
        int i = 10;
        Integer objetoI = Integer.valueOf(i);
        if (objetoI.intValue() == 10) {
            System.out.println("Valor do objeto é igual a 10!");
        }
    }
}
