package br.divus.aj2.cap9;

/**
 * TesteMes - AJ2 - Código 9.6 - Página 197
 */
public class TesteMes {
    public static void main(String[] args) {
        Mes mes = Mes.JANEIRO;
        String mensagem = (mesFeriasEscolares(mes) ? " " : " não ") + "é mês de férias escolares";
        System.out.println(mes + mensagem);
    }

    private static boolean mesFeriasEscolares(Mes mes) {
        switch (mes) {
            case DEZEMBRO:
            case JANEIRO:
            case FEVEREIRO:
            case JULHO:
                return true;
            default:
                return false;
        }
    }
}
