package com.mx.EscuelaE.dominio;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;


@Entity
@Table(name="t_materias")
public class Materias {
	@Id
	@Column
	int id_t_materias;
	@Column
	String nombre;
	@Column
	int activo;
	
	@OneToMany(mappedBy="id_t_materias",cascade=CascadeType.ALL)
	List<Calificaciones>lista = new ArrayList<Calificaciones>();

	
	public Materias() {
		
	}
	
	public Materias(int id) {
		this.id_t_materias = id;
	}
	
	public Materias(int id, String nombre, int activo) {
		this.id_t_materias = id;
		this.nombre = nombre;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Materias [id=" + id_t_materias + ", nombre=" + nombre + ", activo=" + activo + "]";
	}

	public int getId() {
		return id_t_materias;
	}

	public void setId(int id) {
		this.id_t_materias = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}
	
	
}
