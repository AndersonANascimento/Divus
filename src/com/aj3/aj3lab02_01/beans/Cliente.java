/*
 * Globalcode - "The Developers Company"
 * 
 * Academia do Java
 * 
 */
package com.aj3.aj3lab02_01.beans;

public class Cliente {

	private String nome;
	private String telefone;
	private String cpf;
	private int id;

	/**
	 * @param nome
	 *            Nome do cliente
	 * @param telefone
	 *            Telefone do cliente
	 * @param cpf
	 *            CPF do cliente
	 * @param id
	 *            ID do cliente
	 */
	public Cliente(String nome, String telefone, String cpf, int id) {
		this(nome, telefone, cpf);
		this.id = id;
	}

	/**
	 * Este construtor podera ser utilizado quando o id do cliente precisar ser
	 * atribuido depois, como por exemplo quando e necessario criar o cliente
	 * para salvar no banco de dados, onde o id e gerado automaticamente.
	 * 
	 * @param nome
	 *            Nome do cliente
	 * @param telefone
	 *            Telefone do cliente
	 * @param cpf
	 *            CPF do cliente
	 * 
	 */
	public Cliente(String nome, String telefone, String cpf) {
		this.nome = nome;
		this.telefone = telefone;
		this.cpf = cpf;
	}

	/**
	 * @return CPF do Cliente
	 */
	public String getCpf() {
		return cpf;
	}

	/**
	 * @return ID do cliente
	 */
	public int getId() {
		return id;
	}

	/**
	 * @return Nome do cliente
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @return Telefone do cliente
	 */
	public String getTelefone() {
		return telefone;
	}

	/**
	 * @param cpf
	 *            CPF do cliente
	 */
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	/**
	 * @param id
	 *            ID do cliente
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @param nome
	 *            Nome do cliente
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @param telefone
	 *            Telefone do cliente
	 */
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String toString() {
		String cliente = " ID [" + this.id + "]\t";
		cliente += this.nome + "\t CPF (" + this.cpf + " ) \t";
		cliente += "- Tel: {" + this.telefone + "}";
		return cliente;
	}
}
