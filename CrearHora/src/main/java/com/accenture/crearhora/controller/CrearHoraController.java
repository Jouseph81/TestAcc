package com.accenture.crearhora.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.joda.time.LocalTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;

import com.accenture.crearhora.model.Hora;

@Controller
public class CrearHoraController {

	private Hora hora;
	private final AtomicLong counter = new AtomicLong();
	
	@RequestMapping("/")
	public String getHora(Model model) {
		hora = new Hora(counter.incrementAndGet(), new LocalTime());
		
		model.addAttribute("hora", hora);
		
		return "horaview";
	}
	
	@RequestMapping("/guardar")
	public String setHora(@RequestParam(name="identificador") Long identificador, @RequestParam(name="horaDia") LocalTime horaDia, Model model){
		RestTemplate restTemplate = new RestTemplate();
		Hora horaGuardada = restTemplate.getForObject("http://guardarms-microhola.44fs.preview.openshiftapps.com/GuardarHora/" + identificador + "/" + horaDia, Hora.class);
		System.out.println(horaGuardada);
		return "horaview";
	}
}
