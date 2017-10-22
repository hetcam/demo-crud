package com.crud.demo.service.impl;

import org.springframework.beans.factory.annotation.Autowired;

import com.crud.demo.dto.ZonaDto;
import com.crud.demo.repository.TontZonaRepository;
import com.crud.demo.service.ZonaService;

public class ZonaServiceImpl implements ZonaService {
	
	@Autowired TontZonaRepository zonaRepo;

	@Override
	public void save(ZonaDto zona) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(ZonaDto zona) {
		// TODO Auto-generated method stub
		
	}
	
	
	

}
