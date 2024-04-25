
package gehot.model;

import java.util.Date;


public class Enfermeiro extends Pessoa {
    private String cre;
    private String login;
    private String senha;
    private String nomeSocial;

    public Enfermeiro(String cre, String login, String senha, String nomeSocial, int id, String nome, String fone, String email, String cpfCnpj, Date dataCadastro) {
        super(id, nome, fone, email, cpfCnpj, dataCadastro);
        this.cre = cre;
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
    }

    public String getCre() {
        return cre;
    }

    public void setCre(String cre) {
        this.cre = cre;
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
