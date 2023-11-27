/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import factory.ConnectionFactory;
import model.produto;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Casa
 */
public class produto_DAO {
    
    private Connection connection;
    long id_produto;
    String nome_produto;
    String data_validade;
    Date data_fabricacao;
    float preco;
    int estoque_geral;
    String cartegoria;
    String fornecedor;


    public produto_DAO(){
       this.connection = new ConnectionFactory().getConnection();
    }


    public void adiciona(produto produto){

        String sql = "INSERT INTO produto(nome_prod, "
                + "data_validade, data_fabricacao, "
                + "preco,estoque_geral, "
                + "cartegoria, fornecedor) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, produto.getNome_produto());
           stmt.setString(2, produto.getData_validade());
           stmt.setDate(3, (Date) produto.getData_fabricacao());
           stmt.setFloat(4, produto.getPreco());
           stmt.setInt(5, produto.getEstoque_geral());
           stmt.setString(6, produto.getCartegoria());
           stmt.setString(7, produto.getFornecedor());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
}
