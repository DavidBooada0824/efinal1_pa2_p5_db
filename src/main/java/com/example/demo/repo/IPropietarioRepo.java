package com.example.demo.repo;

import com.example.demo.repo.modelo.Propietario;

public interface IPropietarioRepo {
	
	public void crear(Propietario propietario);
	
	public Propietario selecionar(Integer id);
	
	public void eliminar(Integer id);
	
	public void actualizar(Propietario propietario);

}
