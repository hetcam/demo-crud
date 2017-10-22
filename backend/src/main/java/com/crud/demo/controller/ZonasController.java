package com.crud.demo.controller;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.domain.TontZona;
import com.crud.demo.dto.ZonaDto;
import com.crud.demo.repository.TontZonaRepository;

@RestController()
@RequestMapping("/zonas")
public class ZonasController {
	
	@Autowired
	TontZonaRepository zonaRepo;
	
	@RequestMapping(value = "/codigo", method = RequestMethod.GET)
	public List<TontZona> zonas(@RequestParam(value = "codigo", required = true) String codigo) {
		List<TontZona> zonas = null;
		try {
			zonas = (List<TontZona>) zonaRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return zonas;
	}
	
	@RequestMapping(value = "/filter", method = RequestMethod.POST)
	public List<TontZona> zonas(ZonaDto zonasDto) {
		List<TontZona> zonas = null;
		try {
			zonas = (List<TontZona>) zonaRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return zonas;
	}
	
	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String create(ZonaDto zonaDto) {
		String response = "error";
		try {
			ModelMapper modelMapper = new ModelMapper();
			TontZona tontZona = modelMapper.map(zonaDto, TontZona.class);
			if (zonaRepo.save(tontZona) != null) {
				response = "success";
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return response;
	}

	@RequestMapping(value = "/delete", method = RequestMethod.POST)
	public void update(int id) {
		try {
			TontZona tontZona = new TontZona();
			tontZona.setId(id);
			zonaRepo.delete(tontZona);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}


}
