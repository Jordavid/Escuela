package com.mx.EscuelaE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.EscuelaE.dominio.Materias;
import com.mx.EscuelaE.servicios.MateriasServ;

@RestController
@RequestMapping("MateriasWs")
@CrossOrigin
public class MateriasWs {

	@Autowired
	MateriasServ materiasServ;
	
	//http://localhost:9000/MateriasWs/listar
	@GetMapping("listar")
	public List<Materias> listar(){
		var lista = materiasServ.listar();
		return lista;
	}
	
	//http://localhost:9000/MateriasWs/buscar
	@PostMapping("buscar")
	public Materias buscar(@RequestBody Materias materias) {
		materias = materiasServ.buscar(materias);
		return materias;
	}
	
	//http://localhost:9000/MateriasWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Materias materias) {
		materiasServ.guardar(materias);
	}
	
	//http://localhost:9000/MateriasWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Materias materias) {
		materiasServ.eliminar(materias);
	}
	
	//http://localhost:9000/MateriasWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Materias materias) {
		materiasServ.editar(materias);
	}
}
