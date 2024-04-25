
package gehot.model;

import java.util.Date;


public class Farmaceutico extends Pessoa {
    private String crf;
    private String login;
    private String senha;
    private String nomeSocial;

    public Farmaceutico(String crf, String login, String senha, String nomeSocial, int id, String nome, String fone, String email, String cpfCnpj, Date dataCadastro) {
        super(id, nome, fone, email, cpfCnpj, dataCadastro);
        this.crf = crf;
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
    }

    public String getCrf() {
        return crf;
    }

    public void setCrf(String crf) {
        this.crf = crf;
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
