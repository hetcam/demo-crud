package com.crud.demo.repository;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crud.demo.domain.TontAve;
import com.crud.demo.domain.TontAvesPais;

@Repository
public interface TontAvesPaisRepository extends CrudRepository<TontAvesPais, Integer>{
	
	/** Obtener un ave por zona y nombre
	 * @param nombreAve
	 * @param nombreCientifico
	 * @param zona
	 * @return
	 */
	@Query("select ap from TontAvesPais ap join ap.tontAve aves join ap.tontPais pais join pais.tontZona zona where aves.dsnombreComun=:nombreAve and aves.dsnombreCientifico=:nombreCientifico and zona.cdzona=:zona")
	TontAvesPais getByNames(
			@Param("nombreAve") String nombreAve,
			@Param("nombreCientifico") String nombreCientifico,
			@Param("zona") String zona);
	
	/**
	 * Obtener una lista de aves filtrado por su nombre normal o cientifico
	 * @param nombreAve
	 * @param nombreCientifico
	 * @return
	 */
	@Query("select aves from TontAve aves where aves.dsnombreComun=:nombreAve or aves.dsnombreCientifico=:nombreCientifico")
	List<TontAve> getAvesByName(
			@Param("nombreAve") String nombreAve,
			@Param("nombreCientifico") String nombreCientifico);
	
	/**
	 * Obtener una lista de aves filtrado por zona
	 * @param zona
	 * @return
	 */
	@Query("select aves from TontAvesPais ap join ap.tontAve aves join ap.tontPais pais join pais.tontZona zona where zona.cdzona=:zona")
	List<TontAve> getAvesByZona(
			@Param("zona") String zona);

}
