package br.divus.aj2.cap11;

/**
 * ContabilidadeSemPolimorfismo - AJ2 - Código 11.9 - Página 250
 */
public class ContabilidadeSemPolimorfismo {
    public void gerarDemostrativo(FuncionarioCLT func) {
        System.out.println("O funcionario: " + func.getNome());
        System.out.println("Recebeu o pagamento de " + func.calculaPagamento());
    }

    public void gerarDemostrativo(FuncionarioPJ func) {
        System.out.println("O funcionario: " + func.getNome());
        System.out.println("Recebeu o pagamento de " + func.calculaPagamento());
    }
}
