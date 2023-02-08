package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;
import com.example.demo.repository.IEstudianteRepo;

@Service
public class EstudianteServiceImpl implements IEstudianteService {

	@Autowired
	private IEstudianteRepo estudianteRepo;

	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombre(nombre);
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellido(apellido);
	}

	@Override
	public Estudiante buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorGenero(genero);
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCedula(cedula);
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorCiudad(ciudad);
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.estudianteRepo.insertar(estudiante);
	}

	@Override
	public Estudiante buscarPorNombreTypeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreTypeQuery(nombre);
	}

	@Override
	public Estudiante buscarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoNamedQuery(apellido);
	}

	@Override
	public Estudiante buscarPorApellidoNamedQueryTyped(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoNamedQueryTyped(apellido);
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQuery(nombre);
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQueryTypedNamed(nombre);
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryList(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreQueryList(genero);
	}

	@Override
	public List<Estudiante> buscarPorApellidoNamedQueryTypedList(String apellido) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorApellidoNamedQueryTypedList(apellido);
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreNativeQueryTypedNamedList(nombre);
	}

	@Override
	public Estudiante buscarPorNombreFirst(String genero) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreFirst(genero);
	}

	@Override
	public EstudianteDTO buscarPorNombreTypeQueryDTO(String nombre) {
		// TODO Auto-generated method stub
		return this.estudianteRepo.buscarPorNombreTypeQueryDTO(nombre);
	}

}
