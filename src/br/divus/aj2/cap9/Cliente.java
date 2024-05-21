package br.divus.aj2.cap9;

/**
 * Cliente - AJ2 - Código 9.1 - Página 193
 * 
 * @implNote Código 9.3 - com enumeração - Página 195
 */
public class Cliente {
    public enum TipoCliente { PESSOA_FISICA, PESSOA_JURIDICA };
    private TipoCliente tipo;
    private String nome, email;
    //  Com constantes estáticas
    // public final static int PESSOA_JURIDICA = 1;
    // public final static int PESSOA_FISICA = 2;
    // private int tipo;

    /**
     * @param n nome do cliente
     * @param e email do cliente
     * @param t tipo de cliente
     */
    public Cliente(String nome, String email, TipoCliente tipo) {
        this.nome = nome;
        this.email = email;
        this.tipo = tipo;
    }
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public TipoCliente getTipo() {
        return tipo;
    }

    public void setTipo(TipoCliente tipo) {
        this.tipo = tipo;
    }
}
