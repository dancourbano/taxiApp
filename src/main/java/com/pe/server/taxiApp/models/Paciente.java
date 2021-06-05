package com.pe.server.taxiApp.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="paciente")
public class Paciente {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer idPaciente;
	
	@Size(min=2,message="Nombres minimo 2 caracteres")
	@Column(name="nombres", nullable=false, length=70)
	private String nombres;
	
	@Size(min=3,message="Nombres minimo 3 caracteres")
	@Column(name="apellidos", nullable=false, length=70)
	private String apellidos;
	
	@Size(min=3,message="Nombres minimo 3 caracteres")
	@Column(name="telefono", nullable=false, length=170)
	private String telefono;
	
	@Size(min=8,message="Nombres minimo 8 caracteres")
	@Column(name="dni", nullable=false, length=70)
	private String dni;
	@Size(min=3,message="Nombres minimo 8 caracteres")
	@Column(name="direccion", nullable=false, length=170)
	private String direccion;
	public Integer getIdPaciente() {
		return idPaciente;
	}
	public void setIdPaciente(Integer idPaciente) {
		this.idPaciente = idPaciente;
	}
	public String getNombres() {
		return nombres;
	}
	public void setNombres(String nombres) {
		this.nombres = nombres;
	}
	public String getApellidos() {
		return apellidos;
	}
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	public String getTelefono() {
		return telefono;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getDireccion() {
		return direccion;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	
}
