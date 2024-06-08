package br.divus.aj2.cap10;

/**
 * TesteRecibo - AJ2 - Código 10.2 - Página 206
 */
public class TesteRecibo {
    public static void main(String[] args) {
        FormatadorRecido fr = new FormatadorRecibo(); // Classe abstrata não pode ser instanciada
        fr.setNomeEmpresa("Rain microsystems do Brasil");
        String strData = new java.util.Date().toString();
        String texto = fr.gerarRecibo("William Gates", 2000.0, strData, "Aluguel de servidores");
    }
}
