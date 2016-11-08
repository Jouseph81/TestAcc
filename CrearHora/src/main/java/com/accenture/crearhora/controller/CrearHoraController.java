package com.accenture.crearhora.controller;

import java.util.concurrent.atomic.AtomicLong;

import org.joda.time.LocalTime;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
}
