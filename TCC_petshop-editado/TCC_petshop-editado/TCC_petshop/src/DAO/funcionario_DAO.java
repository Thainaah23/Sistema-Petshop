package dao;

import factory.ConnectionFactory;
import model.funcionario;
import java.sql.*;
import java.sql.PreparedStatement;

public class funcionario_DAO {
    private Connection connection;
    Long id_func;
    String nome_func;
    String telefone;
    String email;
    String cargo;
    String data_admissao;
    String situacao;


    public funcionario_DAO(){
       this.connection = new ConnectionFactory().getConnection();
    }


    public void adiciona(funcionario funcionario){

        String sql = "INSERT INTO funcionario(nome_func,telefone_func,"
                + "email_func,cargo_func,"
                + "data_admissao, situacao,"
                + "cpf_func) "
                + "VALUES(?,?,?,?,?,?,?)";
        try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setString(1, funcionario.getNome_func());
           stmt.setString(2, funcionario.getTelefone());
           stmt.setString(3, funcionario.getEmail());
           stmt.setString(4, funcionario.getCargo());
           stmt.setString(5, funcionario.getData_admissao());
           stmt.setString(6, funcionario.getSituacao());
           stmt.setString(7, funcionario.getCpf());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
}
