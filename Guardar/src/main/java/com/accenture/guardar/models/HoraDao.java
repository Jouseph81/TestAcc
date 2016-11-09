package com.accenture.guardar.models;

import org.springframework.data.repository.CrudRepository;

public interface HoraDao extends CrudRepository<Hora, Long>{

	public Hora findById(long id);
}
