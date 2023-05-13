
package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Usuario {
    
    private String email, login, senha;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.email);
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
        final Usuario other = (Usuario) obj;
        return Objects.equals(this.email, other.email);
    }

    @Override
    public String toString() {
        return "Usuario{" + "email=" + email + ", login=" + login + ", senha=" + senha + '}';
    }
    
    public void insereUsuario(Usuario user){
         Conexao conexao = new Conexao();

        PreparedStatement st = null;

        try {

            String sql = "";
            sql += "";
            sql += "INSERT INTO tb_usuario "
                    + "(u_email, u_login, u_senha)"
                    + "VALUES"
                    + "(?, ?, ?)";

            st = conexao.getConexao().prepareStatement(sql, PreparedStatement.RETURN_GENERATED_KEYS);

            st.setString(1, user.getEmail());
            st.setString(2, user.getLogin());
            st.setString(3, user.getSenha());

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    String login = rs.getString(1);
                    user.setLogin(login);
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
    