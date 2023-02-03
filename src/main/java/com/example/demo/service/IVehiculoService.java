package com.example.demo.service;

import com.example.demo.modelo.Vehiculo;

public interface IVehiculoService {

	public void guardar(Vehiculo vehiculo);

	public void modificar(Vehiculo vehiculo);

	public Vehiculo consultar(String placa);

	public void borrar(String placa);
}
