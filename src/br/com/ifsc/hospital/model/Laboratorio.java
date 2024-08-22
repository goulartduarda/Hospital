
package br.com.ifsc.hospital.model;


public class Laboratorio {
    private String nomeFantasia;
    private String contato;
    private String status;
    private int id;
    
    public Laboratorio(){
        
    }
    

    public Laboratorio(String nomeFantasia, String contato, String status) {
        this.nomeFantasia = nomeFantasia;
        this.contato = contato;
        this.status = status;
        this.id = id;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
        
}
