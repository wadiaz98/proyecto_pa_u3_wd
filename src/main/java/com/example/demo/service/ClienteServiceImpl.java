package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.repository.IClienteRepo;

@Service
public class ClienteServiceImpl implements IClienteService {

	@Autowired
	private IClienteRepo clienteRepo;

	@Override
	public void guardar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.insertar(cliente);
	}

	@Override
	public void modificar(Cliente cliente) {
		// TODO Auto-generated method stub
		this.clienteRepo.actualizar(cliente);
	}

	@Override
	public Cliente consultar(String numeroCedula) {
		// TODO Auto-generated method stub
		return this.clienteRepo.buscar(numeroCedula);
	}

	@Override
	public void borrar(String numeroCedula) {
		// TODO Auto-generated method stub
		this.clienteRepo.borrar(numeroCedula);
	}

}
