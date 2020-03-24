package br.com.pratica;

public class Produto {
	
	private String codBarra;
	private String nome;
	private double preco;
	private String descricao;
	
	// Construtor
	public Produto(String codBarra, String nome, double preco, String descricao) {
		super();
		this.codBarra = codBarra;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	// Getters e Setters
	public String getCodBarra() {
		return codBarra;
	}

	public void setCodBarra(String codBarra) {
		this.codBarra = codBarra;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

}
