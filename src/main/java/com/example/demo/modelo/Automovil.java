package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.NamedNativeQuery;
import jakarta.persistence.NamedQuery;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "automovil")
@NamedQuery(name = "Automovil.buscarPorPlaca", query = "select e from Automovil e where e.placa = :datoPlaca")
@NamedQuery(name = "Automovil.buscarPorMarca", query = "select e from Automovil e where e.marca = :datoMarca")
@NamedQuery(name = "Automovil.buscarPorColor", query = "select e from Automovil e where e.color = :datoColor")

@NamedNativeQuery(name = "Automovil.buscarPorPlacaNative", query = "select * from automovil where auto_placa = :datoPlaca", resultClass = Automovil.class)
@NamedNativeQuery(name = "Automovil.buscarPorMarcaNative", query = "select * from automovil where auto_marca = :datoMarca", resultClass = Automovil.class)
@NamedNativeQuery(name = "Automovil.buscarPorColorNative", query = "select * from automovil where auto_color = :datoColor", resultClass = Automovil.class)
public class Automovil {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "auto_seq")
	@SequenceGenerator(name = "auto_seq", sequenceName = "auto_seq", allocationSize = 1)
	@Column(name = "auto_id")
	private Integer id;

	@Column(name = "auto_placa")
	private String placa;

	@Column(name = "auto_marca")
	private String marca;

	@Column(name = "auto_color")
	private String color;

	@Column(name = "auto_tipo")
	private String tipo;

	@Column(name = "auto_marchas")
	private String marchas;

	@Column(name = "auto_motor")
	private String motor;

	@Column(name = "auto_modelo")
	private String modelo;

	// Set y Get

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
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

	public String getMarchas() {
		return marchas;
	}

	public void setMarchas(String marchas) {
		this.marchas = marchas;
	}

	public String getMotor() {
		return motor;
	}

	public void setMotor(String motor) {
		this.motor = motor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}
	// To String

	@Override
	public String toString() {
		return "Automovil [id=" + id + ", placa=" + placa + ", marca=" + marca + ", color=" + color + ", tipo=" + tipo
				+ ", marchas=" + marchas + ", motor=" + motor + ", modelo=" + modelo + "]";
	}

}
