package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Automovil;
import com.example.demo.repository.IAutomovilRepo;

@Service
public class AutomovilServiceImpl implements IAutomovilService {

	@Autowired
	private IAutomovilRepo automovilRepo;

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.automovilRepo.insertar(automovil);
	}

	@Override
	public Automovil buscarPorPlacaTypedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaTypedQuery(placa);
	}

	@Override
	public Automovil buscarporMarcaTypedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarporMarcaTypedQuery(marca);
	}

	@Override
	public Automovil buscarPorColorTypedQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorTypedQuery(color);
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNamedQuery(placa);
	}

	@Override
	public Automovil buscarporMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarporMarcaNamedQuery(marca);
	}

	@Override
	public Automovil buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNamedQuery(color);
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNativeQuery(placa);
	}

	@Override
	public Automovil buscarporMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarporMarcaNativeQuery(marca);
	}

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNativeQuery(color);
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorPlacaNamedNativeQuery(placa);
	}

	@Override
	public Automovil buscarporMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarporMarcaNamedNativeQuery(marca);
	}

	@Override
	public Automovil buscarPorColorNamedNativeQuery(String color) {
		// TODO Auto-generated method stub
		return this.automovilRepo.buscarPorColorNamedNativeQuery(color);
	}

}
