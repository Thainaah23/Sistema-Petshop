/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Casa
 */
public class agendamento {

    public long getIndice() {
        return indice;
    }

    public void setIndice(long indice) {
        this.indice = indice;
    }

    public String getOpcoes_agentamento() {
        return opcoes_agentamento;
    }

    public void setOpcoes_agentamento(String opcoes_agentamento) {
        this.opcoes_agentamento = opcoes_agentamento;
    }

    public long getCliente_fk() {
        return cliente_fk;
    }

    public void setCliente_fk(long cliente_fk) {
        this.cliente_fk = cliente_fk;
    }

    public String getData_agendamento() {
        return data_agendamento;
    }

    public void setData_agendamento(String data_agendamento) {
        this.data_agendamento = data_agendamento;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public String getSituacao() {
        return situacao;
    }

    public void setSituacao(String situacao) {
        this.situacao = situacao;
    }
    long indice;
    String opcoes_agentamento;
    long cliente_fk;
    String data_agendamento;
    String horario;
    Double preco;
    String situacao;
    
}
