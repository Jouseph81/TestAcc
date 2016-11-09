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
	private long id;
	@Column(nullable = false)
	private LocalTime hora;
	
	public Hora(){}

	public Hora(long id, LocalTime hora) {
		this.id = id;
		this.hora = hora;
	}

	public long getId() {
		return id;
	}

	public LocalTime getHora() {
		return hora;
	}

	public void setId(long id) {
		this.id = id;
	}

	public void setHora(LocalTime hora) {
		this.hora = hora;
	}
}
