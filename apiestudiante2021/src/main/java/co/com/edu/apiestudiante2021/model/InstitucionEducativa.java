package co.com.edu.apiestudiante2021.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="institucioneducativa")
@Data
@NoArgsConstructor
public class InstitucionEducativa {

	@Id
	@Column(name = "idinstitucioneducativa")
	private Integer idInstitucionEducativa;
	@Column(name = "nombreinstitucioneducativa")
	private String nombreInstitucionEducativa;
}
