package br.divus.aj2.cap10;

/**
 * FormatadorRecido - AJ2 - Código 10.1 - Página 206
 * 
 * @implNote Código 10.5 - com método abstrato - Página 10.5
 */
public abstract class FormatadorRecido {
    private String nomeEmpresa;

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public abstract String gerarRecibo(String nomeCliente, double valor, String data, String motivo);
}
