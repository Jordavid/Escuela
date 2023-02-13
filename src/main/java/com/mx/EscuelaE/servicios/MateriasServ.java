package com.mx.EscuelaE.servicios;

import java.util.List;

import com.mx.EscuelaE.dominio.Materias;

public interface MateriasServ {
	
	public void guardar(Materias materias);
	
	public void eliminar(Materias materias);
	
	public void editar(Materias materias);
	
	public Materias buscar(Materias materias);
	
	public List<Materias> listar();
}
