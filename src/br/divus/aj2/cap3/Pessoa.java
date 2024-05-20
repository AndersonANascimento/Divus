package br.divus.aj2.cap3;

/**
 * Pessoa - AJ2 - Código 3.5 - Página 59
 * 
 * @implNote
 *           Código 3.14 - Atualizações - Página 67
 */
public class Pessoa {
    public String rg;
    public String nome;

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
        System.out.println(rg + " : " + nome);
    }
}
