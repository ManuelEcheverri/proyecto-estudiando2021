package co.com.edu.apiestudiante2021.comando.manejador.estudiante.editar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.edu.apiestudiante2021.aplicacion.ComandoRespuesta;
import co.com.edu.apiestudiante2021.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.edu.apiestudiante2021.comando.converter.estudiante.EstudianteConverter;
import co.com.edu.apiestudiante2021.comando.dto.estudiante.EstudianteDTO;
import co.com.edu.apiestudiante2021.servicio.estudiante.edicion.EdicionEstudianteService;

@Component
public class ManejadorEditarEstudiante implements ManejadorComandoRespuesta<EstudianteDTO, ComandoRespuesta<Integer>> {

	@Autowired
	private EdicionEstudianteService edicionEstudianteService;
	
	@Autowired
	private EstudianteConverter estudianteConverter;
	
	@Override
	public ComandoRespuesta<Integer> ejecutar(EstudianteDTO estudianteDTO) {
		return new ComandoRespuesta<Integer>(edicionEstudianteService.ejecutar(estudianteConverter.editar(estudianteDTO)));
	}

}
