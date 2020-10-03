package br.com.digitalhouse.oficina.dto;

import java.io.Serializable;

import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class VeiculoInsertDTO implements Serializable{
	private static final long serialVersionUID = 1L;

	@NotBlank
	private String placa;
	@NotBlank
	private String cor;
	@NotBlank
	private String modelo;
	@NotBlank
	private String marca;
	@Valid @NotNull
	private Long cliente_id;

	public VeiculoInsertDTO() {
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public Long getCliente_id() {
		return cliente_id;
	}

	public void setCliente_id(Long cliente_id) {
		this.cliente_id = cliente_id;
	}

}