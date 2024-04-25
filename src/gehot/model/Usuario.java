
package gehot.model;

import java.util.Date;


public class Usuario extends Pessoa {
    private String login;
    private String senha;
    private String nomeSocial;

    public Usuario(String login, String senha, String nomeSocial, int id, String nome, String fone, String email, String cpfCnpj, Date dataCadastro) {
        super(id, nome, fone, email, cpfCnpj, dataCadastro);
        this.login = login;
        this.senha = senha;
        this.nomeSocial = nomeSocial;
    }
      
}
