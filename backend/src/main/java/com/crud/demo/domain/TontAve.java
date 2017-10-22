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
 * The persistent class for the tont_aves database table.
 * 
 */
@Entity
@Table(name="tont_aves")
@NamedQuery(name="TontAve.findAll", query="SELECT t FROM TontAve t")
public class TontAve implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(unique=true, nullable=false)
	private int id;

	@Column(nullable=false, length=5)
	private String cdave;

	@Column(name="DSNOMBRE_CIENTIFICO", length=200)
	private String dsnombreCientifico;

	@Column(name="DSNOMBRE_COMUN", length=100)
	private String dsnombreComun;

	//bi-directional many-to-one association to TontAvesPais
	/*@OneToMany(mappedBy="tontAve")
	private List<TontAvesPais> tontAvesPais;*/

	public TontAve() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCdave() {
		return this.cdave;
	}

	public void setCdave(String cdave) {
		this.cdave = cdave;
	}

	public String getDsnombreCientifico() {
		return this.dsnombreCientifico;
	}

	public void setDsnombreCientifico(String dsnombreCientifico) {
		this.dsnombreCientifico = dsnombreCientifico;
	}

	public String getDsnombreComun() {
		return this.dsnombreComun;
	}

	public void setDsnombreComun(String dsnombreComun) {
		this.dsnombreComun = dsnombreComun;
	}

	/*public List<TontAvesPais> getTontAvesPais() {
		return this.tontAvesPais;
	}

	public void setTontAvesPais(List<TontAvesPais> tontAvesPais) {
		this.tontAvesPais = tontAvesPais;
	}

	public TontAvesPais addTontAvesPai(TontAvesPais tontAvesPai) {
		getTontAvesPais().add(tontAvesPai);
		tontAvesPai.setTontAve(this);

		return tontAvesPai;
	}

	public TontAvesPais removeTontAvesPai(TontAvesPais tontAvesPai) {
		getTontAvesPais().remove(tontAvesPai);
		tontAvesPai.setTontAve(null);

		return tontAvesPai;
	}*/

}