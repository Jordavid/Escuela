package com.mx.EscuelaE.servicios;

import java.util.List;

import com.mx.EscuelaE.dominio.Calificaciones;

public interface CalificacionesServ {

	public void guardar(Calificaciones calificaciones);
	
	public void eliminar(Calificaciones calificaciones);
	
	public void editar(Calificaciones calificaciones);
	
	public Calificaciones buscar(Calificaciones calificaciones);
	
	public List<Calificaciones> listar();
}
