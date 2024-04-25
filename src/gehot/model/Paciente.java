
package gehot.model;

import java.util.Date;

public class Paciente extends Pessoa {
    private String tipoSanguineo;
    private String sexo;
    private String nomeSocial;
    
    //contrutor

    public Paciente(String tipoSanguineo, String sexo, String nomeSocial, int id, String nome, String fone, String email, String cpfCnpj, Date dataCadastro) {
        super(id, nome, fone, email, cpfCnpj, dataCadastro);
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
