package com.mx.EscuelaE.dominio;

import java.util.Date;

import jakarta.persistence.*;

@Entity
@Table(name="t_calificaciones")
public class Calificaciones {
	
	@Id
	@Column
	int id_t_calificaciones;
	
	@Column
	int id_t_materias;
	
	@Column
	int id_t_usuarios;
	
	@Column
	double calificacion;
	
	@Column
	Date fecha_registro = new Date();
	
	@ManyToOne(fetch=FetchType.EAGER) // carga los valores en tiempo de ejecuccion ,solo en el objeto
	@JoinColumn(name="id_usuarios")
	Alumnos alumnos;

	@ManyToOne(fetch=FetchType.EAGER) // carga los valores en tiempo de ejecuccion ,solo en el objeto
	@JoinColumn(name="id_materias")
	Materias materias;
	
	public Calificaciones() {
		
	}
	
	public Calificaciones (int calificaciones) {
		this.id_t_calificaciones = calificaciones;
	}
	
	public Calificaciones(int calificaciones, int materias, 
			int usuarios, double calificacion) {
		this.id_t_calificaciones = calificaciones;
		this.id_t_materias = materias;
		this.id_t_usuarios = usuarios;
		this.calificacion = calificacion;
	}

	@Override
	public String toString() {
		return "Calificaciones [id_t_calificaciones=" + id_t_calificaciones + ", id_t_materias=" + id_t_materias
				+ ", id_t_usuarios=" + id_t_usuarios + ", calificacion=" + calificacion + ", fecha_registro="
				+ fecha_registro + ", alumnos=" + alumnos + ", materias=" + materias + "]";
	}

	public int getId_t_calificaciones() {
		return id_t_calificaciones;
	}

	public void setId_t_calificaciones(int id_t_calificaciones) {
		this.id_t_calificaciones = id_t_calificaciones;
	}

	public int getId_t_materias() {
		return id_t_materias;
	}

	public void setId_t_materias(int id_t_materias) {
		this.id_t_materias = id_t_materias;
	}

	public int getId_t_usuarios() {
		return id_t_usuarios;
	}

	public void setId_t_usuarios(int id_t_usuarios) {
		this.id_t_usuarios = id_t_usuarios;
	}

	public double getCalificacion() {
		return calificacion;
	}

	public void setCalificacion(double calificacion) {
		this.calificacion = calificacion;
	}

	public Date getFecha_registro() {
		return fecha_registro;
	}

	public void setFecha_registro(Date fecha_registro) {
		this.fecha_registro = fecha_registro;
	}

	public Alumnos getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(Alumnos alumnos) {
		this.alumnos = alumnos;
	}

	public Materias getMaterias() {
		return materias;
	}

	public void setMaterias(Materias materias) {
		this.materias = materias;
	}

}
