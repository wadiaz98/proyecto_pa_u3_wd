package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "cliente")
public class Cliente {

	@Id
	@Column(name = "clie_numero_cedula")
	private String numeroCedula;

	@Column(name = "clie_nombre")
	private String Nombre;

	@Column(name = "clie_apellido")
	private String apellido;

	@Column(name = "clie_edad")
	private Integer edad;

	@OneToMany(mappedBy = "cliente", fetch = FetchType.EAGER)
	private List<Renta> rentas;

	// Set y Get

	public String getNumeroCedula() {
		return numeroCedula;
	}

	public void setNumeroCedula(String numeroCedula) {
		this.numeroCedula = numeroCedula;
	}

	public String getNombre() {
		return Nombre;
	}

	public void setNombre(String nombre) {
		Nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

	@Override
	public String toString() {
		return "Cliente [ numeroCedula=" + numeroCedula + ", Nombre=" + Nombre + ", apellido=" + apellido + ", edad="
				+ edad + "]";
	}

}
