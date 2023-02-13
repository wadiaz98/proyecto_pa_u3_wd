package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3WdApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Metodos de eliminar: ");
		System.out.println(this.estudianteService.eliminarPorNombre("Marco"));
		System.out.println(this.estudianteService.eliminarPorCedula("1725841579"));

		System.out.println("Metodos de actualizar: ");
		System.out.println(this.estudianteService.actualizarApellidoPorCiudad("Machala", "Torres"));
		System.out.println(this.estudianteService.actualizarNombreporGenero("F", "Rosa"));
	}

}
