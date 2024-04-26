
package gehot.model;

import java.util.Date;

public class Paciente extends Pessoa {
    private String tipoSanguineo;
    private String sexo;
    private String nomeSocial;
    
    //contrutor

    public Paciente(String tipoSanguineo, String sexo, String nomeSocial, int id, String nome, String fone, String fone1, String email, String cpfCnpj, String rgInscricaoEstadual, Date dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento) {
        super(id, nome, fone, fone1, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento);
        this.tipoSanguineo = tipoSanguineo;
        this.sexo = sexo;
        this.nomeSocial = nomeSocial;
    }
    //metodos getters e setters 
    
    public String getTipoSanguineo() {
        return tipoSanguineo;
    }

    public void setTipoSanguineo(String tipoSanguineo) {
        this.tipoSanguineo = tipoSanguineo;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }
    
}
