package br.divus.aj2.cap10;

/**
 * GalaoDeCombustivel - AJ2 - Código 10.19 - Página 229
 */
public class GalaoDeCombustivel implements Inflamavel {
    private String nomeCombustivel;
    private double densidade;
    private int temperaturaDeTransporte;

    public GalaoDeCombustivel(String nomeCombustivel, double densidade, int temperaturaDeTransporte) {
        this.nomeCombustivel = nomeCombustivel;
        this.densidade = densidade;
        this.temperaturaDeTransporte = temperaturaDeTransporte;
    }

    @Override
    public int getTemperaturaMaxima() {
        return (int) (temperaturaDeTransporte * 1.4d);
    }

    @Override
    public int getEmpilhamentoMaximo() {
        return 3;
    }

    @Override
    public double getPeso() {
        double pesoGramas = getVolume() * densidade;
        return pesoGramas / 1000;
    }

    @Override
    public double getVolume() {
        return 3785;
    }

    public String getNomeCombustivel() {
        return nomeCombustivel;
    }

    public double getDensidade() {
        return densidade;
    }

    public int getTemperaturaDeTransporte() {
        return temperaturaDeTransporte;
    }
}
