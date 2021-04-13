package co.com.edu.apiestudiante2021.comando.manejador.estudiante.crear;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.edu.apiestudiante2021.aplicacion.ComandoRespuesta;
import co.com.edu.apiestudiante2021.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.edu.apiestudiante2021.comando.converter.estudiante.EstudianteConverter;
import co.com.edu.apiestudiante2021.comando.dto.estudiante.EstudianteDTO;
import co.com.edu.apiestudiante2021.servicio.estudiante.creacion.CreacionEstudianteService;

@Component
public class ManejadorCrearEstudiante implements ManejadorComandoRespuesta<EstudianteDTO, ComandoRespuesta<Integer>> {
	
	@Autowired
	private CreacionEstudianteService creacionEstudianteService;
	
	@Autowired
	private EstudianteConverter estudianteConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(EstudianteDTO estudianteDTO) {
		return new ComandoRespuesta<Integer>(creacionEstudianteService.ejecutar(estudianteConverter.crear(estudianteDTO)));
	}

}
