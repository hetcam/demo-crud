package com.crud.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.domain.TontPais;

@Repository
public interface TontPaisRepository extends CrudRepository<TontPais, Integer>{

}
