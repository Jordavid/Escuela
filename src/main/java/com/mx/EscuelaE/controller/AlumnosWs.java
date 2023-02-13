package com.mx.EscuelaE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.EscuelaE.dominio.Alumnos;
import com.mx.EscuelaE.servicios.AlumnosServ;

@RestController
@RequestMapping("AlumnoWs")
@CrossOrigin
public class AlumnosWs {

	@Autowired
	AlumnosServ alumnosServ;
	
	//http://localhost:9000/AlumnoWs/listar
	@GetMapping("listar")
	public List<Alumnos> listar(){
		var lista = alumnosServ.listar();
		return lista;
	}
	
	//http://localhost:9000/AlumnoWs/buscar
	@PostMapping("buscar")
	public Alumnos buscar(@RequestBody Alumnos alumnos) {
		alumnos = alumnosServ.buscar(alumnos);
		return alumnos;
	}
	
	//http://localhost:9000/AlumnoWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Alumnos alumnos) {
		alumnosServ.guardar(alumnos);
	}
	
	//http://localhost:9000/AlumnoWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Alumnos alumnos) {
		alumnosServ.eliminar(alumnos);
	}
	
	//http://localhost:9000/AlumnoWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Alumnos alumnos) {
		alumnosServ.editar(alumnos);
	}
}
