package br.divus.aj3.cap1;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TesteSimpleDateFormat {
    public static void main(String[] args) {
        SimpleDateFormat formatador = new SimpleDateFormat("dd/MM/yyyy");
        Date dataOriginal = new Date();
        System.out.println("data original: " + dataOriginal); 
        String textoFormatado = formatador.format(dataOriginal);
        System.out.println("texto formatado: " + textoFormatado);

        String textoParaConverter = "11/07/2004";
        Date dataConvertida;
        try {
            dataConvertida = formatador.parse(textoParaConverter);
            System.out.println("data convertida: " + dataConvertida);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
