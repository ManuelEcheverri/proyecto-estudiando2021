package co.com.edu.apiestudiante2021.repository.textplain;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.stereotype.Repository;

import co.com.edu.apiestudiante2021.model.Persona;
import co.com.edu.apiestudiante2021.repository.PersonaRepository;

@Repository
public class PersonaDaoTextPlain implements PersonaRepository {

	@Override
	public List<Persona> findAll() {
		List<Persona> personas = new ArrayList<>();
		for (int i = 0; i < 500; i++) {
			personas.add(new Persona(i + 1, "nombres" + i + 1, "apellidos" + i + 1));

		}
		return personas;
	}
	
	@Override
	public Persona findById(Integer idPersona) {
		List<Persona> personas = findAll();
		Persona persona = null;
		for(Persona personaItem : personas) {
			if(personaItem.getIdPersona() == idPersona.intValue()) {
				persona = personaItem;
				break;
			}
		}
		return persona;
	}
	
	// En esta clase va a estar la persistencia de nuestra aplicacion

}
