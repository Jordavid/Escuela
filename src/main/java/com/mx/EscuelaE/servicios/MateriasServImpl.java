package com.mx.EscuelaE.servicios;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mx.EscuelaE.dao.MateriasDao;
import com.mx.EscuelaE.dominio.Materias;

@Service
public class MateriasServImpl implements MateriasServ{
	
	@Autowired
	MateriasDao materiasDao;

	@Override
	public void guardar(Materias materias) {
		materiasDao.save(materias);
	}

	@Override
	public void eliminar(Materias materias) {
		materiasDao.delete(materias);
	}

	@Override
	public void editar(Materias materias) {
		materiasDao.save(materias);
	}

	@Override
	public Materias buscar(Materias materias) {
		return materiasDao.findById(materias.getId()).orElse(null);
	}

	@Override
	public List<Materias> listar() {
		// TODO Auto-generated method stub
		return (List<Materias>) materiasDao.findAll();
	}

	

}
