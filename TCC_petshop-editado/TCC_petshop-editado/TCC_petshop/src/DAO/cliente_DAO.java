/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;
import factory.ConnectionFactory;
import model.cliente;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Casa
 */
public class cliente_DAO {
    
      private Connection connection;
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


    public cliente_DAO(){
       this.connection = new ConnectionFactory().getConnection();
    }


    public void adiciona(cliente cliente){

        String sql = "INSERT INTO cliente(nome_c,cpf_cliente,"
                + "data_cadastro,"
                + "nome_pet,Categoria, peso_kg,"
                + "raca,observacoes,"
                + "telefone_cliente, situacao)"
                + " VALUES(?,?,?,?,?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, cliente.getNome_c());
           stmt.setString(2, cliente.getCpf_c());
           stmt.setString(3, cliente.getData_cadastro());
           stmt.setString(4, cliente.getNome_pet());
           stmt.setString(5, cliente.getCategoria());
           stmt.setString(6, cliente.getPeso_pet());
           stmt.setString(7, cliente.getRaca());
           stmt.setString(8, cliente.getObs());
           stmt.setString(9, cliente.getTelefone());
           stmt.setString(10, cliente.getSituacao());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
}
