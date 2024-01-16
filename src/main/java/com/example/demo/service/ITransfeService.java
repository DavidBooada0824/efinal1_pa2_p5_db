package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import com.example.demo.repo.modelo.Transferencia;

public interface ITransfeService {
	public void realizar(LocalDate fecha, String ctaOrigen, String ctaDestino, BigDecimal monto, BigDecimal comision);

	public Transferencia buscar(Integer id);
	
	public List<Transferencia> buscarTodos(Integer id);

}
