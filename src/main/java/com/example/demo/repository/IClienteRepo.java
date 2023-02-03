package com.example.demo.repository;

import com.example.demo.modelo.Cliente;

public interface IClienteRepo {

	public void insertar(Cliente cliente);

	public void actualizar(Cliente cliente);

	public Cliente buscar(String numeroCedula);

	public void borrar(String numeroCedula);

}
