package br.divus.aj2.cap10;

/**
 * Alimento - AJ2 - Código 10.16 - implementando as interfaces Transportavel e Perecivel - Página 225
 */
public class Alimento extends AlimentoBase implements Transportavel, Perecivel {
    private int empilhamentoMaximo, diasDeValidade;

    public Alimento(String nome, int temperatura, int pesoGramas, double volumeCm3, int empilhamentoMaximo,
            int diasDeValidade) {
        super(nome, temperatura, pesoGramas, volumeCm3);
        this.empilhamentoMaximo = empilhamentoMaximo;
        this.diasDeValidade = diasDeValidade;
    }

    @Override
    public int getEmpilhamentoMaximo() {
        return empilhamentoMaximo;
    }

    @Override
    public double getPeso() {
        return super.getPesoGramas()/1000;
    }

    @Override
    public double getVolume() {
        return super.getVolumeCm3();
    }

    @Override
    public int getDiasDeValidade() {
        return diasDeValidade;
    }

    @Override
    public int getTemperaturaDeConservacao() {
        return super.getTemperatura();
    }
}
