/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.Date;

public class venda {

    public long getCodigo_venda() {
        return codigo_venda;
    }

    public void setCodigo_venda(long codigo_venda) {
        this.codigo_venda = codigo_venda;
    }

    public int getProduto_fk() {
        return produto_fk;
    }

    public void setProduto_fk(int produto_fk) {
        this.produto_fk = produto_fk;
    }

    public int getQuant_prod() {
        return quant_prod;
    }

    public void setQuant_prod(int quant_prod) {
        this.quant_prod = quant_prod;
    }

    public int getCliente_fk() {
        return cliente_fk;
    }

    public void setCliente_fk(int cliente_fk) {
        this.cliente_fk = cliente_fk;
    }

    public double getUnit() {
        return unit;
    }

    public void setUnit(double unit) {
        this.unit = unit;
    }

    public double getTotal_prod() {
        return total_prod;
    }

    public void setTotal_prod(double total_prod) {
        this.total_prod = total_prod;
    }

    public double getTotal_venda() {
        return total_venda;
    }

    public void setTotal_venda(double total_venda) {
        this.total_venda = total_venda;
    }

    public String getPagamento() {
        return pagamento;
    }

    public void setPagamento(String pagamento) {
        this.pagamento = pagamento;
    }

    public double getRecebido() {
        return recebido;
    }

    public void setRecebido(double recebido) {
        this.recebido = recebido;
    }

    public double getTroco() {
        return troco;
    }

    public void setTroco(double troco) {
        this.troco = troco;
    }

    public String getData_venda() {
        return data_venda;
    }

    public void setData_venda(String data_venda) {
        this.data_venda = data_venda;
    }
    
    public String getNome_cliente_fk() {
        return nome_cliente_fk;
    }

    public void setNome_cliente_fk(String nome_cliente_fk) {
        this.nome_cliente_fk = nome_cliente_fk;
    }
    
    long codigo_venda;
    int produto_fk;
    int quant_prod;
    int cliente_fk;
    double unit;
    double total_prod;
    double total_venda;
    String pagamento;
    double recebido;
    double troco;
    String data_venda;
    String nome_cliente_fk;
    
    
}
