package com.example.demo.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.modelo.Estudiante;
import com.example.demo.modelo.dto.EstudianteDTO;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.persistence.TypedQuery;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Predicate;
import jakarta.persistence.criteria.Root;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class EstudianteRepoImpl implements IEstudianteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public Estudiante buscarPorNombre(String nombre) {
		// TODO Auto-generated method stub

		// select * from estudiante where estu_nombre = 'Willan'
		// select e from Estudiante e where e.nombre = : datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.nombre = :datoNombre");
		jpqlQuery.setParameter("datoNombre", nombre);
		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.apellido = :datoApellido");
		jpqlQuery.setParameter("datoApellido", apellido);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorGenero(String genero) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.cedula = :datoCedula");
		jpqlQuery.setParameter("datoCedula", cedula);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorCiudad(String ciudad) {
		// TODO Auto-generated method stub
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.ciudad = :datoCiudad");
		jpqlQuery.setParameter("datoCiudad", ciudad);
		return (Estudiante) jpqlQuery.getSingleResult();
	}

	@Override
	public void insertar(Estudiante estudiante) {
		// TODO Auto-generated method stub
		this.entityManager.persist(estudiante);
	}

	@Override
	public Estudiante buscarPorNombreTypeQuery(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myTypedQuery = this.entityManager
				.createQuery("select e from Estudiante e where e.nombre = :datoNombre", Estudiante.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoNamedQuery(String apellido) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApe");
		myQuery.setParameter("datoApellido", apellido);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorApellidoNamedQueryTyped(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> typedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApe",
				Estudiante.class);
		typedQuery.setParameter("datoApellido", apellido);
		return typedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQuery(String nombre) {
		// TODO Auto-generated method stub
		Query myQuery = this.entityManager.createNativeQuery("select * from estudiante where estu_nombre = :datoNombre",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return (Estudiante) myQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreNativeQueryTypedNamed(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreQueryList(String genero) {
		// TODO Auto-generated method stub
		// select * from estudiante where estu_nombre = 'Willan'
		// select e from Estudiante e where e.nombre = : datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);
		// retorna un tipo de dato generico y toca castear
		return jpqlQuery.getResultList();

	}

	@Override
	public List<Estudiante> buscarPorApellidoNamedQueryTypedList(String apellido) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> typedQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorApe",
				Estudiante.class);
		typedQuery.setParameter("datoApellido", apellido);
		return typedQuery.getResultList();
	}

	@Override
	public List<Estudiante> buscarPorNombreNativeQueryTypedNamedList(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<Estudiante> myQuery = this.entityManager.createNamedQuery("Estudiante.buscarPorNombreNative",
				Estudiante.class);
		myQuery.setParameter("datoNombre", nombre);
		return myQuery.getResultList();
	}

	@Override
	public Estudiante buscarPorNombreFirst(String genero) {
		// TODO Auto-generated method stub

		// select * from estudiante where estu_nombre = 'Willan'
		// select e from Estudiante e where e.nombre = : datoNombre
		Query jpqlQuery = this.entityManager.createQuery("select e from Estudiante e where e.genero = :datoGenero");
		jpqlQuery.setParameter("datoGenero", genero);

		// retorna un tipo de dato generico y toca castear
		return (Estudiante) jpqlQuery.getResultList().get(0);
	}

	@Override
	public EstudianteDTO buscarPorNombreTypeQueryDTO(String nombre) {
		// TODO Auto-generated method stub
		TypedQuery<EstudianteDTO> myTypedQuery = this.entityManager.createQuery(
				"select NEW com.example.demo.modelo.dto.EstudianteDTO(e.cedula, e.nombre, e.apellido, e.genero) from Estudiante e where e.nombre = :datoNombre",
				EstudianteDTO.class);
		myTypedQuery.setParameter("datoNombre", nombre);
		return myTypedQuery.getSingleResult();
	}

	@Override
	public Estudiante buscarPorNombreCriteria(String nombre) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		// Especificamos el tipo de retorno de mi query
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);

		// Aqui empezamos a crear el SQL
		// Se define el FROM-Root
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class); // FROM Estudiante

		// Las condiciones WHERE se conocen en Criteria API Query como predicados
		// e.nombre = :datoNombre
		Predicate condicion1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);

		// Finalizado y declarado/armado mi query
		myCriteriaQuery.select(miTablaFrom).where(condicion1);

		// La ejecucion del query lo realizamos con cualquier tipo ya conocido:
		// TypedQuery

		TypedQuery<Estudiante> mySQL = this.entityManager.createQuery(myCriteriaQuery);

		return mySQL.getSingleResult();
	}

	@Override
	public List<Estudiante> buscarPorNombreCriteriaAndOr(String nombre, String apellido, String genero) {
		// TODO Auto-generated method stub
		CriteriaBuilder myBuilder = this.entityManager.getCriteriaBuilder();

		// Especificamos el tipo de retorno de mi query
		CriteriaQuery<Estudiante> myCriteriaQuery = myBuilder.createQuery(Estudiante.class);

		// Aqui empezamos a crear el SQL
		// Se define el FROM-Root
		Root<Estudiante> miTablaFrom = myCriteriaQuery.from(Estudiante.class); // FROM Estudiante

		// Las condiciones WHERE se conocen en Criteria API Query como predicados
		// Masculino: e.nombre = AND e.apellido =
		// Femenino: e.nombre = OR e.apellido
		// Creamos los predicados
		// Predicado nombre
		Predicate p1 = myBuilder.equal(miTablaFrom.get("nombre"), nombre);

		// Predicado apellido
		Predicate p2 = myBuilder.equal(miTablaFrom.get("apellido"), apellido);

		Predicate predicadoFinal = null;
		if (genero.equals("M")) {
			// Predicado AND
			predicadoFinal = myBuilder.and(p1, p2);
		} else {
			// Predicado OR
			predicadoFinal = myBuilder.or(p1, p2);
		}

		// Finalizado y declarado/armado mi query
		myCriteriaQuery.select(miTablaFrom).where(predicadoFinal);

		// La ejecucion del query lo realizamos con cualquier tipo ya conocido:
		// TypedQuery
		TypedQuery<Estudiante> mySQL = this.entityManager.createQuery(myCriteriaQuery);

		return mySQL.getResultList();
	}

	@Override
	public int eliminarPorApellido(String apellido) {
		// TODO Auto-generated method stub
		// delete from estudiante where estu_apellido = :datoApellido
		// DELETE FROM Estudiante e where e.apellido = :datoApellido
		Query query = this.entityManager.createQuery("DELETE FROM Estudiante e where e.apellido = :datoApellido");
		query.setParameter("datoApellido", apellido);
		return query.executeUpdate();
	}

	@Override
	public int atualizarporApellido(String apellido, String nombre) {
		// TODO Auto-generated method stub
		// UPDATE estudiante set estu_nombre = :datoNombre where estu_apellido =
		// :datoApellido
		// UPDATE Estudiante e set e.nombre = :datoNombre where e.apellido =
		// :datoApellido
		Query query = this.entityManager
				.createQuery("UPDATE Estudiante e set e.nombre = :datoNombre where e.apellido = :datoApellido");
		query.setParameter("datoNombre", nombre);
		query.setParameter("datoApellido", apellido);

		return query.executeUpdate();
	}

}
