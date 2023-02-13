package com.mx.EscuelaE.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mx.EscuelaE.dominio.Alumnos;

public interface AlumnoDao extends JpaRepository<Alumnos, Integer>{

}
