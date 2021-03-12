package co.com.edu.apiestudiante2021.dominio.excepcion;

public class ExcepcionNoExisteRegistro extends RuntimeException{

	 private static final long serialVersionUID = 1L;

	    public ExcepcionNoExisteRegistro(String mensaje) {
	        super(mensaje);
	    }
}
