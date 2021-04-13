package co.com.edu.apiestudiante2021.consulta.institucioneducativa;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import co.com.edu.apiestudiante2021.model.InstitucionEducativa;
import co.com.edu.apiestudiante2021.servicio.institucioneducativa.consulta.ConsultaInstitucionEducativaService;
import io.swagger.annotations.Api;

@Api(tags = "Consulta los diferentes tipos de Institucion educativa")
@RestController
@RequestMapping("/v1/instituciones-educativas")
@CrossOrigin(origins = "*", methods = { RequestMethod.GET })
public class ControladorInstitucionEducativa {
	@Autowired
	private ConsultaInstitucionEducativaService consultaInstitucionEducativaService;

	@GetMapping
	Iterable<InstitucionEducativa> findAll() {
		return consultaInstitucionEducativaService.findAll();
	}

}
