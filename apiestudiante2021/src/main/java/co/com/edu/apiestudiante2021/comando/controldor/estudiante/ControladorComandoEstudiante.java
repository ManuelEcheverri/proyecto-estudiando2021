package co.com.edu.apiestudiante2021.comando.controldor.estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.apiestudiante2021.aplicacion.ComandoRespuesta;
import co.com.edu.apiestudiante2021.comando.dto.estudiante.EstudianteDTO;
import co.com.edu.apiestudiante2021.comando.manejador.estudiante.crear.ManejadorCrearEstudiante;
import co.com.edu.apiestudiante2021.model.Estudiante;
import co.com.edu.apiestudiante2021.servicio.estudiante.creacion.CreacionEstudianteService;
import io.swagger.annotations.Api;

@Api(tags="Crear Estudiante")
@RestController
@RequestMapping("/v1/estudiante")
@CrossOrigin(origins = "*", methods= {RequestMethod.POST})
public class ControladorComandoEstudiante {
	
	@Autowired
	private ManejadorCrearEstudiante manejadorCrearEstudiante;

	@PostMapping
	public ComandoRespuesta<Integer> insertar(@RequestBody EstudianteDTO estudianteDto) {
		 return manejadorCrearEstudiante.ejecutar(estudianteDto);
	}
}
