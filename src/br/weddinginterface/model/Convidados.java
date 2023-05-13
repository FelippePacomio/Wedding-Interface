
package br.weddinginterface.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import br.weddinginterface.controller.Conexao;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


public class Convidados {
    
    private String nome, restricao, telefone, parentesco;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getRestricao() {
        return restricao;
    }

    public void setRestricao(String restricao) {
        this.restricao = restricao;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.nome);
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
        final Convidados other = (Convidados) obj;
        return Objects.equals(this.nome, other.nome);
    }

    @Override
    public String toString() {
        return "Convidados{" + "nome=" + nome + ", restricao=" + restricao + ", telefone=" + telefone + ", parentesco=" + parentesco + '}';
    }
    
    
    
    public void insereConvidados(Convidados conv) {
     
        
        Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_convidados "
                    + "(c_nome, c_telefone, c_parentesco, c_restricao_alimentar)"
                    + "VALUES"
                    + "(?, ?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, conv.getNome());
            st.setString(2, conv.getTelefone());
            st.setString(3, conv.getParentesco());
            st.setString(4, conv.getRestricao());
            

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    String nome = rs.getString(1);
                    conv.setNome(nome);
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
    
      public List<Convidados> listarConvidados(String c_Nome) throws SQLException {
        
        Conexao con = new Conexao();
        con.getConexao(); 
        PreparedStatement stmt = null;
        ResultSet resultado = null;

        
        List<Convidados> listaConvidados = new ArrayList<>();

        try {
           
            String sql = "select * from tb_convidados WHERE c_nome = ?";

          
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1,c_Nome);
            resultado = stmt.executeQuery();

           
            while (resultado.next()) {
            Convidados conv = new Convidados();

                conv.setNome(resultado.getString("c_nome")); 
                conv.setTelefone(resultado.getString("c_telefone"));
                conv.setRestricao(resultado.getString("c_restricao_alimentar")); 
                conv.setParentesco(resultado.getString("c_parentesco")); 
              
       
                listaConvidados.add(conv);
            }

            return listaConvidados;
            
        } catch (SQLException e) { 
            System.out.println(e.getMessage());
            return null;
            
        } finally {
           
            resultado.close();
            stmt.close();
            con.getConexao().close();
        }
    }
      
      
}

