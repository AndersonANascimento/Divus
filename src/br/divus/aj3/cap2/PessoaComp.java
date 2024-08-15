package br.divus.aj3.cap2;

/**
 * Pessoa - AJ3 - Auxiliar Código 2.1
 */
public class PessoaComp implements Comparable<Object> {
    private String nome;
    private long cpf;
    private String dataNascimento;

    public PessoaComp(String nome, long cpf, String dataNascimento) {
        this.nome = nome;
        this.cpf = cpf;
        this.dataNascimento = dataNascimento;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public long getCpf() {
        return this.cpf;
    }

    public void setCpf(long cpf) {
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void imprime() {
        System.out.println(cpf + " : " + nome);
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nome == null) ? 0 : nome.hashCode());
        result = prime * result + (int) (cpf ^ (cpf >>> 32));
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Pessoa other = (Pessoa) obj;
        if (!nome.equals(other.getNome()))
            return false;
        if (cpf != other.getCpf())
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "Pessoa {'nome': " + getNome()  + ", 'cpf':" + getCpf() + ", 'dataNascimento': " + getDataNascimento()
                 + ", toString()=" + super.toString() + "}";
    }

    @Override
    public int compareTo(Object o) {
        PessoaComp outrPessoaComp = (PessoaComp) o;
        String atributos = nome + cpf;
        String outrosAtributos = outrPessoaComp.getNome() + outrPessoaComp.getCpf();
        return atributos.compareTo(outrosAtributos);
    }
    
}
