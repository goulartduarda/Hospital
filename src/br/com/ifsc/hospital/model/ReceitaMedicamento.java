
package gehot.model;


public class ReceitaMedicamento {
    private Integer id;
    private String prescricao;
    private String status;
    
    public ReceitaMedicamento(){
        
    }

    public ReceitaMedicamento(Integer id, String prescricao, String status) {
        this.id = id;
        this.prescricao = prescricao;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPrescricao() {
        return prescricao;
    }

    public void setPrescricao(String prescricao) {
        this.prescricao = prescricao;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }   
}
