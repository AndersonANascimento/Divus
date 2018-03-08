package br.divus.aj1.cap4;
/**
 * TesteEscopo - AJ1 - Código 8 - Página 61
 */
public class TesteEscopo {
    public static void main(String[] args) {
        {
            // as variáveis que forem declaradas dentro deste bloco
            // não serão acessadas de fora
            int quantidade = 23;
        }
        System.out.println("quantidade: " + quantidade);
    }
}