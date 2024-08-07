/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package com.aj3.aj3lab01_03.er;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import com.aj3.aj3lab01_03.util.Teclado;

public class TesteExpressaoRegular {
	public static void main(String args[]) {
		String nome, telefone;

		System.out.println("Nome: ");
		nome = Teclado.le();

		System.out.println("Telefone: ");
		telefone = Teclado.le();

		if (validaNome(nome) && validaTelefone(telefone)) {
			System.out.println("Nome: " + nome);
			System.out.println("Telefone: " + telefone);
		} else {
			System.out.println("Nome deve de 5 a 20 caracteres entre letras e espacos.");
			System.out.println("Telefone deve estar no formato: (xx)xxxx-xxxx");
		}
	}

	public static boolean validaNome(String nome) {
		Pattern padrao = Pattern.compile("[A-Za-z]{5,20}");
		Matcher matcher = padrao.matcher(nome);
		return matcher.matches();
	}

	public static boolean validaTelefone(String telefone) {
		//Implemente a regra para validar o telefone tal que o formato aceito seja:
		// (xx)xxx-xxxx ou (xx)xxxx-xxxx
		Pattern padrao = Pattern.compile("\\(\\d\\d\\)\\d{3,4}-\\d{4}");
		Matcher matcher = padrao.matcher(telefone);
		return matcher.matches();
	}
}
