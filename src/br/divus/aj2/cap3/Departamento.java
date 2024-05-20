package br.divus.aj2.cap3;

/**
 * Departamento - AJ2 - Código 3.15 - Página 69
 * 
 */
public class Departamento {
    private String nome;
    private Pessoa[] pessoas;
    private int numeroPosicoesLivres = 0;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Pessoa[] getPessoas() {
        return pessoas;
    }

    public void setPessoas(Pessoa[] pessoas) {
        this.pessoas = pessoas;
    }

    public void addPessoa(Pessoa pessoa) {
        System.out.println("Adicionando  " + pessoa.getNome() + " ao departamento...");
        if (numeroPosicoesLivres > 0) {
            System.out.println("Existem posições livres no departamento");
            pessoas[pessoas.length - numeroPosicoesLivres] = pessoa;
            numeroPosicoesLivres--;
        } else {
            System.out.println("Aumentando a capacidade de pessoas no depto...");
            Pessoa novoArrayPessoas[] = new Pessoa[pessoas.length + 1];
            for (int i = 0; i < pessoas.length; i++) {
                novoArrayPessoas[i] = pessoas[i];
            }
            novoArrayPessoas[novoArrayPessoas.length - 1] = pessoa;
            pessoas = novoArrayPessoas;
        }
    }

    public Pessoa getPessoa(String rg) {
        for (int i = 0; i < pessoas.length - numeroPosicoesLivres; i++) {
            if (pessoas[i].getRg().equals(rg))
                return pessoas[i];
        }
        return null;
    }

    public Pessoa removePessoa(Pessoa p) {
        String rgPessoa = p.getRg();
        int i = 0;

        while (i < pessoas.length - numeroPosicoesLivres) {
            if (pessoas[i].getRg().equals(rgPessoa)) {
                Pessoa pessoaRemovida = pessoas[i];
                pessoas[i] = pessoas[pessoas.length - 1 - numeroPosicoesLivres];
                pessoas[pessoas.length - 1 - numeroPosicoesLivres] = null;
                numeroPosicoesLivres++;
                System.out.println(pessoaRemovida.getNome() + " foi removido(a) do depto!");
                return pessoaRemovida;
            }
            i++;
        }
        return null;
    }

    public void imprime() {
        System.out.println("-------------------------");
        System.out.println("Departamento " + nome);
        
        if (pessoas != null) {
            for (int i=0; i < pessoas.length; i++) {
                if (pessoas[i] != null)
                    System.out.println("["+i+"] " + pessoas[i].getNome() + " " + pessoas[i].getRg());
                else
                    System.out.println("["+i+"] Posição Livre");
            }
        } else 
            System.out.println("Não há pessoas neste departamento");
        System.out.println("-------------------------");
    }
}
