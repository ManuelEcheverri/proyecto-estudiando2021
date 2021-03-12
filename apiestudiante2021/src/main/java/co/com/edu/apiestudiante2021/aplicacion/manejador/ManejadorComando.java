package co.com.edu.apiestudiante2021.aplicacion.manejador;

import javax.transaction.Transactional;

public interface ManejadorComando<C> {
	
	@Transactional
	void ejecutar(C comando);

}
