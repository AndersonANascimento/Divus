package br.divus.aj2.cap13;

import java.io.IOException;

/**
 * TesteCriadorArquivos - AJ2 - Código 13.7 - Página 318
 */
public class TesteCriadorArquivos {
    public static void main(String[] args) {
        try {
            CriadorArquivos ca = new CriadorArquivos();
            ca.criarArquivo("teste.txt");            
        } catch (IOException e) {
            System.out.println("---------- Tratamento do Erro ----------");
            System.out.println("Não foi possível criar o arquivo! " + e.getMessage());
            System.out.println("-------------  Fim do Erro    ----------");
        }
    }
}
