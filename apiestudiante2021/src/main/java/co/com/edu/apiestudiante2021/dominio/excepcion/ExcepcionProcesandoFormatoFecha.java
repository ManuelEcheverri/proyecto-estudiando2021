package co.com.edu.apiestudiante2021.dominio.excepcion;

public class ExcepcionProcesandoFormatoFecha extends RuntimeException {

	private static final long serialVersionUID = 1L;

    public ExcepcionProcesandoFormatoFecha(String mensaje) {
        super(mensaje);
    }
}
