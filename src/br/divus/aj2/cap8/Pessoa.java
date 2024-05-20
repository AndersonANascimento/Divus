package br.divus.aj2.cap8;

import br.ConsoleColors;

/**
 * Pessoa - AJ2 - Código 3.5 - Página 59
 * 
 * @implNote Código 3.14 - Atualizações - Página 67
 * @implNote Código 8.4 - Atualizações de Herança - Página 159
 * @implNote Código 8.9 - Atualizações de atributos protected - Página 163
 * @implNote Código 8.12 - Com construtor que recebe parâmetros - Página 168
 * @implNote Código 8.20 - Com sobrescrita do método toString - Página 168
 */
public class Pessoa {
    protected Endereco endereco;
    protected String nome, rg;
    
    public Pessoa(Endereco endereco, String nome, String rg) {
        System.out.println("Construtor da classe Pessoa");
        this.setEndereco(endereco);
        this.setNome(nome);
        this.setRg(rg);
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
    
    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(ConsoleColors.RED_BRIGHT + "* * * Dados de Pessoa * * *");
        System.out.println("Nome: " + nome);
        System.out.println("RG..: " + rg);
        System.out.print("Endereço: " + endereco.getRua());
        System.out.println(", " + endereco.getNumero() + ConsoleColors.RESET);
    }

    public String toString() {
        String tmpPessoa = super.toString() + "\nNome: " + nome + "\n";
        tmpPessoa += "RG..: " + rg + "\n";
        tmpPessoa += "Endereço: " + endereco.getRua() + ", " + endereco.getNumero();
        return tmpPessoa;
    }
}
