/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senai.projetojpa.model;

import java.util.Date;
import javax.persistence.Column;

/**
 *
 * @author eduardo.soprana
 */
public class Fornecedor extends Pessoa{
    @Column(name = "cnpj", length = 30)
    private String cnpj;
    

    public Fornecedor() {
       
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }  
    
}
