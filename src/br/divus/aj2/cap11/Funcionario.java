package br.divus.aj2.cap11;

/**
 * Funcionario - AJ2 - Código 11.3 - Página 245
 */
public class Funcionario extends Pessoa {
    private String carteiraProfissional;
    private double salario;

    public String getCarteiraProfissional() {
        return carteiraProfissional;
    }

    public void setCarteiraProfissional(String carteiraProfissional) {
        this.carteiraProfissional = carteiraProfissional;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double calculaPagamento() {
        return salario;
    }
}
