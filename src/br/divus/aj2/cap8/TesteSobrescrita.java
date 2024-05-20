package br.divus.aj2.cap8;

/**
 * TesteSobrescrita - AJ2 - Código 8.19 - Página 175
 */
public class TesteSobrescrita {
    public static void main(String[] args) {
        // Criando o endereço para o funcionário f
        Endereco end1 = new Endereco("Rua das tulipas", 1200);

        // Criando a pessoa p e imprimindo seus dados
        Pessoa p = new Pessoa(end1, "Pedro da Silva", "1234545");
        p.imprime();

        System.out.println();

        // Criando o funcionário f
        // Funcionario f = new Funcionario();
        Funcionario f = new Funcionario(end1, "Pedro da Silva", "1234545", 123434L, 10000, "16/04/2001");
        f.imprime();

    }
}
