package co.com.edu.apiestudiante2021.servicio.estudiante.consulta;

import java.util.List;

import co.com.edu.apiestudiante2021.model.Estudiante;

public interface ConsultaEstudianteService {

	Iterable<Estudiante> findAll();

	Estudiante findById(Integer idEstudiante);
	
	

}
