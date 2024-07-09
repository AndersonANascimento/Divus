package br.divus.aj2.cap13;

public class TesteEnderecoTratandoErro {
    public static void main(String[] args) {
        try {
            Endereco e = new Endereco("Tv. Arapoti", 0);
            System.out.println(e);
        } catch (NumeroInvalidoException e) {
            e.printStackTrace();
        }
    }
}