package co.com.edu.apiestudiante2021.repository;

import java.util.List;

import co.com.edu.apiestudiante2021.model.Persona;

public interface PersonaRepository {

	List<Persona> findAll();

	Persona findById(Integer idPersona);

}
