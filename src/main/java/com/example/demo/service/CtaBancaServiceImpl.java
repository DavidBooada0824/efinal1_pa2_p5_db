package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.ICtaBancaRepo;
import com.example.demo.repo.modelo.CtaBanca;

@Service

public class CtaBancaServiceImpl implements ICtaBancaService {

	@Autowired
	private ICtaBancaRepo iCtaBancaRepo;

	@Override
	public void ingresar(CtaBanca ctaBanca) {
		this.iCtaBancaRepo.crear(ctaBanca);

	}

	@Override
	public CtaBanca buscar(String num) {
		// TODO Auto-generated method stub
		return this.iCtaBancaRepo.selecionar(num);
	}

	@Override
	public void borrar(Integer id) {
		this.iCtaBancaRepo.eliminar(id);

	}

	@Override
	public void modificar(CtaBanca ctaBanca) {
		this.iCtaBancaRepo.actualizar(ctaBanca);

	}

}
