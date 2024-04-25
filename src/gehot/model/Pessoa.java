
package gehot.model;

import java.util.Date;

public class Pessoa extends Object {
    int id;
    private String nome;
    private String fone;
    private String email;
    private String cpfCnpj;
    private Date dataCadastro;
    
    public Pessoa(){
        
    }

    public Pessoa(int id, String nome, String fone, String email, String cpfCnpj, Date dataCadastro) {
        this.id = id;
        this.nome = nome;
        this.fone = fone;
        this.email = email;
        this.cpfCnpj = cpfCnpj;
        this.dataCadastro = dataCadastro;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCpfCnpj() {
        return cpfCnpj;
    }

    public void setCpfCnpj(String cpfCnpj) {
        this.cpfCnpj = cpfCnpj;
    }

    public Date getDataCadastro() {
        return dataCadastro;
    }

    public void setDataCadastro(Date dataCadastro) {
        this.dataCadastro = dataCadastro;
    }
    
        
}
