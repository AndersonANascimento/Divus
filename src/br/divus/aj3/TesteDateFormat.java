package br.divus.aj3;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class TesteDateFormat {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.MONTH, 2);
        cal.set(Calendar.YEAR, 2019);
        Date data = cal.getTime();

        Locale franca = Locale.FRANCE;
        Locale alemanha = Locale.GERMANY;
        Locale eua = Locale.US;
        Locale brasil = new Locale("pt", "BR");
        Locale[] variosLocais = {franca, alemanha, eua, brasil};

        for (Locale locale : variosLocais) {
            DateFormat formatador = DateFormat.getDateInstance(DateFormat.LONG, locale);
            System.out.println(formatador.format(data));
        }
    }
}
