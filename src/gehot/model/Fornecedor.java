
package gehot.model;

import java.util.Date;


public class Fornecedor extends Pessoa {
    private String nomeFantasia;
    private String contato;

    public Fornecedor(String nomeFantasia, String contato, int id, String nome, String fone, String email, String cpfCnpj, Date dataCadastro) {
        super(id, nome, fone, email, cpfCnpj, dataCadastro);
        this.nomeFantasia = nomeFantasia;
        this.contato = contato;
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getContato() {
        return contato;
    }

    public void setContato(String contato) {
        this.contato = contato;
    }
       
}
