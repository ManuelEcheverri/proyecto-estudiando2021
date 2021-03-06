package co.com.edu.apiestudiante2021.consulta.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.edu.apiestudiante2021.consulta.service.PersonaService;
import co.com.edu.apiestudiante2021.model.Persona;
import co.com.edu.apiestudiante2021.repository.PersonaRepository;

@Service
public class PersonaServiceImpl implements PersonaService {
	@Autowired
	private PersonaRepository personaRepository;

	@Override
	public List<Persona> findAll() {
		return personaRepository.findAll();
	}

	@Override
	public Persona findById(Integer idPersona) {
		// TODO Auto-generated method stub
		return personaRepository.findById(idPersona);
	}
}
