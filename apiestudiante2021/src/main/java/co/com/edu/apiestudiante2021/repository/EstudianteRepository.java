package co.com.edu.apiestudiante2021.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.edu.apiestudiante2021.model.Estudiante;

@Repository
public interface EstudianteRepository extends CrudRepository<Estudiante, Integer> {

	
}
