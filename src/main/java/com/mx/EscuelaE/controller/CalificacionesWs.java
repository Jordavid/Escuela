package com.mx.EscuelaE.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.EscuelaE.dominio.Calificaciones;
import com.mx.EscuelaE.servicios.CalificacionesServ;

@RestController
@RequestMapping("CalificacionesWs")
@CrossOrigin
public class CalificacionesWs {

	@Autowired
	CalificacionesServ caliServ;
	
	//http://localhost:9000/CalificacionesWs/listar
	@GetMapping("listar")
	public List<Calificaciones> listar(){
		var  lista = caliServ.listar();
		return lista;
	}
	
	//http://localhost:9000/CalificacionesWs/buscar
	@PostMapping("buscar")
	public Calificaciones buscar(@RequestBody Calificaciones cali) {
		cali = caliServ.buscar(cali);
		return cali;
	}
	
	//http://localhost:9000/CalificacionesWs/guardar
	@PostMapping("guardar")
	public void guardar(@RequestBody Calificaciones cali) {
		caliServ.guardar(cali);
	}
	
	//http://localhost:9000/CalificacionesWs/eliminar
	@PostMapping("eliminar")
	public void eliminar(@RequestBody Calificaciones cali) {
		caliServ.guardar(cali);
	}
	
	//http://localhost:9000/CalificacionesWs/editar
	@PostMapping("editar")
	public void editar(@RequestBody Calificaciones cali) {
		caliServ.editar(cali);
	}
}
