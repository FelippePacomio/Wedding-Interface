package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Evento {

    public static Evento instancia;
    private String enderecoCerimonia, enderecoBuffet, horaCerimonia, horaRecepcao,
            dataRecepcao, dataCerimonia, cardapio, anotacoes;
    private Double valorBuffet, valorCerimonia, lembrancas, musica, convites, locacao;
    public int id;

    public String getHoraRecepcao() {
        return horaRecepcao;
    }

    public void setHoraRecepcao(String horaRecepcao) {
        this.horaRecepcao = horaRecepcao;
    }

    public String getEnderecoCerimonia() {
        return enderecoCerimonia;
    }

    public void setEnderecoCerimonia(String enderecoCerimonia) {
        this.enderecoCerimonia = enderecoCerimonia;
    }

    public String getEnderecoBuffet() {
        return enderecoBuffet;
    }

    public void setEnderecoBuffet(String enderecoBuffet) {
        this.enderecoBuffet = enderecoBuffet;
    }

    public String getDataRecepcao() {
        return dataRecepcao;
    }

    public void setDataRecepcao(String dataRecepcao) {
        this.dataRecepcao = dataRecepcao;
    }

    public String getDataCerimonia() {
        return dataCerimonia;
    }

    public void setDataCerimonia(String dataCerimonia) {
        this.dataCerimonia = dataCerimonia;
    }

    public Double getValorBuffet() {
        return valorBuffet;
    }

    public void setValorBuffet(Double valorBuffet) {
        this.valorBuffet = valorBuffet;
    }

    public Double getMusica() {
        return musica;
    }

    public void setMusica(Double musica) {
        this.musica = musica;
    }

    public Double getConvites() {
        return convites;
    }

    public void setConvites(Double convites) {
        this.convites = convites;
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

    public String getHoraCerimonia() {
        return horaCerimonia;
    }

    public void setHoraCerimonia(String horaCerimonia) {
        this.horaCerimonia = horaCerimonia;
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

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.enderecoCerimonia);
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
        final Evento other = (Evento) obj;
        return Objects.equals(this.enderecoCerimonia, other.enderecoCerimonia);
    }

    @Override
    public String toString() {
        return "Evento{" + "enderecoCerimonia=" + enderecoCerimonia + ", enderecoBuffet=" + enderecoBuffet + ", horaCerimonia="
                + horaCerimonia + ", horaRecepcao=" + horaRecepcao + ", dataRecepcao=" + dataRecepcao
                + ", dataCerimonia=" + dataCerimonia + ", cardapio=" + cardapio + ", locacao=" + locacao + ", anotacoes="
                + anotacoes + ", valorBuffet=" + valorBuffet + ", valorCerimonia="  + valorCerimonia + ", lembrancas="
                + lembrancas + ", musica=" + musica + ", convites=" + convites + '}';
    }

    public void inserirEvento(Evento eve) {
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_evento "
                    + "(e_enderecocerimonia, e_enderecobuffet, e_horacerimonia, e_horarecepcao, e_datarecepcao,"
                    + "e_datacerimonia, e_cardapio, e_locacao, e_anotacoes, e_valorbuffet, e_valorcerimonia, e_lembrancas,"
                    + "e_musica, e_convites)"
                    + "VALUES"
                    + "(?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, eve.getEnderecoCerimonia());
            st.setString(2, eve.getEnderecoBuffet());
            st.setString(3, eve.getHoraCerimonia());
            st.setString(4, eve.getHoraRecepcao());
            st.setString(5, eve.getDataRecepcao());
            st.setString(6, eve.getDataCerimonia());
            st.setString(7, eve.getCardapio());
            st.setDouble(8, eve.getLocacao());
            st.setString(9, eve.getAnotacoes());
            st.setDouble(10, eve.getValorBuffet());
            st.setDouble(11, eve.getValorCerimonia());
            st.setDouble(12, eve.getLembrancas());
            st.setDouble(13, eve.getMusica());
            st.setDouble(14, eve.getConvites());

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    int novoId = rs.getInt(1);
                    id = novoId;
                }
                rs.close();
                Evento.instancia.id = id;
            } else {
                throw new SQLException("Erro inesperado! Nenhuma linha afetada!");
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            conexao.fechaConexao();
        }
    }

    public Double getLocacao() {
        return locacao;
    }

    public void setLocacao(Double locacao) {
        this.locacao = locacao;
    }


}
