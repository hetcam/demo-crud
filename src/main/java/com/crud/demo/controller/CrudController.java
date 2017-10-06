/**
 * 
 */
package com.crud.demo.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.crud.demo.domain.TontAvesPais;
import com.crud.demo.domain.TontZona;
import com.crud.demo.repository.TontAvesPaisRepository;
import com.crud.demo.repository.TontZonaRepository;

@RestController
public class CrudController {
	
	@Autowired TontZonaRepository zonaRepo;
	@Autowired TontAvesPaisRepository avesPaisRepo;
	
	
	@RequestMapping("/")
    public String index() {
        // Return the name of the HTML (file) view.
        return "index";
    }
	
	@RequestMapping(value = "/zonas", method = RequestMethod.GET)
    public List<TontZona> zonas(Map<String, Object> model) {
		List<TontZona> zonas = null;
		try {
			model.put("me", "Hola Mundo");
			zonas = (List<TontZona>) zonaRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return zonas; 
    }
	
	@RequestMapping(value = "/avesPaises", method = RequestMethod.GET)
    public List<TontAvesPais> consultarAvesPaises(Map<String, Object> model) {
		List<TontAvesPais> zonas = null;
		try {
			model.put("me", "Hola Mundo");
			zonas = (List<TontAvesPais>) avesPaisRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
        return zonas; 
    }

}
