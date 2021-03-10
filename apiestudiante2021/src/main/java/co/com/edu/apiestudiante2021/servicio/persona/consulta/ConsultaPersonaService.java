package co.com.edu.apiestudiante2021.servicio.persona.consulta;

import java.util.List;

import co.com.edu.apiestudiante2021.model.Persona;

public interface ConsultaPersonaService {

	Iterable<Persona> findAll();

	Persona findById(Integer idPersona);

}
