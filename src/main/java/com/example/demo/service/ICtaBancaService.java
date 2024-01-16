package com.example.demo.service;

import com.example.demo.repo.modelo.CtaBanca;

public interface ICtaBancaService {

	public void ingresar(CtaBanca ctaBanca);

	public CtaBanca buscar(String num);

	public void borrar(Integer id);

	public void modificar(CtaBanca ctaBanca);

}
