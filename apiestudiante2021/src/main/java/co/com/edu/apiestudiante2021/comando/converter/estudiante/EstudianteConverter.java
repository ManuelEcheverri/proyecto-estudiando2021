package co.com.edu.apiestudiante2021.comando.converter.estudiante;

import org.springframework.stereotype.Component;

import co.com.edu.apiestudiante2021.comando.dto.estudiante.EstudianteDTO;
import co.com.edu.apiestudiante2021.dominio.ValidadorArgumento;
import co.com.edu.apiestudiante2021.model.Estudiante;

@Component
public class EstudianteConverter {

	private static final String EL_ID_ESTUDIANTE_ES_OBLIGATORIO = "El id estudiante es obligatorio";
	private static final String EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO = "El nombre del estudiante es obligatorio";
	private static final String EL_APELLIDO_DEL_ESTUDIANTE_ES_OBLIGATORIO = "El apellido del estudiante es obligatorio";
	private static final String EL_TIPO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO = "El tipo de documento del estudiante es obligatorio";
	private static final String EL_NUMERO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO = "La cedula del estudiante es un dato obligatorio";
	private static final String EL_ID_DE_LA_INSTITUCION_EDUCATIVA_DEL_ESTUDIANTE_ES_OBLIGATORIO = "La institucion educactiva del estudiante es un dato obligatorio";

	public Estudiante crear(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdTipoDocumento(),
				EL_TIPO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getApellidos(), EL_APELLIDO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNumeroDocumento(),
				EL_NUMERO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdInstitucionEducativa(),
				EL_ID_DE_LA_INSTITUCION_EDUCATIVA_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		estudiante.getTipoDocumento().setIdTipoDocumento(estudianteDTO.getIdTipoDocumento());
		estudiante.setNombres(estudianteDTO.getNombres());
		estudiante.setApellidos(estudianteDTO.getApellidos());
		estudiante.setNumeroDocumento(estudianteDTO.getNumeroDocumento());
		estudiante.getInstitucionEducativa().setIdInstitucionEducativa(estudianteDTO.getIdInstitucionEducativa());
		return estudiante;

	}

	public Estudiante editar(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdEstudiante(), EL_ID_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdTipoDocumento(),
				EL_TIPO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNombres(), EL_NOMBRE_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getApellidos(), EL_APELLIDO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getNumeroDocumento(),
				EL_NUMERO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdInstitucionEducativa(),
				EL_ID_DE_LA_INSTITUCION_EDUCATIVA_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		estudiante.setIdEstudiante(estudianteDTO.getIdEstudiante());
		estudiante.getTipoDocumento().setIdTipoDocumento(estudianteDTO.getIdTipoDocumento());
		estudiante.setNombres(estudianteDTO.getNombres());
		estudiante.setApellidos(estudianteDTO.getApellidos());
		estudiante.setNumeroDocumento(estudianteDTO.getNumeroDocumento());
		estudiante.getInstitucionEducativa().setIdInstitucionEducativa(estudianteDTO.getIdInstitucionEducativa());
		return estudiante;
	}

	public Estudiante borrar(EstudianteDTO estudianteDTO) {
		Estudiante estudiante = new Estudiante();
		ValidadorArgumento.validarObligatorio(estudianteDTO.getIdTipoDocumento(),
				EL_TIPO_DE_DOCUMENTO_DEL_ESTUDIANTE_ES_OBLIGATORIO);
		estudiante.setIdEstudiante(estudianteDTO.getIdTipoDocumento());
		return estudiante;
	}

}
