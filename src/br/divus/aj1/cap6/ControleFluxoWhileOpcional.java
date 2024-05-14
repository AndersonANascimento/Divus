package br.divus.aj1.cap6;
/**
 * Classe com o objetivo de praticar a utilização de controladores de fluxo.
 * 
 * @author Globalcode
 */
class ControleFluxoWhileOpcional {
	/**
	 * Método para que esta classe possa ser executada com o utilitário java.
	 * 
	 * @param args
	 *             - argumentos para o método main
	 */
	public static void main(String[] args) {
		int limiteInferior = 14;
		int limiteSuperior = 1578;
		int numerosDiv6 = 0;
		int num = limiteInferior;
		while (num <= limiteSuperior) {
			if (num%6 == 0) numerosDiv6++;
			num++;
		}
		String texto = "Quantidade de numeros divisiveis por 6 entre ";
		System.out.println(texto + limiteInferior + " e " + limiteSuperior
				+ " e : " + numerosDiv6);
	}
}
