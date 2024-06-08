package br.divus.aj2.cap10;

/**
 * FormatadorModeloB - AJ2 - Código 10.6 - Página 210
 * 
 * @implNote Código 10.7 - corrigido - Página 211
 */
public class FormatadorModeloB extends FormatadorRecido {
    private String simboloMoeda;

    public String getSimboloMoeda() {
        return simboloMoeda;
    }

    public void setSimboloMoeda(String simboloMoeda) {
        this.simboloMoeda = simboloMoeda;
    }

    @Override
    public String gerarRecibo(String nomeCliente, double valor, String data, String motivo) {
        return "Recebemos de " + nomeCliente +
                " o valor de " + simboloMoeda + " " + valor +
                " referente a " + motivo + ".\n" +
                super.getNomeEmpresa() + ", " + data;
    }
}
