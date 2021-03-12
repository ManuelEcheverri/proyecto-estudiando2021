package co.com.edu.apiestudiante2021.servicio.estudiante.creacion.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.edu.apiestudiante2021.model.Estudiante;
import co.com.edu.apiestudiante2021.repository.EstudianteRepository;
import co.com.edu.apiestudiante2021.servicio.estudiante.creacion.CreacionEstudianteService;

@Service
public class CreacionEstudianteServiceImpl implements CreacionEstudianteService {
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public Integer ejecutar(Estudiante estudiante) {
		estudianteRepository.save(estudiante);
		return estudiante.getIdEstudiante();
	}

}
