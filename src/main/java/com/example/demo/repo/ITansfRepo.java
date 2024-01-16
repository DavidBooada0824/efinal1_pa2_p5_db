package com.example.demo.repo;

import java.util.List;

import com.example.demo.repo.modelo.Transferencia;

public interface ITansfRepo {

	public void crear(Transferencia transferencia);

	public Transferencia selecionar(Integer id);
	
	public List<Transferencia> selecionarTodos(Integer id);

}
