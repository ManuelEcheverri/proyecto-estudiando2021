package co.com.edu.apiestudiante2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Entity//Entidad de JPA
@Table(name="persona")
@Data
@NoArgsConstructor
public class Persona {
	@Id
	@GeneratedValue//Genera una secuencia en la base de datos
	@Column(name="idpersona")
	private Integer idPersona;
	//Agregacion objetual, con relacion de muchos a 1
	@ManyToOne
	@JoinColumn(name = "idtipodocumento") // va a ser la clave foranea y va a hacer la relacion, vincuacion de las 2 tablas
	private TipoDocumento tipoDocumento;
	@Column(name="nombres")
	private String nombres;
	@Column(name="apellidos")
	private String apellidos;
}
