package br.divus.aj2.cap10;

/**
 * TesteReciboModeloA - AJ2 - Código 10.4 - Página 207
 */
public class TesteReciboModeloA {
    public static void main(String[] args) {
        FormatadorModeloA fA = new FormatadorModeloA(); // Classe abstrata não pode ser instanciada
        fA.setNomeEmpresa("Rain microsystems do Brasil");
        String strData = new java.util.Date().toString();
        String texto = fA.gerarRecibo("William Gates", 2000.0, strData, "Aluguel de servidores");
        System.out.println(texto);
    }
}
