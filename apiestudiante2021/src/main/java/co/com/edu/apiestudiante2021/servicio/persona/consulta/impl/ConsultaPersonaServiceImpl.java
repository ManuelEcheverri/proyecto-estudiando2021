package co.com.edu.apiestudiante2021.servicio.persona.consulta.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.edu.apiestudiante2021.model.Persona;
import co.com.edu.apiestudiante2021.repository.PersonaRepository;
import co.com.edu.apiestudiante2021.servicio.persona.consulta.ConsultaPersonaService;

@Service
public class ConsultaPersonaServiceImpl implements ConsultaPersonaService {
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public Iterable<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public Persona findById(Integer idPersona) {
		return personaRepository.findById(idPersona).orElse(null);
	}
}
