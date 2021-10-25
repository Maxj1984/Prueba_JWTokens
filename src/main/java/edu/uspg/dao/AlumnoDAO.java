package edu.uspg.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import edu.uspg.model.Alumno;

public interface AlumnoDAO extends JpaRepository<Alumno , Integer>{

}
