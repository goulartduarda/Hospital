package br.com.ifsc.hospital.model;

import java.time.LocalDateTime;

public class MovimentoMedicamento {

	private Integer id;
	private LocalDateTime dataHoraMovimento;
	private String tipoMovimento;
	private float qtdMedicamento;
	private String observacao;
	private String status;
	
	public MovimentoMedicamento() {
	}

	public MovimentoMedicamento(Integer id, LocalDateTime dataHoraMovimento, String tipoMovimento, float qtdMedicamento,
			String observacao, String status) {
		super();
		this.id = id;
		this.dataHoraMovimento = dataHoraMovimento;
		this.tipoMovimento = tipoMovimento;
		this.qtdMedicamento = qtdMedicamento;
		this.observacao = observacao;
		this.status = status;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataHoraMovimento() {
		return dataHoraMovimento;
	}

	public void setDataHoraMovimento(LocalDateTime dataHoraMovimento) {
		this.dataHoraMovimento = dataHoraMovimento;
	}

	public String getTipoMovimento() {
		return tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	public float getQtdMedicamento() {
		return qtdMedicamento;
	}

	public void setQtdMedicamento(float qtdMedicamento) {
		this.qtdMedicamento = qtdMedicamento;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
