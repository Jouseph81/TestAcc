package com.accenture.guardar;

import java.sql.Time;

import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GuardarController {

	public void guardar(@RequestParam(value="identificador") int identificador, @RequestParam(value="hora") Time hora) {
		
	}
}
