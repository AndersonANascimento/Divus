package br.divus.aj3.cap2;

public class Cliente {
    private String nome = null;
    private int id;
    private int qtdPedidos;
    
    public Cliente(int id, String nome, int qtdPedidos) {
        this.id = id;
        this.nome = nome;
        this.qtdPedidos = qtdPedidos;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getQtdPedidos() {
        return qtdPedidos;
    }
    public void setQtdPedidos(int qtdPedidos) {
        this.qtdPedidos = qtdPedidos;
    }
    @Override
    public String toString() {
        return "Cliente [id=" + id + ", nome=" + nome + ", qtdPedidos=" + qtdPedidos + "]";
    }
}
