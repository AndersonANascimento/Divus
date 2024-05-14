package br.divus.aj1.cap7;
/**
 * Classe com o objetivo de praticar arrays de tipos primitivos e reference.
 * 
 * @author Melissa
 */
class Arrays {
	/**
	 * Método para que esta classe possa ser executada com o utilitário java.
	 * 
	 * @param args - argumentos para o método main
	 */
	public static void main(String args[]) {
		String array[] = new String[5];
		for (int i = 0; i < array.length; i++) {
			array[i] = "Cliente " + (i + 1) + " email: cliente" + (i + 1)
					+ "@cliente.com.br";
		}

		for (String cli : array)
			System.out.println(cli);
	}
}