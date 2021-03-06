package nunes.luciano.dto;

import java.io.Serializable;

import nunes.luciano.domain.Cidade;

public class CidadesDTO implements Serializable {

	private static final long serialVersionUID = 1L;

	private int id;
	private String nome;

	public CidadesDTO() {

	}

	public CidadesDTO(Cidade obj) {
		id = obj.getId();
		nome = obj.getNome();

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
}
