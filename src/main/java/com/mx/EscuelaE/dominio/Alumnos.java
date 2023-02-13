package com.mx.EscuelaE.dominio;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;



@Entity
@Table(name="t_alumnos")
public class Alumnos {

	@Id
	@Column
	int id_t_usuarios;
	@Column
	String nombre;
	@Column
	String ap_paterno;
	@Column
	String ap_materno;
	@Column
	int activo;
	
	@OneToMany(mappedBy="id_t_usuarios", cascade=CascadeType.ALL)
	List<Calificaciones>lista = new ArrayList<Calificaciones>();
	
	public Alumnos() {
		
	}
	
	public Alumnos(int id_t_usuarios) {
		this.id_t_usuarios=id_t_usuarios;
	}
	
	public Alumnos(int id_t_usuarios, String ap_paterno, String ap_materno, int activo) {
		this.id_t_usuarios = id_t_usuarios;
		this.ap_paterno = ap_paterno;
		this.ap_materno = ap_materno;
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Alumnos [id_t_usuarios=" + id_t_usuarios + ", nombre=" + nombre + ", ap_paterno=" + ap_paterno
				+ ", ap_materno=" + ap_materno + ", activo=" + activo + "]";
	}

	public int getId_t_usuarios() {
		return id_t_usuarios;
	}

	public void setId_t_usuarios(int id_t_usuarios) {
		this.id_t_usuarios = id_t_usuarios;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getAp_paterno() {
		return ap_paterno;
	}

	public void setAp_paterno(String ap_paterno) {
		this.ap_paterno = ap_paterno;
	}

	public String getAp_materno() {
		return ap_materno;
	}

	public void setAp_materno(String ap_materno) {
		this.ap_materno = ap_materno;
	}

	public int getActivo() {
		return activo;
	}

	public void setActivo(int activo) {
		this.activo = activo;
	}

	
}
