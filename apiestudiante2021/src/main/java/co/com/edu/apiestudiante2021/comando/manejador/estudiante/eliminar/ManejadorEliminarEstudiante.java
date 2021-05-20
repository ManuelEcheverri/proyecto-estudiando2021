package co.com.edu.apiestudiante2021.comando.manejador.estudiante.eliminar;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.edu.apiestudiante2021.aplicacion.ComandoRespuesta;
import co.com.edu.apiestudiante2021.aplicacion.manejador.ManejadorComandoRespuesta;
import co.com.edu.apiestudiante2021.comando.converter.estudiante.EstudianteConverter;
import co.com.edu.apiestudiante2021.comando.dto.estudiante.EstudianteDTO;
import co.com.edu.apiestudiante2021.model.Estudiante;
import co.com.edu.apiestudiante2021.servicio.estudiante.edicion.EdicionEstudianteService;
import co.com.edu.apiestudiante2021.servicio.estudiante.eliminacion.EliminacionEstudianteService;

@Component
public class ManejadorEliminarEstudiante implements ManejadorComandoRespuesta<Integer, ComandoRespuesta<Integer>> {

	@Autowired
	private EliminacionEstudianteService eliminacionEstudianteService;

	@Autowired
	private EstudianteConverter estudianteConverter;

	@Override
	public ComandoRespuesta<Integer> ejecutar(Integer idEstudiante) {
		return new ComandoRespuesta<Integer>(
				eliminacionEstudianteService.ejecutar(estudianteConverter.eliminar(idEstudiante)));
	}

}
