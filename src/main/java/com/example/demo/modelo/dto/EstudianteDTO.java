package com.example.demo.modelo.dto;

public class EstudianteDTO {

	private String cedula;

	private String nombre;

	private String apellido;

	private String genero;

	// Constructores
	public EstudianteDTO() {

	}

	public EstudianteDTO(String cedula, String nombre, String apellido, String genero) {
		super();
		this.cedula = cedula;
		this.nombre = nombre;
		this.apellido = apellido;
		this.genero = genero;
	}

	// Set y get

	public String getNombre() {
		return nombre;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	@Override
	public String toString() {
		return "EstudianteDTO [cedula=" + cedula + ", nombre=" + nombre + ", apellido=" + apellido + ", genero="
				+ genero + "]";
	}

}
