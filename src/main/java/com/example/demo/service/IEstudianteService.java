package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {

	public void insertar(Estudiante estudiante);

	public Estudiante buscarPorNombre(String nombre);

	public Estudiante buscarPorApellido(String apellido);

	public Estudiante buscarPorGenero(String genero);

	public Estudiante buscarPorCedula(String cedula);

	public Estudiante buscarPorCiudad(String ciudad);

}
