package com.mx.EscuelaE.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.EscuelaE.dao.CalificacionesDao;
import com.mx.EscuelaE.dominio.Calificaciones;

@Service
public class CalificacionesServImpl implements CalificacionesServ{

	@Autowired
	CalificacionesDao calificacionesDao;
	
	public void guardar(Calificaciones calificaciones) {
		calificacionesDao.save(calificaciones);		
	}

	@Override
	public void eliminar(Calificaciones calificaciones) {
		calificacionesDao.delete(calificaciones);
	}

	@Override
	public void editar(Calificaciones calificaciones) {
		calificacionesDao.save(calificaciones);		
	}

	@Override
	public Calificaciones buscar(Calificaciones calificaciones) {
		
		return calificacionesDao.findById(calificaciones.getId_t_usuarios()).orElse(null);
	}

	@Override
	public List<Calificaciones> listar() {
		return (List<Calificaciones>) calificacionesDao.findAll();
	}



}
