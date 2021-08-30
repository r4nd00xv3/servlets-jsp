package back;

import java.io.Serializable;
import java.sql.Date;

public class ModelLogin implements Serializable {
	private static final long serialVersionUID = 1L;
	private String login;
	private String senha;
	private String nome;
	private String titulob;
	private String nomeaut;	
	private Long id;
	private String date;
		
	
	
public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

public boolean isNovo() {
		
		if (this.id == null) {
			return true; /*Inserir novo*/
		}else if (this.id != null && this.id > 0) {
			return false; /*Atualizar*/
		}
			
		
		return id == null;
	}
	
	public String getTitulob() {
		return titulob;
	}
	public void setTitulob(String titulob) {
		this.titulob = titulob;
	}
	public String getNomeaut() {
		return nomeaut;
	}
	public void setNomeaut(String nomeaut) {
		this.nomeaut = nomeaut;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long idLong) {
		this.id = idLong;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getLogin() {
		return login;
	}
	public void setLogin(String login) {
		this.login = login;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
}
