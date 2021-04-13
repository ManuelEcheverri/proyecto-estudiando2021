	package co.com.edu.apiestudiante2021.comando.converter.estudiante;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import co.com.edu.apiestudiante2021.comando.dto.estudiante.EstudianteDTO;
import co.com.edu.apiestudiante2021.dominio.ValidadorArgumento;
import co.com.edu.apiestudiante2021.model.Estudiante;
import co.com.edu.apiestudiante2021.model.InstitucionEducativa;
import co.com.edu.apiestudiante2021.servicio.estudiante.consulta.ConsultaEstudianteService;
import co.com.edu.apiestudiante2021.model.TipoDocumento;

@Component
public class EstudianteConverter {
	@Autowired
	private ConsultaEstudianteService consultaEstudianteService;

	private static final String EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO = "El nombre del estudiante es obligatorio";
	private static final String EL_APELLIDO_DEL_ESTUDIANTE_ES_OBLIGATORIO = "El apellido del estudiante es obligatorio";
	private static final String EL_TIPO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO = "El tipo de documento del estudiante es obligatorio";
	private static final String EL_NUMERO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO = "La cedula del estudiante es un dato obligatorio";
	private static final String LA_INSTITUCION_EDUCATIVA_DEL_ESTUDIANTE_ES_OBLIGATORIO = "La institucion educactiva del estudiante es un dato obligatorio";

	public Estudiante crear(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		TipoDocumento tipoDocumento = new TipoDocumento();
		InstitucionEducativa institucionEducativa = new InstitucionEducativa();
		
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_APELLIDO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_NUMERO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_APELLIDO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		
		tipoDocumento.setIdTipoDocumento(estudianteDTO.getIdTipoDocumento());
		estudiante.setTipoDocumento(tipoDocumento);
		estudiante.setNombres(estudianteDTO.getNombres());
		estudiante.setApellidos(estudianteDTO.getApellidos());
		estudiante.setNumeroDocumento(estudianteDTO.getNumeroDocumento());
		institucionEducativa.setIdInstitucionEducativa(estudianteDTO.getIdInstitucionEducativa());
		estudiante.setInstitucionEducativa(institucionEducativa);
		return estudiante;

	}

}
