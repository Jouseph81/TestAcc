package com.accenture.guardar;

import org.joda.time.LocalTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.accenture.guardar.models.Hora;
import com.accenture.guardar.models.HoraDao;

@RestController
public class GuardarController {

	@Autowired
	private HoraDao horaDao;
	
	@RequestMapping(method = RequestMethod.GET, value="/{identificador}/{hora}")
	public String guardar(@PathVariable long identificador, @PathVariable @DateTimeFormat(pattern="H:m") LocalTime hora) {
		Hora horas = new Hora(identificador, hora);
		horaDao.save(horas);
		
		String returnStr = "Se ha guardado correctamente la hora!!";

		return returnStr;
	}
	
	@RequestMapping(method = RequestMethod.GET, value="/{identificador}")
	public Hora buscarHora(@PathVariable long identificador) {
		
		Hora horaBusc = horaDao.findById(identificador);
		
		return horaBusc;
	}
}
