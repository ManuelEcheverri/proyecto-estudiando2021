package co.com.edu.apiestudiante2021.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import co.com.edu.apiestudiante2021.model.TipoDocumento;
@Repository
public interface TipoDocumentoRepository extends CrudRepository<TipoDocumento, Integer>{ // pide entidad y clave primaria para esa entidad 

}
