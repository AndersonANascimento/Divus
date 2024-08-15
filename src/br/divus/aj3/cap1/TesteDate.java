package br.divus.aj3.cap1;

import java.util.Date;

public class TesteDate {
    public static void main(String[] args) {
        Date agora = new Date();
        System.out.println("agora: " + agora);

        Date instanteX = new Date(1132023600000L);
        System.out.println("instanteX: " + instanteX);
        System.out.println("x ms: " + instanteX.getTime());

        Date umaData = new Date(98, 1, 5);
        System.out.println("uma data: " + umaData);

        Date outraData = new Date(109, 11, 16, 14, 37, 19);
        System.out.println("outra data: " + outraData);

        int ano = outraData.getYear(),
            mes = outraData.getMonth(),
            diaDoMes = outraData.getDate(),
            diaDaSemana = outraData.getDay(),
            horas = outraData.getHours(),
            minutos = outraData.getMinutes(),
            segundos = outraData.getSeconds();

        System.out.println("" + ano + mes + diaDoMes + diaDaSemana + horas + minutos + segundos);
    }
}
