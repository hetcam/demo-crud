package com.crud.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.domain.TontAvesPais;

@Repository
public interface TontAvesPaisRepository extends CrudRepository<TontAvesPais, Integer>{

}
