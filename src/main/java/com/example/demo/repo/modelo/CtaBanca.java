package com.example.demo.repo.modelo;

import java.math.BigDecimal;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;

@Entity
@Table(name = "ctaBanca")
public class CtaBanca {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "seq_ctaBan")
	@SequenceGenerator(name = "seq_ctaBan", sequenceName = "seq_ctaBan", allocationSize = 1)
	@Column(name = "ctaBan_id")
	private Integer Id;

	@Column(name = "ctaBan_numero")
	private String numero;

	@Column(name = "ctaBan_tipo")
	private String tipo;

	@Column(name = "ctaBan_saldo")
	private BigDecimal saldo;

	@OneToOne
	@JoinColumn(name = "ctaBanca_id_propietario")
	private Propietario propietario;

	@OneToMany(mappedBy = "ctaBanca")
	private List<Transferencia> transferencias;

	public Integer getId() {
		return Id;
	}

	public void setId(Integer id) {
		Id = id;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public BigDecimal getSaldo() {
		return saldo;
	}

	public void setSaldo(BigDecimal saldo) {
		this.saldo = saldo;
	}

	public Propietario getPropietario() {
		return propietario;
	}

	public void setPropietario(Propietario propietario) {
		this.propietario = propietario;
	}

	public List<Transferencia> getTransferencias() {
		return transferencias;
	}

	public void setTransferencias(List<Transferencia> transferencias) {
		this.transferencias = transferencias;
	}

	@Override
	public String toString() {
		return "CtaBanca [Id=" + Id + ", numero=" + numero + ", tipo=" + tipo + ", saldo=" + saldo + "]";
	}

}
