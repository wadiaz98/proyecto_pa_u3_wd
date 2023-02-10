package com.example.demo.service;

import com.example.demo.modelo.Automovil;

public interface IAutomovilService {
	
	public void insertar(Automovil automovil);

	// Typed Query
	public Automovil buscarPorPlacaTypedQuery(String placa);

	public Automovil buscarporMarcaTypedQuery(String marca);

	public Automovil buscarPorColorTypedQuery(String color);

	// Named QUERY
	public Automovil buscarPorPlacaNamedQuery(String placa);

	public Automovil buscarporMarcaNamedQuery(String marca);

	public Automovil buscarPorColorNamedQuery(String color);

	// Native Query
	public Automovil buscarPorPlacaNativeQuery(String placa);

	public Automovil buscarporMarcaNativeQuery(String marca);

	public Automovil buscarPorColorNativeQuery(String color);

	// Named Native Query
	public Automovil buscarPorPlacaNamedNativeQuery(String placa);

	public Automovil buscarporMarcaNamedNativeQuery(String marca);

	public Automovil buscarPorColorNamedNativeQuery(String color);
}
