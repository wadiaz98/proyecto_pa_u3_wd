package com.example.demo.service;

import com.example.demo.modelo.Cliente;

public interface IClienteService {

	public void guardar(Cliente cliente);

	public void modificar(Cliente cliente);

	public Cliente consultar(String numeroCedula);

	public void borrar(String numeroCedula);
}
