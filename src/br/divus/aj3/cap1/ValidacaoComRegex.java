package br.divus.aj3.cap1;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacaoComRegex {
    private static boolean validaEmail(String email) {
        return Pattern.matches("[A-Za-z0-9._-]+@([A-Za-z]+\\.)+[A-Za-z]+", email);
    }
    private static boolean validaFormatoCPF(String cpf) {
        Pattern padraoCPF = Pattern.compile("\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2}");
        Matcher matcher = padraoCPF.matcher(cpf);
        return matcher.matches();
    }
    public static void main(String[] args) {
        String param = args[0];
        if (validaEmail(param)) {
            System.out.println(param + " é um email válido!");
        } else {
            System.out.println(param + " é um email inválido!");
        }
        if (validaFormatoCPF(param)) {
            System.out.println(param + " é um CPF válido!");
        } else {
            System.out.println(param + " é um CPF inválido!");
        }
    }
}
