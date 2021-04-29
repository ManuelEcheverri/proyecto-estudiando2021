package co.com.edu.apiestudiante2021.comando.dto.estudiante;

import lombok.Data;

@Data
public class EstudianteDTO {

	private Integer idEstudiante;
	private Integer idTipoDocumento;
	private String numeroDocumento;
	private String nombres;
	private String apellidos;
	private Integer idInstitucionEducativa;

}
