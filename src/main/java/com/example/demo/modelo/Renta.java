package com.example.demo.modelo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "Renta")
public class Renta {

	@Id
	@Column(name = "rent_id")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "rent_seq")
	@SequenceGenerator(name = "rent_seq", sequenceName = "rent_seq", allocationSize = 1)
	private Integer id;

	@ManyToOne
	@JoinColumn(name = "rent_id_vehiculo")
	private Vehiculo vehiculo;

	@ManyToOne
	@JoinColumn(name = "rent_id_cliente")
	private Cliente cliente;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}

	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

}
