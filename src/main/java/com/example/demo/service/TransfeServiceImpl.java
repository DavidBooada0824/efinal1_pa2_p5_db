package com.example.demo.service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.repo.modelo.CtaBanca;
import com.example.demo.repo.modelo.Transferencia;

@Service
public class TransfeServiceImpl implements ITransfeService {
	
	@Autowired
	private ICtaBancaService iCtaBancaService;
	


	@Override
	public void realizar(LocalDate fecha, String ctaOrigen, String ctaDestino, BigDecimal monto, BigDecimal comision) {
		CtaBanca ctaOri = this.iCtaBancaService.
		
		
		Transferencia tran = new Transferencia();
		
		tran.setFecha(fecha);
		
		
		
		
		
		
		
		
	}

	@Override
	public Transferencia buscar(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Transferencia> buscarTodos(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	

}
