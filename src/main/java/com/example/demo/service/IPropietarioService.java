package com.example.demo.service;

import com.example.demo.repo.modelo.Propietario;

public interface IPropietarioService {

	public void ingresar(Propietario propietario);

	public Propietario buscar(Integer id);

	public void borrar(Integer id);

	public void modificar(Propietario propietario);
}
