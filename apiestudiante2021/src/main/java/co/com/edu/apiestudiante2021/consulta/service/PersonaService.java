package co.com.edu.apiestudiante2021.consulta.service;

import java.util.List;

import co.com.edu.apiestudiante2021.model.Persona;

public interface PersonaService {

	List<Persona> findAll();

	Persona findById(Integer idPersona);

}
