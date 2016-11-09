package com.accenture.crearhora.model;

import org.joda.time.LocalTime;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties
public class Hora {

	private final long id;
	private final LocalTime hora;
	
	public Hora(long id, LocalTime hora) {
		super();
		this.id = id;
		this.hora = hora;
	}
	
	public long getId() {
		return id;
	}
	
	public LocalTime getHora() {
		return hora;
	}
}
