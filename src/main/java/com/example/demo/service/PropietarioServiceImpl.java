package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.IPropietarioRepo;
import com.example.demo.repo.modelo.Propietario;

@Service
public class PropietarioServiceImpl implements IPropietarioService {

	@Autowired
	private IPropietarioRepo iPropietarioRepo;

	@Override
	public void ingresar(Propietario propietario) {
		this.iPropietarioRepo.crear(propietario);

	}

	@Override
	public Propietario buscar(Integer id) {
		// TODO Auto-generated method stub
		return this.iPropietarioRepo.selecionar(id);
	}

	@Override
	public void borrar(Integer id) {
		this.iPropietarioRepo.eliminar(id);

	}

	@Override
	public void modificar(Propietario propietario) {
		this.iPropietarioRepo.actualizar(propietario);

	}

}
