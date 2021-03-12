package co.com.edu.apiestudiante2021.dominio.excepcion;

public class ExcepcionLongitudValor extends RuntimeException{
	
	private static final long serialVersionUID = 1L;

	public ExcepcionLongitudValor(String message) {
        super(message);
    }

}
