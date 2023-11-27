package DAO;
import factory.ConnectionFactory;
import model.venda;
import java.sql.*;
import java.sql.PreparedStatement;

/**
 *
 * @author Casa
 */
public class vendas_DAO {
    
    private Connection connection;
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

    
    public vendas_DAO(){
        this.connection = new ConnectionFactory().getConnection();
    }
    
     public void adiciona(venda venda){

      String sql = "INSERT INTO venda (produto_fk, quant_prod, cliente_fk, unit, total_prod, total_venda, pagamento, recebido, troco, data_venda, nome_cliente_fk) "
            + "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?,?)";
      
        
  try {

           PreparedStatement stmt = connection.prepareStatement(sql);
           stmt.setInt(1, venda.getProduto_fk());
           stmt.setInt(2, venda.getQuant_prod());
           stmt.setInt(3, venda.getCliente_fk());
           stmt.setDouble(4, venda.getUnit());
           stmt.setDouble(5, venda.getTotal_prod());
           stmt.setDouble(6, venda.getTotal_venda());
           stmt.setString(7, venda.getPagamento());
           stmt.setDouble(8, venda.getRecebido());
           stmt.setDouble(9, venda.getTroco());
           stmt.setString(10, venda.getData_venda());
           stmt.setString(11, venda.getNome_cliente_fk());
           stmt.execute();
           stmt.close();

        } catch (SQLException u) {
            throw new RuntimeException(u);
        }
    }
    
}