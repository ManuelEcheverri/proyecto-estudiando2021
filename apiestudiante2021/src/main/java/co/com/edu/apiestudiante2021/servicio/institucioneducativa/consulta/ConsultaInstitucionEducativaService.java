package co.com.edu.apiestudiante2021.servicio.institucioneducativa.consulta;

import co.com.edu.apiestudiante2021.model.InstitucionEducativa;
import co.com.edu.apiestudiante2021.model.TipoDocumento;

public interface ConsultaInstitucionEducativaService {

	Iterable<InstitucionEducativa> findAll();
}
