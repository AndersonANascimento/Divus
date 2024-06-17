package br.divus.aj2.cap11;

/**
 * Contabilidade - AJ2 - Código 11.10 - Página 250
 */
public class Contabilidade {
    public void gerarDemostrativo(Funcionario func) {
        System.out.println("O funcionario: " + func.getNome());
        System.out.println("Recebeu o pagamento de " + func.calculaPagamento());
    }
}
