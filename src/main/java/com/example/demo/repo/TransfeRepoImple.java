package com.example.demo.repo;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.example.demo.repo.modelo.Transferencia;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class TransfeRepoImple implements ITansfRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void crear(Transferencia transferencia) {
		this.entityManager.persist(transferencia);

	}

	@Override
	public Transferencia selecionar(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Transferencia.class, id);
	}

	@Override
	public List<Transferencia> selecionarTodos(Integer id) {

		Transferencia tran = new Transferencia();
	
		return null;
	}

}
