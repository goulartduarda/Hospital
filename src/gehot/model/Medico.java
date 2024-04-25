
package gehot.model;

import java.util.Date;


public class Medico extends Pessoa {
    private String crm;
    private String login;
    private String senha;
    private String nomeSocial;

    public Medico(String crm, String login, String senha, String nomeSocial, int id, String nome, String fone, String email, String cpfCnpj, Date dataCadastro) {
        super(id, nome, fone, email, cpfCnpj, dataCadastro);
        this.crm = crm;
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getNomeSocial() {
        return nomeSocial;
    }

    public void setNomeSocial(String nomeSocial) {
        this.nomeSocial = nomeSocial;
    }
    
}
