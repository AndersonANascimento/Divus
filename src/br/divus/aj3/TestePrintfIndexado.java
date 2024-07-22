package br.divus.aj3;

import java.util.Date;

public class TestePrintfIndexado {
    public static void main(String[] args) {
        String nome = "José da Silva";
        double pagamento = 6500;
        Date data = new Date();
        // Utiliza indice 3 (3º parâmetro) na formatação '%td/%3$tm/%3$tY'
        System.out.printf("%s recebeu o pagamento de R$ %,.2f no dia %td/%3$tm/%3$tY", nome, pagamento, data);
    }
}
