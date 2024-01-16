package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name ="transfer")
public class Transferencia {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "seq_transf")
	@SequenceGenerator(name = "seq_transf",sequenceName = "seq_transf",allocationSize = 1)
	@Column(name = "transf_id")
	private Integer id;
	
	@Column(name = "transf_fecha")
	private LocalDate fecha;
	
	@Column(name = "transf_monto")
	private BigDecimal monto;
	
	@Column(name = "transf_comision")
	private BigDecimal comision;
	
	@ManyToOne
	@JoinColumn(name="trasfer_id_ctaBanca")
	private CtaBanca ctaBanca;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDate getFecha() {
		return fecha;
	}

	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}

	public BigDecimal getMonto() {
		return monto;
	}

	public void setMonto(BigDecimal monto) {
		this.monto = monto;
	}

	public BigDecimal getComision() {
		return comision;
	}

	public void setComision(BigDecimal comision) {
		this.comision = comision;
	}

	public CtaBanca getCtaBanca() {
		return ctaBanca;
	}

	public void setCtaBanca(CtaBanca ctaBanca) {
		this.ctaBanca = ctaBanca;
	}

	@Override
	public String toString() {
		return "Transferencia [id=" + id + ", fecha=" + fecha + ", monto=" + monto + ", comision=" + comision + "]";
	} 
	
	
	
	
	
	
	
	
	
	

}
