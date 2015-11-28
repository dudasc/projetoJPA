/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.projetojpa.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author eduardo.soprana
 */
@Entity
@Table(name="CLIENTE")
public class Cliente extends Pessoa{
    
    @Column(name = "CPF", length = 11)
    private String cpf;
    @Column(name = "RG", length = 10)
    private String rg;

    public Cliente() {
       
    }
    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }
    
}
