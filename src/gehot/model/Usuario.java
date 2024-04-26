
package gehot.model;

import java.util.Date;


public class Usuario extends Pessoa {
    private String login;
    private String senha;
    private String nomeSocial;

    public Usuario(String login, String senha, String nomeSocial, int id, String nome, String fone, String fone1, String email, String cpfCnpj, String rgInscricaoEstadual, Date dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento) {
        super(id, nome, fone, fone1, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento);
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
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
