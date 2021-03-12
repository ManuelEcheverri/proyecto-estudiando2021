package co.com.edu.apiestudiante2021.dominio.excepcion;

public class ExcepcionValorObligatorio extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionValorObligatorio(String message) {
		super(message);
	}

}
