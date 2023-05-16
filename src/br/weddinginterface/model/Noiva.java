package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Noiva {

    private double vestido, sapato, buque, diaDaNoiva, transporteNoiva, acessorios, gastoNoivaTotal;

    public double getVestido() {
        return vestido;
    }

    public void setVestido(double vestido) {
        this.vestido = vestido;
    }

    public double getGastoNoivaTotal() {
        return gastoNoivaTotal;
    }

    public void setGastoNoivaTotal(double gastoNoivaTotal) {
        this.gastoNoivaTotal = gastoNoivaTotal;
    }

    public double getSapato() {
        return sapato;
    }

    public double getAcessorios() {
        return acessorios;
    }

    public void setAcessorios(double acessorios) {
        this.acessorios = acessorios;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 67 * hash + (int) (Double.doubleToLongBits(this.vestido) ^ (Double.doubleToLongBits(this.vestido) >>> 32));
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
        final Noiva other = (Noiva) obj;
        return Double.doubleToLongBits(this.vestido) == Double.doubleToLongBits(other.vestido);
    }

    @Override
    public String toString() {
        return "Noiva{" + "vestido=" + vestido + ", sapato=" + sapato + ", buque=" + buque + ", acessorios" + acessorios
                + ", diaDaNoiva=" + diaDaNoiva + ", transporteNoiva=" + transporteNoiva + '}';
    }

    public void insereNoiva(Noiva noiva) {

        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_noiva"
                    + "(n_vestido, n_sapato, n_buque, n_acessorios, n_diadanoiva, n_transporte)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setDouble(1, noiva.getVestido());
            st.setDouble(2, noiva.getSapato());
            st.setDouble(3, noiva.getBuque());
            st.setDouble(4, noiva.getAcessorios());
            st.setDouble(5, noiva.getDiaDaNoiva());
            st.setDouble(6, noiva.getTransporteNoiva());

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
