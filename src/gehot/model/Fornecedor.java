
package br.model;

import java.util.Date;


public class Fornecedor extends Pessoa {
    private String nomeFantasia;
    private String contato;

    public Fornecedor(String nomeFantasia, String contato, int id, String nome, String fone, String fone1, String email, String cpfCnpj, String rgInscricaoEstadual, Date dataCadastro, String cep, String cidade, String bairro, String logradouro, String complemento) {
        super(id, nome, fone, fone1, email, cpfCnpj, rgInscricaoEstadual, dataCadastro, cep, cidade, bairro, logradouro, complemento);
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
