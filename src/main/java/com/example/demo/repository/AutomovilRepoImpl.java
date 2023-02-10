package com.example.demo.repository;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Automovil;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class AutomovilRepoImpl implements IAutomovilRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Automovil buscarPorPlacaTypedQuery(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.entityManager
				.createQuery("select e from Automovil e where e.placa = :datoPlaca", Automovil.class);
		myTypedQuery.setParameter("datoPlaca", placa);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarporMarcaTypedQuery(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.entityManager
				.createQuery("select e from Automovil e where e.marca = :datoMarca", Automovil.class);
		myTypedQuery.setParameter("datoMarca", marca);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorTypedQuery(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> myTypedQuery = this.entityManager
				.createQuery("select e from Automovil e where e.color = :datoColor", Automovil.class);
		myTypedQuery.setParameter("datoColor", color);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlaca");
		myQuery.setParameter("datoPlaca", placa);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarporMarcaNamedQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarca");
		myQuery.setParameter("datoMarca", marca);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorNamedQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Automovil.buscarPorColor");
		myQuery.setParameter("datoColor", color);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNativeQuery(String placa) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where auto_placa = :datoPlaca",
				Automovil.class);
		myQuery.setParameter("datoPlaca", placa);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarporMarcaNativeQuery(String marca) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where auto_marca = :datoMarca",
				Automovil.class);
		myQuery.setParameter("datoMarca", marca);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorNativeQuery(String color) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from automovil where auto_color = :datoColor",
				Automovil.class);
		myQuery.setParameter("datoColor", color);
		return (Automovil) myQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorPlacaNamedNativeQuery(String placa) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> typedQuery = this.entityManager.createNamedQuery("Automovil.buscarPorPlacaNative",
				Automovil.class);
		typedQuery.setParameter("datoPlaca", placa);
		return typedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarporMarcaNamedNativeQuery(String marca) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> typedQuery = this.entityManager.createNamedQuery("Automovil.buscarPorMarcaNative",
				Automovil.class);
		typedQuery.setParameter("datoMarca", marca);
		return typedQuery.getSingleResult();
	}

	@Override
	public Automovil buscarPorColorNamedNativeQuery(String color) {
		// TODO Auto-generated method stub
		TypedQuery<Automovil> typedQuery = this.entityManager.createNamedQuery("Automovil.buscarPorColorNative",
				Automovil.class);
		typedQuery.setParameter("datoColor", color);
		return typedQuery.getSingleResult();
	}

	@Override
	public void insertar(Automovil automovil) {
		// TODO Auto-generated method stub
		this.entityManager.persist(automovil);
	}

}
