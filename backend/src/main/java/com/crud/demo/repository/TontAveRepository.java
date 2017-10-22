package com.crud.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.crud.demo.domain.TontAve;

@Repository
public interface TontAveRepository extends CrudRepository<TontAve, Integer>{

}
