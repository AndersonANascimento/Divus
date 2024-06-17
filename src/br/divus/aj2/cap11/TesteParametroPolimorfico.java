package br.divus.aj2.cap11;

/**
 * TesteParametroPolimorfico - AJ2 - Código 11.13 - Página 252
 */
public class TesteParametroPolimorfico {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        p.setNome("Williamn Gates da Silva");
        p.setRg(181920212223L);

        Cliente c = new Cliente();
        c.setNome("Luiz Antonio Faria Lima");
        c.setRg(272829303132L);
        c.setCpf("6544566-54");

        Funcionario f = new Funcionario();
        f.setNome("Americo Vespucio da Gama");
        f.setRg(495051525354L);
        f.setSalario(2650.0);
        f.setCarteiraProfissional("86554877899");

        RelatorioPessoas relatorio = new RelatorioPessoas();
        relatorio.imprime(p);
        relatorio.imprime(c);
        relatorio.imprime(f);
    }
}
