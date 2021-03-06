package co.com.edu.apiestudiante2021.consulta.tipodocumento;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.apiestudiante2021.model.TipoDocumento;
import co.com.edu.apiestudiante2021.servicio.tipodocumento.consulta.ConsultaTipoDocumentoService;
import io.swagger.annotations.Api;


@RestController
@RequestMapping("/v1/tipo-documento")

public class ControladorTipoDocumento {

	@Autowired
	private ConsultaTipoDocumentoService consultaTipoDocumentoService;

	@GetMapping
	Iterable<TipoDocumento> findAll() {
		return consultaTipoDocumentoService.findAll();
	}

}
