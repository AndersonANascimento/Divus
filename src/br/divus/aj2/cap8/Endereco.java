package br.divus.aj2.cap8;

/**
 * Endereco - AJ2 - Código 8.5 - Página 159
 */
public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero) {
        this.setRua(rua);
        this.setNumero(numero);
    }

    public String getRua() {
        return rua;
    }

    public void setRua(String rua) {
        this.rua = rua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
