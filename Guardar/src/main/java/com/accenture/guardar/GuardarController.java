package com.accenture.guardar;

import org.joda.time.LocalTime;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardarController {

	@RequestMapping(method = RequestMethod.GET, value="/{identificador}/{hora}")
	public Hora guardar(@PathVariable long identificador, @PathVariable LocalTime hora) {
		return new Hora(identificador, hora);
	}
}
