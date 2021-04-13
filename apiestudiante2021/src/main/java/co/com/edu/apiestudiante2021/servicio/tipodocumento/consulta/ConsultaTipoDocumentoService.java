package co.com.edu.apiestudiante2021.servicio.tipodocumento.consulta;

import co.com.edu.apiestudiante2021.model.TipoDocumento;

public interface ConsultaTipoDocumentoService {

	Iterable<TipoDocumento> findAll();

}
