package br.divus.aj2.cap5;

/**
 * Curso - AJ2 - Código 5.1 - Página 91
 */
public class Curso {
	private String nome;
	private String descricao;
	private String codigo;
	private int cargaHoraria;

	public Curso(String nome, String codigo, int cargaHoraria) {
		setNome(nome);
		setCodigo(codigo);
		setCargaHoraria(cargaHoraria);
	}

	public Curso(String nome, String descricao, String codigo, int cargaHoraria) {
		this(nome, codigo, cargaHoraria);
		setDescricao(descricao);
	}

	/**
	 * @return the nome
	 */
	public String getNome() {
		return nome;
	}

	/**
	 * @param nome
	 *             the nome to set
	 */
	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * @return the descricao
	 */
	public String getDescricao() {
		return descricao;
	}

	/**
	 * @param descricao
	 *                  the descricao to set
	 */
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	/**
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}

	/**
	 * @param codigo
	 *               the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	/**
	 * @return the cargaHoraria
	 */
	public int getCargaHoraria() {
		return cargaHoraria;
	}

	/**
	 * @param cargaHoraria
	 *                     the cargaHoraria to set
	 */
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}

	@Override
	public String toString() {
		return super.toString() + '\n' + "Nome: " + getNome() + '\n'
				+ "Descrição: " + getDescricao() + '\n' + "Codigo: "
				+ getCodigo() + '\n' + "Carga Horaria: " + getCargaHoraria();
	}

}
