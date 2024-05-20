package br.divus.aj2.cap8;

import br.ConsoleColors;

/**
 * Funcionario - AJ2 - Código 8.6 - Página 160
 * 
 * @implNote
 *           Código 8.10 - Atualizações de variável implícita super - Página 165
 *           Código 8.13 - Chamando o construtor da superclasse - Página 169
 *           Código 8.18 - Sobrescrita do método imprime - Página 174
 */
public class Funcionario extends Pessoa {
    private long carteiraProfissional;
    private double salario;
    private String dataAdmissao;

    public Funcionario (Endereco endereco, String nome, String rg, long carteira, double salario, String dataAdmissao) {
        super(endereco, nome, rg);
        setCarteiraProfissional(carteira);
        setSalario(salario);
        setDataAdmissao(dataAdmissao);
        System.out.println("Construtor da classe Funcionario");
    }

    public long getCarteiraProfissional() {
        return carteiraProfissional;
    }

    public void setCarteiraProfissional(long carteiraProfissional) {
        this.carteiraProfissional = carteiraProfissional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDataAdmissao() {
        return dataAdmissao;
    }

    public void setDataAdmissao(String dataAdmissao) {
        this.dataAdmissao = dataAdmissao;
    }

    public void impressaoRecibo(int dia, int mes, int ano) {
        System.out.print(ConsoleColors.YELLOW_BRIGHT);
        System.out.println("\n------- Recibo pagamento -------");
        System.out.print("    Eu, " + super.nome + ", portador do RG nº ");
        System.out.print(super.rg + " declaro que recebi o valor de R$ " + salario);
        System.out.print(" referente ao meu pagamento no dia " + dia + "/" + mes + "/" + ano);
        System.out.print("\n--------------------------------");
        System.out.println(ConsoleColors.RESET);
    }

    public void imprime() {
        System.out.println("\nImprimindo dados do funcionário");
        super.imprime();
        System.out.println("Carteira profissional: " + carteiraProfissional);
        System.out.println("Salário..............: " + salario);
        System.out.println("Data de Admissão.....: " + dataAdmissao);
    }
}
