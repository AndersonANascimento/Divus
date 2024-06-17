package br.divus.aj2.cap11;

/**
 * TesteOperadorInstanceof - AJ2 - Código 11.6 - Página 248
 */
public class TesteOperadorInstanceof {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        if (p instanceof Cliente) {
            Cliente c = (Cliente) p; // cast down seguro
            System.out.println("CPF: " + c.getCpf());
        } else if (p instanceof Funcionario) {
            Funcionario f = (Funcionario) p; // cast down seguro
            System.out.println("Salario: " + f.getSalario());
        } else {
            System.out.println("Não é Cliente nem Funcionario");
        }
    }
}