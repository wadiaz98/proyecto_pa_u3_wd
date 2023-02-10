package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.modelo.Automovil;
import com.example.demo.service.IAutomovilService;
import com.example.demo.service.IEstudianteService;

@SpringBootApplication
public class ProyectoPaU3WdApplication implements CommandLineRunner {

	@Autowired
	private IEstudianteService estudianteService;

	@Autowired
	private IAutomovilService automovilService;

	public static void main(String[] args) {
		SpringApplication.run(ProyectoPaU3WdApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Automovil automovil1 = new Automovil();
		Automovil automovil2 = new Automovil();
		Automovil automovil3 = new Automovil();

		automovil1.setPlaca("ABC123");
		automovil1.setColor("Verde");
		automovil1.setMarca("Chevrolet");
		automovil1.setTipo("P");
		automovil1.setMarchas("Manual");
		automovil1.setModelo("Familiar");
		automovil1.setMotor("Diesel");

		automovil2.setPlaca("DEF456");
		automovil2.setColor("Rojo");
		automovil2.setMarca("Toyota");
		automovil2.setTipo("L");
		automovil2.setMarchas("Automatico");
		automovil2.setModelo("Familiar");
		automovil2.setMotor("Gasolina");

		automovil3.setPlaca("GHI789");
		automovil3.setColor("Blanco");
		automovil3.setMarca("Ford");
		automovil3.setTipo("P");
		automovil3.setMarchas("Manual");
		automovil3.setModelo("Familiar");
		automovil3.setMotor("Diesel");

		/*
		 * this.automovilService.insertar(automovil3);
		 * this.automovilService.insertar(automovil2);
		 * this.automovilService.insertar(automovil1);
		 */

		System.out.println("Typed Query:");
		System.out.println(this.automovilService.buscarPorPlacaTypedQuery("ABC123"));
		System.out.println(this.automovilService.buscarporMarcaTypedQuery("Toyota"));
		System.out.println(this.automovilService.buscarPorColorTypedQuery("Blanco"));
		System.out.println("Named Query:");
		System.out.println(this.automovilService.buscarPorPlacaNamedQuery("ABC123"));
		System.out.println(this.automovilService.buscarporMarcaNamedQuery("Toyota"));
		System.out.println(this.automovilService.buscarPorColorNamedQuery("Blanco"));
		System.out.println("Native Query:");
		System.out.println(this.automovilService.buscarPorPlacaNativeQuery("ABC123"));
		System.out.println(this.automovilService.buscarporMarcaNativeQuery("Toyota"));
		System.out.println(this.automovilService.buscarPorColorNativeQuery("Blanco"));
		System.out.println("Named Native Query:");
		System.out.println(this.automovilService.buscarPorPlacaNamedNativeQuery("ABC123"));
		System.out.println(this.automovilService.buscarporMarcaNamedNativeQuery("Toyota"));
		System.out.println(this.automovilService.buscarPorColorNamedNativeQuery("Blanco"));

		/*
		 * Estudiante estudiante1 = new Estudiante(); estudiante1.setApellido("Diaz");
		 * estudiante1.setNombre("Willan"); estudiante1.setCedula("1725841538");
		 * estudiante1.setCiudad("Quito"); estudiante1.setGenero("M");
		 * 
		 * Estudiante estudiante2 = new Estudiante();
		 * estudiante2.setApellido("Cordova"); estudiante2.setNombre("Alexander");
		 * estudiante2.setCedula("1725841539"); estudiante2.setCiudad("Ambato");
		 * estudiante2.setGenero("M");
		 * 
		 * Estudiante estudiante3 = new Estudiante(); estudiante3.setApellido("Torres");
		 * estudiante3.setNombre("Marco"); estudiante3.setCedula("1725841530");
		 * estudiante3.setCiudad("Guayaquil"); estudiante3.setGenero("M");
		 * 
		 * Estudiante estudiante4 = new Estudiante(); estudiante4.setApellido("Guaman");
		 * estudiante4.setNombre("Ericka"); estudiante4.setCedula("1725841531");
		 * estudiante4.setCiudad("Tulcan"); estudiante4.setGenero("F");
		 * 
		 * /* this.estudianteService.insertar(estudiante1);
		 * this.estudianteService.insertar(estudiante2);
		 * this.estudianteService.insertar(estudiante3);
		 * this.estudianteService.insertar(estudiante4);
		 */

		/*
		 * System.out.println("Busqueda por Nombre con Typed Query: ");
		 * System.out.println(this.estudianteService.buscarPorNombreTypeQuery("Willan"))
		 * ; System.out.println("Busqueda por Apellido con Named Query: ");
		 * System.out.println(this.estudianteService.buscarPorApellidoNamedQuery(
		 * "Torres"));
		 * System.out.println("Busqueda por Apellido con Named Query Typed: ");
		 * System.out.println(this.estudianteService.buscarPorApellidoNamedQueryTyped(
		 * "Guaman")); System.out.println("Busqueda por Nombre con Native Query: ");
		 * System.out.println(this.estudianteService.buscarPorNombreNativeQuery(
		 * "Alexander"));
		 * System.out.println("Busqueda por Nombre con Native Query Named Typed: ");
		 * System.out.println(this.estudianteService.
		 * buscarPorNombreNativeQueryTypedNamed("Marco"));
		 * 
		 * System.out.println("Lista de estudiantes obtenidos por query: ");
		 * this.estudianteService.buscarPorNombreQueryList("M").forEach(System.out::
		 * println); System.out.
		 * println("Lista de estudiantes obtenidos por query con el primer metodo: ");
		 * System.out.println(this.estudianteService.buscarPorNombreFirst("M"));
		 */
	}

}
