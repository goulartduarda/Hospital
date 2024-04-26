package br.com.ifsc.hospital.model;

import java.time.LocalDateTime;

public class Prontuario {

	private Integer id;
	private LocalDateTime dataHoraVisita;
	private String descricaoVista;
	private String observacao;
	private String status;
	
	public Prontuario(Integer id, LocalDateTime dataHoraVisita, String descricaoVista, String observacao,
			String status) {
		super();
		this.id = id;
		this.dataHoraVisita = dataHoraVisita;
		this.descricaoVista = descricaoVista;
		this.observacao = observacao;
		this.status = status;
	}
	
	public Prontuario() {
		super();
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public LocalDateTime getDataHoraVisita() {
		return dataHoraVisita;
	}
	public void setDataHoraVisita(LocalDateTime dataHoraVisita) {
		this.dataHoraVisita = dataHoraVisita;
	}
	public String getDescricaoVista() {
		return descricaoVista;
	}
	public void setDescricaoVista(String descricaoVista) {
		this.descricaoVista = descricaoVista;
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
