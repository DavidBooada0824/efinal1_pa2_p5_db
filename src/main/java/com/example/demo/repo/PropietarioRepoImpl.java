package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Propietario;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class PropietarioRepoImpl implements IPropietarioRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Propietario propietario) {
		this.entityManager.persist(propietario);

	}

	@Override
	public Propietario selecionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Propietario.class, id);
	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.selecionar(id));

	}

	@Override
	public void actualizar(Propietario propietario) {
		this.entityManager.merge(propietario);

	}

}
