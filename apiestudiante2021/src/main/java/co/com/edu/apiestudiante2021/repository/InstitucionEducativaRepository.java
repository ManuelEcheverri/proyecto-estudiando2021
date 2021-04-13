package co.com.edu.apiestudiante2021.repository;

import org.springframework.data.repository.CrudRepository;

import org.springframework.stereotype.Repository;

import co.com.edu.apiestudiante2021.model.InstitucionEducativa;

@Repository
public interface InstitucionEducativaRepository extends CrudRepository<InstitucionEducativa, Integer> {

}
