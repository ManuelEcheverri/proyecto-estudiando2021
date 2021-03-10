package co.com.edu.apiestudiante2021.servicio.persona.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.edu.apiestudiante2021.model.Persona;
import co.com.edu.apiestudiante2021.repository.PersonaRepository;
import co.com.edu.apiestudiante2021.servicio.persona.creacion.CreacionPersonaService;

@Service
public class CreacionPersonaServiceImpl implements CreacionPersonaService {
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public void ejecutar(Persona persona) {
		personaRepository.save(persona);

	}

}
