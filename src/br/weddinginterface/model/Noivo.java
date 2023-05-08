
package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Noivo extends Conjuge {
    private double terno, sapato, diaDoNoivo, transporteNoivo;

    public double getTerno() {
        return terno;
    }

    public void setTerno(double terno) {
        this.terno = terno;
    }

    public double getSapato() {
        return sapato;
    }

    public void setSapato(double sapato) {
        this.sapato = sapato;
    }

    public double getDiaDoNoivo() {
        return diaDoNoivo;
    }

    public void setDiaDoNoivo(double diaDoNoivo) {
        this.diaDoNoivo = diaDoNoivo;
    }

    public double getTransporteNoivo() {
        return transporteNoivo;
    }

    public void setTransporteNoivo(double transporteNoivo) {
        this.transporteNoivo = transporteNoivo;
    }
    
    public void insereNoivo(Noivo noivo){
        
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_noivo "
                    + "(n_Terno, n_SapatoNoivo, n_DiadoNoivo, n_TransporteNoivo)"
                    + "VALUES"
                    + "(?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setDouble(1, noivo.getTerno());
            st.setDouble(2, noivo.getSapato());
            st.setDouble(3, noivo.getDiaDoNoivo());
            st.setDouble(4, noivo.getTransporteNoivo());
           

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    double terno = rs.getDouble(1);
                    noivo.setTerno(terno);
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
    


