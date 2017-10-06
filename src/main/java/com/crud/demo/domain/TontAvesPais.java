package com.crud.demo.domain;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the tont_aves_pais database table.
 * 
 */
@Entity
@Table(name="tont_aves_pais")
@NamedQuery(name="TontAvesPais.findAll", query="SELECT t FROM TontAvesPais t")
public class TontAvesPais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	//bi-directional many-to-one association to TontAve
	@ManyToOne
	@JoinColumn(name="CDAVE", nullable=false)
	private TontAve tontAve;

	//bi-directional many-to-one association to TontPais
	@ManyToOne
	@JoinColumn(name="CDPAIS", nullable=false)
	private TontPais tontPais;

	public TontAvesPais() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TontAve getTontAve() {
		return this.tontAve;
	}

	public void setTontAve(TontAve tontAve) {
		this.tontAve = tontAve;
	}

	public TontPais getTontPais() {
		return this.tontPais;
	}

	public void setTontPais(TontPais tontPais) {
		this.tontPais = tontPais;
	}

}