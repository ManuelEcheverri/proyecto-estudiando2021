package co.com.edu.apiestudiante2021.servicio.estudiante.consulta.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.edu.apiestudiante2021.model.Estudiante;
import co.com.edu.apiestudiante2021.repository.EstudianteRepository;
import co.com.edu.apiestudiante2021.servicio.estudiante.consulta.ConsultaEstudianteService;

@Service
public class ConsultaEstudianteServiceImpl implements ConsultaEstudianteService {
	@Autowired
	private EstudianteRepository estudianteRepository;

	@Override
	public Iterable<Estudiante> findAll() {
		return estudianteRepository.findAll();
	}

	@Override
	public Estudiante findById(Integer idEstudiante) {
		return estudianteRepository.findById(idEstudiante).orElse(null);
	}
}
