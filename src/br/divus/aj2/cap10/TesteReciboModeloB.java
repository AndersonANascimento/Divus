package br.divus.aj2.cap10;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * TesteReciboModeloB - AJ2 - Código 10.8 - Página 211
 */
public class TesteReciboModeloB {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        FormatadorModeloB fB = new FormatadorModeloB(); // Classe abstrata não pode ser instanciada
        fB.setNomeEmpresa("Coffe & Milk");
        fB.setSimboloMoeda("Euros$");
        SimpleDateFormat df = new SimpleDateFormat("dd/MM/yyyy", Locale.getDefault());
        String strData = df.format(new java.util.Date());
        String texto = fB.gerarRecibo("Serafim da Silva", 4, strData, "café com bolinhos");
        System.out.println(texto);
    }
}
