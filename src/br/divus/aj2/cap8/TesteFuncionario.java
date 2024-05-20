package br.divus.aj2.cap8;

/**
 * TesteFuncionario - AJ2 - Código 8.7 - Página 161
 * 
 * @implNote
 * 
 *           Código 8.11 - utilizando o método impressaoRecibo - Página 166
 */
public class TesteFuncionario {
    public static void main(String[] args) {
        // Criando o endereço para o funcionário f
        Endereco end1 = new Endereco("Rua das tulipas", 1200);

        // Criando o funcionário f
        // Funcionario f = new Funcionario();
        Funcionario f = new Funcionario(end1, "Pedro da Silva", "1234545");

        // atribuindo as caracteristícas herdadas da classe Pessoa
        // f.setNome("Pedro da Silva");
        // f.setEndereco(end1);
        // f.setRg("1234545");

        // atribuindo as caracteristícas específicas da classe Funcionario
        f.setSalario(10000);
        f.setCarteiraProfissional(123434L);

        // Chamando um método definido na classe Pessoa que, por sua vez,
        // "conhece" apenas os atributos da classe Pessoa
        f.imprime();
        f.impressaoRecibo(16, 4, 2005);
    }
}
