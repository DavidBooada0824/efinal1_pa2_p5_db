package com.example.demo.repo;

import com.example.demo.repo.modelo.CtaBanca;

public interface ICtaBancaRepo {

	public void crear(CtaBanca ctaBanca);

	public CtaBanca selecionar(String num);

	public void eliminar(Integer id);

	public void actualizar(CtaBanca ctaBanca);

}
