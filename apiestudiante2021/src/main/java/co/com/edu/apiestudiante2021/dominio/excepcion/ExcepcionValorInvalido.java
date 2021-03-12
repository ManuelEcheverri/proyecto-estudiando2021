package co.com.edu.apiestudiante2021.dominio.excepcion;

public class ExcepcionValorInvalido extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public ExcepcionValorInvalido(String message) {
		super(message);
	}

}
