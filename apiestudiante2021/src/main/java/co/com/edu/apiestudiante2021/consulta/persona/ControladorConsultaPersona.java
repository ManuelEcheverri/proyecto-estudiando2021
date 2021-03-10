package co.com.edu.apiestudiante2021.consulta.persona;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.apiestudiante2021.model.Persona;
import co.com.edu.apiestudiante2021.servicio.persona.consulta.ConsultaPersonaService;

@RestController
@RequestMapping("/v1/persona")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET })
public class ControladorConsultaPersona {

	@Autowired
	private ConsultaPersonaService personaService;

	@GetMapping
	Iterable<Persona> findAll() {
		return personaService.findAll();
	}

	@GetMapping("/{idPersona}")
	public Persona findById(@PathVariable("idPersona") Integer idPersona) {
		return personaService.findById(idPersona);
	}

}
