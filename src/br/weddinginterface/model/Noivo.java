package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Noivo {

    private double terno, sapato, acessorios, diaDoNoivo, transporteNoivo;

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

    public double getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(double acessorios) {
        this.acessorios = acessorios;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 29 * hash + (int) (Double.doubleToLongBits(this.terno) ^ (Double.doubleToLongBits(this.terno) >>> 32));
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Noivo other = (Noivo) obj;
        return Double.doubleToLongBits(this.terno) == Double.doubleToLongBits(other.terno);
    }

    @Override
    public String toString() {
        return "Noivo{" + "terno=" + terno + ", sapato=" + sapato + ", acessorios=" + acessorios
                + ", diaDoNoivo=" + diaDoNoivo + ", transporteNoivo=" + transporteNoivo + '}';
    }

    public void insereNoivo(Noivo noivo) {

        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_noivo "
                    + "(no_terno, no_sapato, no_acessorios, no_diadonoivo, no_transporte)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setDouble(1, noivo.getTerno());
            st.setDouble(2, noivo.getSapato());
            st.setDouble(3, noivo.getAcessorios());
            st.setDouble(4, noivo.getDiaDoNoivo());
            st.setDouble(5, noivo.getTransporteNoivo());

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
