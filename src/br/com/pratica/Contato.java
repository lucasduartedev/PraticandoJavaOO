package br.com.pratica;

public class Contato {
	
	private String fixo;
	private String movel;
	private String email;
	
	// Construtor
	public Contato(String fixo, String movel, String email) {
		super();
		this.fixo = fixo;
		this.movel = movel;
		this.email = email;
	}

	public String getFixo() {
		return fixo;
	}

	public void setFixo(String fixo) {
		this.fixo = fixo;
	}

	public String getMovel() {
		return movel;
	}

	public void setMevol(String movel) {
		this.movel = movel;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	// Getters e Setters
	

}
