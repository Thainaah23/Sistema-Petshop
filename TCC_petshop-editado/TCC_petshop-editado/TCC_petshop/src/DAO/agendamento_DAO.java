package DAO;
import factory.ConnectionFactory;
import model.agendamento;
import java.sql.*;
import java.sql.PreparedStatement;


public class agendamento_DAO {
    
    public boolean possuiAgendamentoEmAndamento(int idCliente) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        String sql = "SELECT COUNT(*) FROM agendamento WHERE cliente_fk = ? AND situacao = 'Andamento'";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, idCliente);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }
        
        

        rs.close();
        ps.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
}
    
    
    public boolean existeAgendamentoNaDataHora(String data, String horario) {
    try {
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/sistema", "root", "");
        String sql = "SELECT COUNT(*) FROM agendamento WHERE data_agendamento = ? AND horario = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, data);
        ps.setString(2, horario);
        ResultSet rs = ps.executeQuery();

        if (rs.next()) {
            int count = rs.getInt(1);
            return count > 0;
        }

        rs.close();
        ps.close();
        conn.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }

    return false;
}
    
    

    

    private Connection connection;
    long indice;
    String opcoes_agentamento;
    long cliente_fk;
    String data_agendamento;
    String horario;
    Double preco;
    String situacao;
    
     public agendamento_DAO(){
       this.connection = new ConnectionFactory().getConnection();
    }
     
    public void adiciona(agendamento agendamento) {
    String sql = "INSERT INTO agendamento (opcoes_agendamento, cliente_fk, data_agendamento, horario, preco, situacao) VALUES (?, ?, ?, ?, ?, ?)";
    try {
        PreparedStatement stmt = connection.prepareStatement(sql);
        stmt.setString(1, agendamento.getOpcoes_agentamento());
        stmt.setLong(2, agendamento.getCliente_fk());
        stmt.setString(3, agendamento.getData_agendamento());
        stmt.setString(4, agendamento.getHorario());
        stmt.setDouble(5, agendamento.getPreco());
        stmt.setString(6, agendamento.getSituacao());

        stmt.execute();
        stmt.close();
    } catch (SQLException u) {
        throw new RuntimeException(u);
    }
    
    
    
}






 

    
}
