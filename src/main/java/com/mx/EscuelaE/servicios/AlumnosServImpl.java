package com.mx.EscuelaE.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.EscuelaE.dao.AlumnoDao;
import com.mx.EscuelaE.dominio.Alumnos;

@Service
public class AlumnosServImpl implements AlumnosServ{
	
	@Autowired
	AlumnoDao alumnoDao;
	
	@Override
	public void guardar(Alumnos alumnos) {
		alumnoDao.save(alumnos);
	}
	
	@Override
	public void eliminar(Alumnos alumnos) {
		alumnoDao.delete(alumnos);
	}
	
	@Override
	public void editar(Alumnos alumnos) {
		alumnoDao.save(alumnos);
	}
	
	@Override
	public Alumnos buscar(Alumnos alumnos) {
		return alumnoDao.findById(alumnos.getId_t_usuarios()).orElse(null);
	}
	
	@Override
	public List<Alumnos> listar() {
		return (List<Alumnos>) alumnoDao.findAll();
	}
	
}
