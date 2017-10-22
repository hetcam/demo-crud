package com.crud.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.domain.TontZona;

@Repository
public interface TontZonaRepository extends CrudRepository<TontZona, Integer>{

}
