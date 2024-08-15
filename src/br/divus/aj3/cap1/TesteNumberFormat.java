package br.divus.aj3.cap1;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class TesteNumberFormat {
    public static void main(String[] args) {
        // Configuração da localidade
        String idioma = args[0];
        String pais = args[1];
        Locale localidade = new Locale(idioma, pais);

        // Criando formatadores
        NumberFormat formatadorNumerico = NumberFormat.getNumberInstance(localidade);
        NumberFormat formatadorPercentual = NumberFormat.getPercentInstance(localidade);
        NumberFormat formatadorMonetario = NumberFormat.getCurrencyInstance(localidade);
        NumberFormat formatadorInteger = NumberFormat.getIntegerInstance(localidade);

        // Configurando o número minimo de casas decimais
        formatadorNumerico.setMinimumFractionDigits(2);

        // Formatando alguns valores
        System.out.println("número....: " + formatadorNumerico.format(1000));
        System.out.println("moeda.....: " + formatadorMonetario.format(150.4));
        System.out.println("percentual: " + formatadorPercentual.format(.53));
        System.out.println("inteiro...: " + formatadorInteger.format(150.4));

        // Lendo valores
        Number valor;
        try {
            valor = formatadorNumerico.parse("150,4");
            System.out.println("numero lido: " + valor);
            valor = formatadorInteger.parse("150,4");
            System.out.println("inteiro lido: " + valor);
            valor = formatadorPercentual.parse("50.4%");
            System.out.println("percentual lido: " + valor);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
