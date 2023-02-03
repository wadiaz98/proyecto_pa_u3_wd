package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Renta;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class RentaRepoImpl implements IRentaRepo {
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void insertar(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.persist(renta);
	}

	@Override
	public void actualizar(Renta renta) {
		// TODO Auto-generated method stub
		this.entityManager.merge(renta);
	}

	@Override
	public Renta buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Renta.class, id);
	}

	@Override
	public void borrar(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.buscar(id));
	}

}
