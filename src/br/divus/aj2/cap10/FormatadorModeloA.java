package br.divus.aj2.cap10;

/**
 * FormatadorModeloA - AJ2 - Código 10.3 - Página 207
 */
public class FormatadorModeloA extends FormatadorRecido {
    @Override
    public String gerarRecibo(String nomeCliente, double valor, String data, String motivo) {
        return "Nós da " + super.getNomeEmpresa() +
                " recebemos de " + nomeCliente +
                " em " + data +
                " o valor de R$ " + valor +
                " referente a " + motivo;
    }
}
