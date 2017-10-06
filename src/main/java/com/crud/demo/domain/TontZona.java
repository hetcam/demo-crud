package com.crud.demo.domain;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQuery;
import javax.persistence.Table;


/**
 * The persistent class for the tont_zonas database table.
 * 
 */
@Entity
@Table(name="tont_zonas")
@NamedQuery(name="TontZona.findAll", query="SELECT t FROM TontZona t")
public class TontZona implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=3)
	private String cdzona;

	@Column(length=45)
	private String dsnombre;

	//bi-directional many-to-one association to TontPais
	/*@OneToMany(mappedBy="tontZona", cascade={CascadeType.ALL})
	private List<TontPais> tontPaises;*/

	public TontZona() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCdzona() {
		return this.cdzona;
	}

	public void setCdzona(String cdzona) {
		this.cdzona = cdzona;
	}

	public String getDsnombre() {
		return this.dsnombre;
	}

	public void setDsnombre(String dsnombre) {
		this.dsnombre = dsnombre;
	}

	/*public List<TontPais> getTontPaises() {
		return this.tontPaises;
	}

	public void setTontPaises(List<TontPais> tontPaises) {
		this.tontPaises = tontPaises;
	}

	public TontPais addTontPais(TontPais tontPais) {
		getTontPaises().add(tontPais);
		tontPais.setTontZona(this);

		return tontPais;
	}

	public TontPais removeTontPais(TontPais tontPais) {
		getTontPaises().remove(tontPais);
		tontPais.setTontZona(null);

		return tontPais;
	}*/

}