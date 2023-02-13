package com.mx.EscuelaE.servicios;

import java.util.List;

import com.mx.EscuelaE.dominio.Alumnos;

public interface AlumnosServ {
	
	public void guardar(Alumnos alumnos);
	
	public void eliminar(Alumnos alumnos);
	
	public void editar(Alumnos alumnos);
	
	public Alumnos buscar(Alumnos alumnos);
	
	public List<Alumnos> listar();
}
