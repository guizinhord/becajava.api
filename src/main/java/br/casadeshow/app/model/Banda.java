package br.casadeshow.app.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Banda {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String estilo;

	@ManyToOne
	@JoinColumn(name = "CasaDeShowId")
	private CasaDeShow casaDeShow;

	@ManyToOne
	@JoinColumn(name = "LocalizacaoId")
	private Localizacao localizao;

	public CasaDeShow getCasaDeShow() {
		return casaDeShow;
	}

	public void setCasaDeShow(CasaDeShow casaDeShow) {
		this.casaDeShow = casaDeShow;
	}

	public Localizacao getLocalizao() {
		return localizao;
	}

	public void setLocalizao(Localizacao localizao) {
		this.localizao = localizao;
	}

	public CasaDeShow getCasaShow() {
		return casaDeShow;
	}

	public void setCasaShow(CasaDeShow casaDeShow) {
		this.casaDeShow = casaDeShow;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEstilo() {
		return estilo;
	}

	public void setEstilo(String estilo) {
		this.estilo = estilo;
	}

}
