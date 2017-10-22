package com.crud.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the tont_paises database table.
 * 
 */
@Entity
@Table(name="tont_paises")
@NamedQuery(name="TontPais.findAll", query="SELECT t FROM TontPais t")
public class TontPais implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=3)
	private String cdpais;

	@Column(length=100)
	private String dsnombre;

	//bi-directional many-to-one association to TontAvesPais
	/*@OneToMany(mappedBy="tontPais")
	private List<TontAvesPais> tontAvesPais;*/

	//bi-directional many-to-one association to TontZona
	@ManyToOne()
	@JoinColumn(name="CDZONA")
	private TontZona tontZona;

	public TontPais() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCdpais() {
		return this.cdpais;
	}

	public void setCdpais(String cdpais) {
		this.cdpais = cdpais;
	}

	public String getDsnombre() {
		return this.dsnombre;
	}

	public void setDsnombre(String dsnombre) {
		this.dsnombre = dsnombre;
	}

	/*public List<TontAvesPais> getTontAvesPais() {
		return this.tontAvesPais;
	}

	public void setTontAvesPais(List<TontAvesPais> tontAvesPais) {
		this.tontAvesPais = tontAvesPais;
	}

	public TontAvesPais addTontAvesPai(TontAvesPais tontAvesPai) {
		getTontAvesPais().add(tontAvesPai);
		tontAvesPai.setTontPais(this);

		return tontAvesPai;
	}

	public TontAvesPais removeTontAvesPai(TontAvesPais tontAvesPai) {
		getTontAvesPais().remove(tontAvesPai);
		tontAvesPai.setTontPais(null);

		return tontAvesPai;
	}*/

	public TontZona getTontZona() {
		return this.tontZona;
	}

	public void setTontZona(TontZona tontZona) {
		this.tontZona = tontZona;
	}

}