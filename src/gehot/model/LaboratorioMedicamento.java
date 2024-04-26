
package br.model;


public class LaboratorioMedicamento {
    private Integer id;
    private String codigoBarras;
    private String observacao;
    private String status;
    
    public LaboratorioMedicamento(){
        
    }

    public LaboratorioMedicamento(Integer id, String codigoBarras, String observacao, String status) {
        this.id = id;
        this.codigoBarras = codigoBarras;
        this.observacao = observacao;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigoBarras() {
        return codigoBarras;
    }

    public void setCodigoBarras(String codigoBarras) {
        this.codigoBarras = codigoBarras;
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
