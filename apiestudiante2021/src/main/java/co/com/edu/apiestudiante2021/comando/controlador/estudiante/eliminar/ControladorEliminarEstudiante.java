package co.com.edu.apiestudiante2021.comando.controlador.estudiante.eliminar;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.apiestudiante2021.comando.dto.estudiante.EstudianteDTO;
import co.com.edu.apiestudiante2021.comando.manejador.estudiante.eliminar.ManejadorEliminarEstudiante;
import io.swagger.annotations.Api;

//@Api(tags = "Eliminar Estudiante")
@RestController
@RequestMapping("/v1/estudiante")
//@CrossOrigin(origins = "*", methods = { RequestMethod.DELETE })
public class ControladorEliminarEstudiante {

	@Autowired
	private ManejadorEliminarEstudiante manejadorEliminarEstudiante;
	
	@DeleteMapping("/{idEstudiante}")
	public void eliminar( @PathVariable Integer idEstudiante) {
		 manejadorEliminarEstudiante.ejecutar(idEstudiante);
	}
}
