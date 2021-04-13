package co.com.edu.apiestudiante2021.aplicacion.manejador;

import javax.transaction.Transactional;

public interface ManejadorComandoRespuesta <C, R> {
	
	 @Transactional
	 R ejecutar(C comando);

}
