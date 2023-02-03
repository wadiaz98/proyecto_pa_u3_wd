package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Renta;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.repository.IRentaRepo;

@Service
public class RentaServiceIml implements IRentaService {
	@Autowired
	private IRentaRepo rentaRepo;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IVehiculoService vehiculoService;

	@Override
	public void realizarRenta(String placa, String numeroCedula) {
		// TODO Auto-generated method stub
		Renta renta = new Renta();
		
		Cliente cliente = this.clienteService.consultar(numeroCedula);
		List<Renta> rentas = cliente.getRentas();
		rentas.add(renta);
		cliente.setRentas(rentas);
		this.clienteService.modificar(cliente);
		
		renta.setCliente(cliente);
		
		Vehiculo vehiculo = this.vehiculoService.consultar(placa);
		List<Renta> rentas2 = vehiculo.getRentas();
		rentas2.add(renta);
		vehiculo.setRentas(rentas2);
		this.vehiculoService.modificar(vehiculo);
		
		renta.setVehiculo(vehiculo);

		this.rentaRepo.insertar(renta);
	}

}
