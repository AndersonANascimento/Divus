/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 */
package com.aj3.aj3lab01_02.banking.impostos;

public interface Tributavel {
	public String getDescricaoTributavel();

	public String getNomeImposto();

	public double calcularImpostos();
}
