package br.divus.aj2.cap13;

public class TesteEnderecoRelancandoErro {
    public static void main(String[] args) throws NumeroInvalidoException {
        Endereco e = new Endereco("Tv. Arapoti", 0);
        System.out.println(e);
    }
}
