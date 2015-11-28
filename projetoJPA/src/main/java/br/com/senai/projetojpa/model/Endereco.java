/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.projetojpa.model;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author eduardo.soprana
 */
@Embeddable
public class Endereco implements Serializable {

    @Column(name = "ENDERECO", length = 255)
    private String endereco;
    @Column(name = "CIDADE", length = 100)
    private String cidade;
    @Column(name = "NUMERO", length = 100)
    private Integer numero;
    @Column(name = "UF", length = 2)
    private String uf;
    @Column(name = "CEP", length = 20)
    private String cep;
    @Column(name = "TELEFONE", length = 20)
    private String telefone;
    @Column(name = "EMAIL", length = 100)
    private String email;

    public Endereco() {
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public Integer getNumero() {
        return numero;
    }

    public void setNumero(Integer numero) {
        this.numero = numero;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
