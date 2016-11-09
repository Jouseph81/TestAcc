package com.accenture.guardar.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import org.joda.time.LocalTime;

@Entity
@Table(name = "Horas")
public class Hora {

	@Id
	private final long id;
	@Column(nullable = false)
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
