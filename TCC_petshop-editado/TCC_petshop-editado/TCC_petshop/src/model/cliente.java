/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Casa
 */
public class cliente {
    long id_cliente;
    String nome_c;
    String cpf_c;
    String data_cadastro;
    String nome_pet;
    String Categoria;
    String peso_pet;
    String raca;
    String obs;
    String telefone;
    String situacao;


    public long getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(long id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_c() {
        return nome_c;
    }

    public void setNome_c(String nome_c) {
        this.nome_c = nome_c;
    }

    public String getCpf_c() {
        return cpf_c;
    }

    public void setCpf_c(String cpf_c) {
        this.cpf_c = cpf_c;
    }

    public String getData_cadastro() {
        return data_cadastro;
    }

    public void setData_cadastro(String data_cadastro) {
        this.data_cadastro = data_cadastro;
    }

    public String getNome_pet() {
        return nome_pet;
    }

    public void setNome_pet(String nome_pet) {
        this.nome_pet = nome_pet;
    }
    
      public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String Categoria) {
        this.Categoria = Categoria;
    }
    
    

    public String getPeso_pet() {
        return peso_pet;
    }

    public void setPeso_pet(String peso_pet) {
        this.peso_pet = peso_pet;
    }

    public String getRaca() {
        return raca;
    }

    public void setRaca(String raca) {
        this.raca = raca;
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        this.obs = obs;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    
    
}
