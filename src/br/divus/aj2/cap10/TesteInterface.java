package br.divus.aj2.cap10;

/**
 * TesteInterface - AJ2 - Código 10.17 - Página 227
 */
public class TesteInterface {
    public static void main(String[] args) {
        Mobilia mob = new Mobilia("mesa", "Silva Móveis", "madeira/formica/metal", 115, 70, 90, 11);
        System.out.println("Mobilia: " + mob.getTipo());
        System.out.println("volume: " + mob.getVolume() + Transportavel.UNIDADE_VOLUME);
        System.out.println("peso: " + mob.getPeso() + Transportavel.UNIDADE_PESO);
        System.out.println("empilhamento máx: " + mob.getEmpilhamentoMaximo());
        System.out.println();

        Alimento junk = new Alimento("hamburguer", -2, 350, 260d, 6, 30);
        System.out.println("Alimento: " + junk.getNome());
        System.out.println("volume: " + junk.getVolume() + Transportavel.UNIDADE_VOLUME);
        System.out.println("peso: " + junk.getPeso() + Transportavel.UNIDADE_PESO);
        System.out.println("empilhamento máx: " + junk.getEmpilhamentoMaximo());
        System.out.println("conservação: " + junk.getTemperaturaDeConservacao() + Perecivel.UNIDADE_TEMPERATURA);
        System.out.println("dias de validade: " + junk.getDiasDeValidade());
    }
}
