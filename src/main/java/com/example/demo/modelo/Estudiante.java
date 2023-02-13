package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQueries;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQueries;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity

@NamedQueries({
		@NamedQuery(name = "Estudiante.buscarPorApe", query = "select e from Estudiante e where e.apellido = :datoApellido"),
		@NamedQuery(name = "Estudiante.buscarPorApe1", query = "select e from Estudiante e where e.apellido = :datoApellido"),
		@NamedQuery(name = "Estudiante.buscarPorApe2", query = "select e from Estudiante e where e.apellido = :datoApellido"),
		@NamedQuery(name = "Estudiante.EliminarporNombre", query = "DELETE FROM Estudiante e where e.nombre = :datoNombre") })

@NamedNativeQueries({
		@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative", query = "select * from estudiante where estu_nombre = :datoNombre", resultClass = Estudiante.class),
		@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative1", query = "select * from estudiante where estu_nombre = :datoNombre", resultClass = Estudiante.class),
		@NamedNativeQuery(name = "Estudiante.buscarPorNombreNative2", query = "select * from estudiante where estu_nombre = :datoNombre", resultClass = Estudiante.class) })
@Table(name = "estudiante")
public class Estudiante {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "cualquiera")
	@SequenceGenerator(name = "cualquiera", sequenceName = "estu_seq", allocationSize = 1)
	@Column(name = "estu_id")
	private Integer id;

	@Column(name = "estu_nombre")
	private String nombre;

	@Column(name = "estu_apellido")
	private String apellido;

	@Column(name = "estu_genero")
	private String genero;

	@Column(name = "estu_cedula")
	private String cedula;

	@Column(name = "estu_ciudad")
	private String ciudad;

	// Getters y setters
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

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCedula() {
		return cedula;
	}

	public void setCedula(String cedula) {
		this.cedula = cedula;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", nombre=" + nombre + ", apellido=" + apellido + ", genero=" + genero
				+ ", cedula=" + cedula + ", ciudad=" + ciudad + "]";
	}

}
