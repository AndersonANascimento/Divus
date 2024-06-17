package br.divus.aj2.cap11;

/**
 * RelatorioPessoas - AJ2 - Código 11.12 - Página 252
 */
public class RelatorioPessoas {
    public void imprime(Pessoa p) {
        System.out.println("Nome: " + p.getNome() + "\tRG: " + p.getRg());
    }

    public int imprimeArray(Pessoa[] pessoas) {
        int quantidadeImpressa = 0;
        for (int i = 0; i < pessoas.length; i++) {
            if (pessoas[i] == null) continue;
            imprime(pessoas[i]);
            quantidadeImpressa++;
        }
        return quantidadeImpressa;
    }
}
