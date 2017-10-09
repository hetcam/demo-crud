package com.crud.demo.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.crud.demo.domain.TontAvesPais;

@Repository
public interface TontAvesPaisRepository extends CrudRepository<TontAvesPais, Integer>{
	
	@Query("select ap from TontAvesPais ap join ap.tontAve aves join ap.tontPais pais join pais.tontZona zona where aves.dsnombreComun=:nombreAve and aves.dsnombreCientifico=:nombreCientifico and zona.cdzona=:zona")
	TontAvesPais getByNames(
			@Param("nombreAve") String nombreAve,
			@Param("nombreCientifico") String nombreCientifico,
			@Param("zona") String zona);

}
