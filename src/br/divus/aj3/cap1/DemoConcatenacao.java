package br.divus.aj3.cap1;

public class DemoConcatenacao {
    private static void concatenaString(long numConcatenacoes) {
        String s = "";
        for (long i = 0; i <= numConcatenacoes; i++) {
            s += i;
        }
    }
    private static void concatenaStringBuffer(long numConcatenacoes) {
        StringBuffer s = new StringBuffer("");
        for (long i = 0; i <= numConcatenacoes; i++) {
            s.append(i);
        }
    }
    private static void concatenaStringBuilder(long numConcatenacoes) {
        StringBuilder s = new StringBuilder("");
        for (long i = 0; i <= numConcatenacoes; i++) {
            s.append(i);
        }
    }

    public static void main(String[] args) {
        // Lendo a quantidade de iterações da linha de comando
        long qtd = Long.parseLong(args[0]);

        // currentTimeMillis() retorna um long com o número de ms desde 01/01/1970
        long inicio = System.currentTimeMillis();
        concatenaString(qtd);
        // Captura o tempo final em ms
        long fim = System.currentTimeMillis();
        System.out.println("* * * Tempos de processamento * * *" );
        System.out.println("Classe String        ==> " + (fim - inicio) + "ms");
        
        inicio = System.currentTimeMillis();
        concatenaStringBuffer(qtd);
        fim = System.currentTimeMillis();
        System.out.println("Classe StringBuffer  ==> " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatenaStringBuilder(qtd);
        fim = System.currentTimeMillis();
        System.out.println("Classe StringBuilder ==> " + (fim - inicio) + "ms");
    }
}
