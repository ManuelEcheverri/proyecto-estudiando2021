package co.com.edu.apiestudiante2021.comando.converter.estudiante;

import org.springframework.stereotype.Component;

import co.com.edu.apiestudiante2021.comando.dto.estudiante.EstudianteDTO;
import co.com.edu.apiestudiante2021.dominio.ValidadorArgumento;
import co.com.edu.apiestudiante2021.model.Estudiante;

@Component
public class EstudianteConverter {

	private static final String EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO = "El nombre del estudiante es obligatorio";

	public Estudiante crear(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		estudiante.setNombres(estudianteDTO.getNombres());
		return estudiante;
	}
}
