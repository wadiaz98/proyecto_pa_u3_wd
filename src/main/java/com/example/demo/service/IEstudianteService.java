package com.example.demo.service;

import com.example.demo.modelo.Estudiante;

public interface IEstudianteService {

	public Estudiante buscarPorNombre(String nombre);

	public Estudiante buscarPorApellido(String apellido);

}
