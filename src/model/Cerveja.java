package model;

public class Cerveja {
	
	private String codigo;
	private String nome;
	private String dataProducao;
	private String dataValidade;
	private double preco;
	
	public Cerveja() {
		
	}
		
	public Cerveja(String codigo, String nome, String dataProducao, String dataValidade, double preco) {
		this.codigo = codigo;
		this.nome = nome;
		this.dataProducao = dataProducao;
		this.dataValidade = dataValidade;
		this.preco = preco;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDataProducao() {
		return dataProducao;
	}

	public void setDataProducao(String dataProducao) {
		this.dataProducao = dataProducao;
	}

	public String getDataValidade() {
		return dataValidade;
	}

	public void setDataValidade(String dataValidade) {
		this.dataValidade = dataValidade;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	@Override
	public String toString() {
		return "Código: " + codigo + "\n" + "Nome: " + nome + "\n" + "Data de Produção: " + dataProducao + "\n" + "Data de Validade: " + dataValidade + "\n" + "Preço: " + preco;
	}

}
