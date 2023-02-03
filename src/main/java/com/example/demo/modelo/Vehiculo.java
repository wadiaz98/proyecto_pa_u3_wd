package com.example.demo.modelo;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "vehiculo")
public class Vehiculo {

	@Id
	@Column(name = "vehi_placa")
	private String placa;

	@Column(name = "vehi_marca")
	private String marca;

	@Column(name = "vehi_color")
	private String color;

	@Column(name = "vehi_tipo")
	private String tipo;

	@OneToMany(mappedBy = "vehiculo", fetch = FetchType.EAGER)
	private List<Renta> rentas;

	// Set y get

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public List<Renta> getRentas() {
		return rentas;
	}

	public void setRentas(List<Renta> rentas) {
		this.rentas = rentas;
	}

	@Override
	public String toString() {
		return "Vehiculo [ marca=" + marca + ", placa=" + placa + ", color=" + color + ", tipo=" + tipo + "]";
	}

}
