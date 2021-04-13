package co.com.edu.apiestudiante2021.servicio.institucioneducativa.consulta.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import co.com.edu.apiestudiante2021.model.InstitucionEducativa;
import co.com.edu.apiestudiante2021.repository.InstitucionEducativaRepository;
import co.com.edu.apiestudiante2021.repository.TipoDocumentoRepository;
import co.com.edu.apiestudiante2021.servicio.institucioneducativa.consulta.ConsultaInstitucionEducativaService;

@Service
public class ConsultaInstitucionEducativaServiceImpl implements ConsultaInstitucionEducativaService{
	
	@Autowired
	private InstitucionEducativaRepository institucionEducativaRepository;

	@Override
	public Iterable<InstitucionEducativa> findAll() {
		return institucionEducativaRepository.findAll();
	}

}
