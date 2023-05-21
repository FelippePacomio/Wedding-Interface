package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Orcamento {

    public static Orcamento instancia;
    
    private double gastoPrevisto, gastoNoiva, gastoNoivo, gastoEvento, gastoTotal;

    public double getGastoPrevisto() {
        return gastoPrevisto;
    }

    public void setGastoPrevisto(double gastoPrevisto) {
        this.gastoPrevisto = gastoPrevisto;
    }

    public double getGastoNoiva() {
        return gastoNoiva;
    }

    public void setGastoNoiva(double gastoNoiva) {
        this.gastoNoiva = gastoNoiva;
    }

    public double getGastoNoivo() {
        return gastoNoivo;
    }

    public void setGastoNoivo(double gastoNoivo) {
        this.gastoNoivo = gastoNoivo;
    }

    public double getGastoEvento() {
        return gastoEvento;
    }

    public void setGastoEvento(double gastoEvento) {
        this.gastoEvento = gastoEvento;
    }

    public double getGastoTotal() {
        return gastoTotal;
    }

    public void setGastoTotal(double gastoTotal) {
        this.gastoTotal = gastoTotal;
    }

    @Override
    public String toString() {
        return "Orçamento{" + "gastoPrevisto=" + gastoPrevisto + ", gastoNoiva=" + gastoNoiva + ", gastoNoivo="
                + gastoNoivo + ", gastoEvento=" + gastoEvento + ", gastoTotal=" + gastoTotal + '}';
    }

    public void insereOrcamento(Orcamento orcamento) {

        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_orcamento "
                    + "(o_gastoprevisto, o_gastonoiva, o_gastonoivo, o_gastoevento, o_gastototal)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setDouble(1, Orcamento.instancia.getGastoPrevisto());
            st.setDouble(2, Orcamento.instancia.getGastoNoiva());
            st.setDouble(3, Orcamento.instancia.getGastoNoivo());
            st.setDouble(4, Orcamento.instancia.getGastoEvento());
            st.setDouble(5, Orcamento.instancia.getGastoTotal());

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    double gastoPrevisto = rs.getDouble(1);
                    orcamento.setGastoPrevisto(gastoPrevisto);
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
