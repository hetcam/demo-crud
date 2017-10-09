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

import com.crud.demo.domain.TontAve;
import com.crud.demo.domain.TontAvesPais;
import com.crud.demo.domain.TontZona;
import com.crud.demo.repository.TontAvesPaisRepository;
import com.crud.demo.repository.TontZonaRepository;

@RestController()
@RequestMapping("/avesPaises")
public class AvesPaisesController {

	@Autowired
	TontZonaRepository zonaRepo;
	@Autowired
	TontAvesPaisRepository avesPaisRepo;

	@RequestMapping(value = "/findAll", method = RequestMethod.GET)
	public List<TontAvesPais> find(Map<String, Object> model) {
		List<TontAvesPais> avesPais = null;
		try {
			avesPais = (List<TontAvesPais>) avesPaisRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return avesPais;
	}
	
	@RequestMapping(value = "/zonas", method = RequestMethod.GET)
	public List<TontZona> zonas(Map<String, Object> model) {
		List<TontZona> zonas = null;
		try {
			zonas = (List<TontZona>) zonaRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return zonas;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public String create(TontAvesPais avesPais) {
		String response = "error";
		try {
			if (avesPaisRepo.save(avesPais) != null) {
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
			TontAvesPais avesPais = new TontAvesPais();
			avesPais.setId(id);
			avesPaisRepo.delete(avesPais);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@RequestMapping(value = "/aveByNamesAndZone", method = RequestMethod.GET)
	public TontAvesPais getByNames(String nombreAve, String nombreCientifico, String zona) {
		try {
			return avesPaisRepo.getByNames(nombreAve, nombreCientifico, zona);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "/avesByName", method = RequestMethod.GET)
	public List<TontAve> getAvesByName(String nombreAve, String nombreCientifico) {
		try {
			return avesPaisRepo.getAvesByName(nombreAve, nombreCientifico);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@RequestMapping(value = "/avesByZona", method = RequestMethod.GET)
	public List<TontAve> getByName(String zona) {
		try {
			return avesPaisRepo.getAvesByZona(zona);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

}
