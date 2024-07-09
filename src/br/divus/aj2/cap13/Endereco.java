package br.divus.aj2.cap13;

/**
 * Endereco - AJ2 - Código 13.15 - Página 159
 */
public class Endereco {
    private String rua;
    private int numero;

    public Endereco(String rua, int numero) throws NumeroInvalidoException {
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

    public void setNumero(int numero) throws NumeroInvalidoException {
        if (numero > 0) {
        this.numero = numero;
        } else {
            throw new NumeroInvalidoException(numero + " não é válido!");
        }
    }
}
