
package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Evento {

    private String nomeIgreja, cardapio, anotacoes, tema, horaBuffet, horaCerimonia;
    private Double valorBuffet, valorCerimonia, lembrancas;

    public String getNomeIgreja() {
        return nomeIgreja;
    }

    public void setNomeIgreja(String nomeIgreja) {
        this.nomeIgreja = nomeIgreja;
    }

    public String getCardapio() {
        return cardapio;
    }

    public void setCardapio(String cardapio) {
        this.cardapio = cardapio;
    }

    public String getAnotacoes() {
        return anotacoes;
    }

    public void setAnotacoes(String anotacoes) {
        this.anotacoes = anotacoes;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public String getHoraBuffet() {
        return horaBuffet;
    }

    public void setHoraBuffet(String horaBuffet) {
        this.horaBuffet = horaBuffet;
    }

    public String getHoraCerimonia() {
        return horaCerimonia;
    }

    public void setHoraCerimonia(String horaCerimonia) {
        this.horaCerimonia = horaCerimonia;
    }

    public Double getValorBuffet() {
        return valorBuffet;
    }

    public void setValorBuffet(Double valorBuffet) {
        this.valorBuffet = valorBuffet;
    }

    public Double getValorCerimonia() {
        return valorCerimonia;
    }

    public void setValorCerimonia(Double valorCerimonia) {
        this.valorCerimonia = valorCerimonia;
    }

    public Double getLembrancas() {
        return lembrancas;
    }

    public void setLembrancas(Double lembrancas) {
        this.lembrancas = lembrancas;
    }

    public void inserirEvento(Evento eve) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_evento "
                    + "(e_NomeIgreja, e_Cardapio, e_Anotacoes, e_Tema, e_HoraBuffet, e_HoraCerimonia, e_ValorBuffet, e_ValorCerimonia, e_Lembrancas)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, eve.getNomeIgreja());
            st.setString(2, eve.getCardapio());
            st.setString(3, eve.getAnotacoes());
            st.setString(4, eve.getTema());
            st.setString(5, eve.getHoraBuffet());
            st.setString(6, eve.getHoraCerimonia());
            st.setDouble(7, eve.getValorBuffet());
            st.setDouble(8, eve.getValorCerimonia());
            st.setDouble(9, eve.getLembrancas());

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    String igreja = rs.getString(1);
                    eve.setNomeIgreja(igreja);
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
