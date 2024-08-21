package br.divus.aj3.cap3;

public class Produto {
    private int id;
    private String nome;
    private int preco;

    public Produto() {
        super();
    }

    public Produto(String nome, int preco) {
        this.setNome(nome);
        this.setPreco(preco);
    }

    public Produto(int id, String nome, int preco) {
        this(nome, preco);
        this.setId(id);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPreco() {
        return preco;
    }

    public void setPreco(int preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "Produto: {'id': " + id + ", 'nome': '" + nome + "', 'preco': 'R$ " + preco + "'}";
    }
}
