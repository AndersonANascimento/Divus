package br.divus.aj2.cap10;

/**
 * Transportavel - AJ2 - Código 10.12 - Página 222
 */
public interface Transportavel {
    public static final String UNIDADE_VOLUME = "cm³";
    public String UNIDADE_PESO = "kg";

    public double getVolume();
    public double getPeso();
    public int getEmpilhamentoMaximo();
}
