package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Estudiante;
import com.example.demo.service.IEstudianteService;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;

@SpringBootApplication
public class ProyectoPaU3WdApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@PersistenceContext
	private EntityManager entityManager;

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
		estudiante1.setGenero("F");

		Estudiante estudiante2 = new Estudiante();
		estudiante2.setApellido("Cordova");
		estudiante2.setNombre("Alexander");
		estudiante2.setCedula("1725841539");
		estudiante2.setCiudad("Quito");
		estudiante2.setGenero("M");

		// this.estudianteService.buscarPorApellido("Cordova");
		System.out.println(this.estudianteService.buscarPorNombre("Willan"));

	}

}
