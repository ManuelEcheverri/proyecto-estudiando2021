package co.com.edu.apiestudiante2021.servicio.tipodocumento.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.edu.apiestudiante2021.model.TipoDocumento;
import co.com.edu.apiestudiante2021.repository.TipoDocumentoRepository;
import co.com.edu.apiestudiante2021.servicio.tipodocumento.consulta.ConsultaTipoDocumentoService;

@Service
public class ConsultaTipoDocumentoServiceImpl implements ConsultaTipoDocumentoService {

	@Autowired
	private TipoDocumentoRepository tipoDocumentoRepository;

	@Override
	public Iterable<TipoDocumento> findAll() {
		return tipoDocumentoRepository.findAll();
	}

}
