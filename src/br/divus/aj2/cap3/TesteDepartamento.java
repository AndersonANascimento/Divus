package br.divus.aj2.cap3;

/**
 * TesteDepartamento - AJ2 - Código 3.16 - Página 72
 * 
 */
public class TesteDepartamento {
    public static void main(String[] args) {
        // Criação das pessoas para o array de pessoas do departamento
        Pessoa p1 = new Pessoa();
        p1.setNome("Renato");
        p1.setRg("11111");
        Pessoa p2 = new Pessoa();
        p2.setNome("Fernanda");
        p2.setRg("22222");
        // Criação do array de pessoas para o depto 
        Pessoa pessoasDpto[] =  {p1, p2};
        // Criação do departamento
        Departamento d = new Departamento();
        d.setNome("Departamento Compras");
        d.setPessoas(pessoasDpto);
        System.out.println("Departamento recem criado!");
        d.imprime();

        Pessoa novaPessoa = new Pessoa();
        novaPessoa.setNome("Nova Pessoa da Silva");
        novaPessoa.setRg("33333");
        d.addPessoa(novaPessoa);
        d.imprime();

        d.removePessoa(p1);
        d.imprime();

        Pessoa p3 = new Pessoa();
        p3.setNome("Raquel");
        p3.setRg("33333");
        d.addPessoa(p3);
        d.imprime();

        Pessoa p4 = new Pessoa();
        p4.setNome("Gustavo");
        p4.setRg("44444");
        d.addPessoa(p4);
        d.imprime();

        System.out.println("Procurando a pessoa com rg = 33333");
        Pessoa procurada1 = d.getPessoa("33333");
        if (procurada1 != null) System.out.println(procurada1.getNome());

        System.out.println("Procurando a pessoa com rg = 555");
        Pessoa procurada2 = d.getPessoa("555");
        if (procurada2 != null) 
            System.out.println(procurada2.getNome());
        else 
            System.out.println("Pessoa não encontrada!");
    }
}
