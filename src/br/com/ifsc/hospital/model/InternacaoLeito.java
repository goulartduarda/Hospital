package br.com.ifsc.hospital.model;

import java.time.LocalDateTime;

public class InternacaoLeito {

	private Integer id;
	private LocalDateTime dataHoraAlocacao;
	private LocalDateTime dataHoraDesocupacao;
	private String status;
	
	public InternacaoLeito(Integer id, LocalDateTime dataHoraAlocacao, LocalDateTime dataHoraDesocupacao,
			String status) {
		super();
		this.id = id;
		this.dataHoraAlocacao = dataHoraAlocacao;
		this.dataHoraDesocupacao = dataHoraDesocupacao;
		this.status = status;
	}
	
	public InternacaoLeito() {
		super();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public LocalDateTime getDataHoraAlocacao() {
		return dataHoraAlocacao;
	}

	public void setDataHoraAlocacao(LocalDateTime dataHoraAlocacao) {
		this.dataHoraAlocacao = dataHoraAlocacao;
	}

	public LocalDateTime getDataHoraDesocupacao() {
		return dataHoraDesocupacao;
	}

	public void setDataHoraDesocupacao(LocalDateTime dataHoraDesocupacao) {
		this.dataHoraDesocupacao = dataHoraDesocupacao;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
}
