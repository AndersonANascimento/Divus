package br.divus.aj3.cap1;

import java.util.Calendar;
import java.util.Date;

public class TesteCalendarInstanciacao {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        Date data = cal.getTime();
        System.out.println("data em cal: " + data);
        data.setYear(99);
        cal.setTime(data);
        System.out.println("data ajustada em cal: " + cal.getTime());
    }
}
