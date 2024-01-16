package com.example.demo.repo;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.CtaBanca;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional

public class CtaBancaRepoImpl implements ICtaBancaRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(CtaBanca ctaBanca) {
		this.entityManager.persist(ctaBanca);

	}

	@Override
	public CtaBanca selecionar(String num) {
		Query myQuery = this.entityManager.createQuery("SELECT c FROM CtaBanca c WHERE c.numero=:DatoCueta");
		myQuery.setParameter("DatoCueta", num);
		return (CtaBanca) myQuery.getSingleResult();

	}

	@Override
	public void eliminar(Integer id) {
		this.entityManager.remove(this.selecionar(id));

	}

	@Override
	public void actualizar(CtaBanca ctaBanca) {
		this.entityManager.merge(ctaBanca);
	}

}
