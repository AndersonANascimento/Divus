package br.divus.aj3;

import java.util.Calendar;

public class TesteCalendarManipulacao {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();
        int minutos = cal.get(Calendar.MINUTE);
        int mes = cal.get(Calendar.MONTH);
        System.out.println("agora: " + cal.getTime());

        cal.add(Calendar.YEAR, -3);
        cal.set(Calendar.DAY_OF_MONTH, 10);
        cal.set(Calendar.HOUR_OF_DAY, 21);
        System.out.println("dia 10 às 21h, 03 anos atrás: " + cal.getTime());

        cal.add(Calendar.HOUR_OF_DAY, 5);
        System.out.println("+5 horas com add: " + cal.getTime());

        cal.set(Calendar.DAY_OF_MONTH, 10);
        cal.set(Calendar.HOUR_OF_DAY, 21);

        cal.roll(Calendar.HOUR_OF_DAY, 5);
        System.out.println("+5 horas com roll: " + cal.getTime());
    }
}
