package br.divus.aj1.cap5;
/**
 * TesteCastingTiposPrimitivos2 - AJ1 - Código 13 - Página 73
 */
public class TesteCastingTiposPrimitivos2 {

	public static void main(String[] args) {
		byte b = -127;
		char caractere = 'f';
		int inteiro = 12;
		long numeroLong = 901;
		float numeroFloat = 990.99f;
		double numeroDouble = 90.98;

		System.out.println("byte = " + b);
		System.out.println("caractere = " + caractere);
		System.out.println("inteiro = " + inteiro);
		System.out.println("numeroLong = " + numeroLong);
		System.out.println("numeroFloat = " + numeroFloat);
		System.out.println("numeroDouble = " + numeroDouble);

		// upcasting - casting implicito (char para int)
		inteiro = caractere;
		System.out.println("caracter 'f' sendo visto como inteiro = " + inteiro);

		// upcasting - casting implicito (byte para int)
		inteiro = b;
		System.out.println("byte -127 sendo visto como inteiro = " + inteiro);

		// downcasting - casting tem que ser explicito (float para int)
		inteiro = (int) numeroFloat;
		System.out.println("float 990.99f sendo visto como inteiro = " + inteiro);

		// downcasting - casting tem que ser explicito (int para byte)
		b = (byte) inteiro;
		System.out.println("inteiro " + inteiro + " sendo visto como byte = " + b);

	}

}
