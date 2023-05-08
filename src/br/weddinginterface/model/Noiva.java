
package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Noiva extends Conjuge {
 private double vestido, sapato, buque, diaDaNoiva, transporteNoiva;

    public double getVestido() {
        return vestido;
    }

    public void setVestido(double vestido) {
        this.vestido = vestido;
    }

    public double getSapato() {
        return sapato;
    }

    public void setSapato(double sapato) {
        this.sapato = sapato;
    }

    public double getBuque() {
        return buque;
    }

    public void setBuque(double buque) {
        this.buque = buque;
    }

    public double getDiaDaNoiva() {
        return diaDaNoiva;
    }

    public void setDiaDaNoiva(double diaDaNoiva) {
        this.diaDaNoiva = diaDaNoiva;
    }

    public double getTransporteNoiva() {
        return transporteNoiva;
    }

    public void setTransporteNoiva(double transporteNoiva) {
        this.transporteNoiva = transporteNoiva;
    }
    
    public void insereNoiva(Noiva noiva){
        
    Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_noiva"
                    + "(n_Vestido, n_Sapato, n_Buque, n_DiadaNoiva, n_TransporteNoiva)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setDouble(1, noiva.getVestido());
            st.setDouble(2, noiva.getSapato());
            st.setDouble(3, noiva.getBuque());
            st.setDouble(4, noiva.getDiaDaNoiva());
            st.setDouble(5, noiva.getTransporteNoiva());
            
            

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    double vestido = rs.getDouble(1);
                    noiva.setVestido(vestido);
                }
                rs.close();
            } else {
                throw new SQLException("Erro inesperado! Nenhuma linha afetada!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexao.fechaConexao();
        }

    }
}
 

