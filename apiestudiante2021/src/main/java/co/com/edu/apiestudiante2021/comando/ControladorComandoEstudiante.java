package co.com.edu.apiestudiante2021.comando;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.apiestudiante2021.model.Estudiante;
import co.com.edu.apiestudiante2021.servicio.estudiante.creacion.CreacionEstudianteService;


@RestController
@RequestMapping("/v1/estudiante")
public class ControladorComandoEstudiante {
	@Autowired
	private CreacionEstudianteService creacionEstudianteService;

	@PostMapping
	public void insertar(@RequestBody Estudiante estudiante) {
		creacionEstudianteService.ejecutar(estudiante);
	}
}
