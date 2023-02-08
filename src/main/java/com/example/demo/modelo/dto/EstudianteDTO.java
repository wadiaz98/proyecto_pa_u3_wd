package com.example.demo.modelo.dto;

public class EstudianteDTO {

	private Integer id;

	private String nombre;

	private String apellido;

	// Constructores
	public EstudianteDTO() {

	}

	public EstudianteDTO(Integer id, String nombre, String apellido) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.apellido = apellido;
	}

	// Set y get

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
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

	// To String
	@Override
	public String toString() {
		return "EstudianteDTO [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + "]";
	}

}
