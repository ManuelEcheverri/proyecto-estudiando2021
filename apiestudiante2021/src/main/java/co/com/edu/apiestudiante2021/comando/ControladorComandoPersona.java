package co.com.edu.apiestudiante2021.comando;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.apiestudiante2021.model.Persona;
import co.com.edu.apiestudiante2021.servicio.persona.creacion.CreacionPersonaService;


@RestController
@RequestMapping("/v1/persona")
public class ControladorComandoPersona {
	@Autowired
	private CreacionPersonaService creacionPersonaService;

	@PostMapping
	public void insertar(@RequestBody Persona persona) {
		creacionPersonaService.ejecutar(persona);
	}
}
