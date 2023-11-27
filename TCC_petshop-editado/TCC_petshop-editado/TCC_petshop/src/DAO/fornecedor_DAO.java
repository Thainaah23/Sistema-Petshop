/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import factory.ConnectionFactory;
import model.fornecedor;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Casa
 */
public class fornecedor_DAO {
    private Connection connection;    
    Long id_fornecedor;
    String razao_empresarial;
    String telefone_fornecedor;
    String cnpj;
    String tipo_produto;
    String nome_fantasia;
    String email;
    String situacao;
    
    
 public fornecedor_DAO(){
       this.connection = new ConnectionFactory().getConnection();
    }
 
  public void adiciona(fornecedor fornecedor){

        String sql = "INSERT INTO fornecedor(razao_empresarial, "
                + "telefone_fornecedor, cnpj, "
                + "tipo_produto,nome_fantasia,email,situacao) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, fornecedor.getRazao_empresarial());
           stmt.setString(2, fornecedor.getTelefone_fornecedor());
           stmt.setString(3, fornecedor.getCnpj());
           stmt.setString(4, fornecedor.getTipo_produto());
           stmt.setString(5, fornecedor.getNome_fantasia());
           stmt.setString(6,fornecedor.getEmail());
           stmt.setString(7,fornecedor.getSituacao());

           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
}


