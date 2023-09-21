package com.br.giuliagalzerano.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_Cliente")
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long idcCliente;

	@Column(name = "Nome do Cliente")
	private String Ncliente;

	@Column(name = "Telefone")
	private String fone;

	public Long getId() {
		return idcCliente;
	}

	public void setId(Long idcCliente) {
		this.idcCliente = idcCliente;
	}

	public String getNcliente() {
		return Ncliente;
	}

	public void setNcliente(String Ncliente) {
		this.Ncliente = Ncliente;
	}

	public String getFone() {
		return fone;
	}

	public void setFone(String fone) {
		this.fone = fone;
	}
}