package com.example.demo;

import java.math.BigDecimal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.demo.repo.modelo.CtaBanca;
import com.example.demo.repo.modelo.Propietario;
import com.example.demo.service.ICtaBancaService;
import com.example.demo.service.IPropietarioService;

@SpringBootApplication
public class Efinal1Pa2P5DbApplication implements CommandLineRunner {

	@Autowired
	private IPropietarioService iPropietarioService;

	@Autowired
	private ICtaBancaService iCtaBancaService;

	public static void main(String[] args) {
		SpringApplication.run(Efinal1Pa2P5DbApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub

		Propietario prop = new Propietario();

		prop.setApellido("Boada");
		prop.setCedula("1720030723");
		prop.setNombre("David");

		CtaBanca cta1 = new CtaBanca();

		cta1.setNumero("12345");
		cta1.setPropietario(prop);
		cta1.setSaldo(new BigDecimal(200));
		prop.setCtaBanca(cta1);
		cta1.setTipo("A");
		this.iCtaBancaService.ingresar(cta1);

	}

}
