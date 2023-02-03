package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
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
		Estudiante estudiante1 = new Estudiante();
		estudiante1.setApellido("Diaz");
		estudiante1.setNombre("Willan");
		estudiante1.setCedula("1725841538");
		estudiante1.setCiudad("Quito");
		estudiante1.setGenero("M");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Cordova");
		estudiante2.setNombre("Alexander");
		estudiante2.setCedula("1725841539");
		estudiante2.setCiudad("Ambato");
		estudiante2.setGenero("M");

		Estudiante estudiante3 = new Estudiante();
		estudiante3.setApellido("Torres");
		estudiante3.setNombre("Marco");
		estudiante3.setCedula("1725841530");
		estudiante3.setCiudad("Guayaquil");
		estudiante3.setGenero("M");

		Estudiante estudiante4 = new Estudiante();
		estudiante4.setApellido("Guaman");
		estudiante4.setNombre("Ericka");
		estudiante4.setCedula("1725841531");
		estudiante4.setCiudad("Tulcan");
		estudiante4.setGenero("F");

		/*
		 * this.estudianteService.insertar(estudiante1);
		 * this.estudianteService.insertar(estudiante2);
		 * this.estudianteService.insertar(estudiante3);
		 * this.estudianteService.insertar(estudiante4);
		 */

		System.out.println(this.estudianteService.buscarPorApellido("Torres"));
		System.out.println(this.estudianteService.buscarPorGenero("F"));
		System.out.println(this.estudianteService.buscarPorCedula("1725841539"));
		System.out.println(this.estudianteService.buscarPorCiudad("Quito"));

	}

}
