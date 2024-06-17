package br.divus.aj2.cap11;

/**
 * TesteDynamicBinding - AJ2 - Código 11.11 - Página 251
 */
public class TesteDynamicBinding {
    public static void main(String[] args) {
        Funcionario f = new FuncionarioCLT();
        f.calculaPagamento();
        f = new FuncionarioPJ();
        f.calculaPagamento();
    }
}
