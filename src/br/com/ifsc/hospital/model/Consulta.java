package br.com.ifsc.hospital.model;

import java.time.LocalDateTime;

public class Consulta {

	private Integer id;
	private String responsavel;
	private LocalDateTime dataHoraConsulta;
	private String anamnese;
	private String diagnostico;
	private String prescricao;
	private String observacao;
	private String status;
	
	public Consulta() {

	}

	public Consulta(Integer id, String responsavel, LocalDateTime dataHoraConsulta, String anamnese, String diagnostico,
			String prescricao, String observacao, String status) {
		super();
		this.id = id;
		this.responsavel = responsavel;
		this.dataHoraConsulta = dataHoraConsulta;
		this.anamnese = anamnese;
		this.diagnostico = diagnostico;
		this.prescricao = prescricao;
		this.observacao = observacao;
		this.status = status;
	}
	
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getResponsavel() {
		return responsavel;
	}

	public void setResponsavel(String responsavel) {
		this.responsavel = responsavel;
	}

	public LocalDateTime getDataHoraConsulta() {
		return dataHoraConsulta;
	}

	public void setDataHoraConsulta(LocalDateTime dataHoraConsulta) {
		this.dataHoraConsulta = dataHoraConsulta;
	}

	public String getAnamnese() {
		return anamnese;
	}

	public void setAnamnese(String anamnese) {
		this.anamnese = anamnese;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public String getPrescricao() {
		return prescricao;
	}

	public void setPrescricao(String prescricao) {
		this.prescricao = prescricao;
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
