package br.divus.aj2.cap3;

public class MauDepartamento {
    private String nome;
    private Pessoa[] pessoas;

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

    public void imprime() {
        System.out.println("-------------------------");
        System.out.println("Departamento " + this.getNome());
        
        if (pessoas != null) {
            for (int i=0; i < pessoas.length; i++) {
                System.out.println(pessoas[i].getNome());
            }
        } else 
            System.out.println("Não há pessoas neste departamento");
        System.out.println("-------------------------");
    }
}
