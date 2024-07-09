package br.divus.aj2.cap13;

import java.io.File;
import java.io.IOException;

/**
 * CriadorArquivos - AJ2 - Código 13.4 - Página 314
 */
public class CriadorArquivos {

    // Implementação da página 314
    // public void criarArquivo(String name) {
    //     File f = new File(name);
    //     f.createNewFile();
    // }
        
    // Implementação da página 315
    public void criarArquivo(String name) throws IOException{
        File f = new File(name);
        f.createNewFile();
    }

}
