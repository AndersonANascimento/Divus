package br.divus.aj2.cap6;

/**
 * PaletaCores - AJ2 - Código 6.12 - Página 127
 */
public class PaletaCores {
    private static int[] cores = new int[7];

    static {
        System.out.println("Inicializando array de cores no bloco de inicialização estático...");
        for (int i = 0; i < cores.length; i++) {
            cores[i] = i;
        }
    }

    PaletaCores() {
        System.out.println("Criando instancia da classe PaletaCores");
    }

}
