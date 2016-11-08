package com.accenture.guardar;

import org.joda.time.LocalTime;

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
