package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Cliente;
import com.example.demo.modelo.Vehiculo;
import com.example.demo.service.IClienteService;
import com.example.demo.service.IRentaService;
import com.example.demo.service.IVehiculoService;

@SpringBootApplication
public class ProyectoPaU2WdApplication implements CommandLineRunner {

	@Autowired
	private IVehiculoService vehiculoService;
	@Autowired
	private IClienteService clienteService;
	@Autowired
	private IRentaService rentaService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU2WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		Vehiculo vehiculo1 = new Vehiculo();
		vehiculo1.setPlaca("ABC123");
		vehiculo1.setColor("Verde");
		vehiculo1.setMarca("Chevrolet");
		vehiculo1.setTipo("P");

		Vehiculo vehiculo2 = new Vehiculo();
		vehiculo2.setPlaca("DEF456");
		vehiculo2.setColor("Rojo");
		vehiculo2.setMarca("Toyota");
		vehiculo2.setTipo("L");

		Vehiculo vehiculo3 = new Vehiculo();
		vehiculo3.setPlaca("GHI789");
		vehiculo3.setColor("Blanco");
		vehiculo3.setMarca("Ford");
		vehiculo3.setTipo("P");

		Cliente cliente1 = new Cliente();
		cliente1.setNumeroCedula("1725841538");
		cliente1.setNombre("Willan");
		cliente1.setApellido("Diaz");
		cliente1.setEdad(18);

		Cliente cliente2 = new Cliente();
		cliente2.setNumeroCedula("1725841539");
		cliente2.setNombre("Alexander");
		cliente2.setApellido("Cordova");
		cliente2.setEdad(20);

		Cliente cliente3 = new Cliente();
		cliente3.setNumeroCedula("1725841530");
		cliente3.setNombre("Marco");
		cliente3.setApellido("Solis");
		cliente3.setEdad(22);

		this.vehiculoService.guardar(vehiculo1);
		this.vehiculoService.guardar(vehiculo2);
		this.vehiculoService.guardar(vehiculo3);

		this.clienteService.guardar(cliente1);
		this.clienteService.guardar(cliente2);
		this.clienteService.guardar(cliente3);

		this.rentaService.realizarRenta("DEF456", "1725841538");

	}

}
