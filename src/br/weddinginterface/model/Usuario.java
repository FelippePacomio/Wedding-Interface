package br.weddinginterface.model;

import br.weddinginterface.controller.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Objects;

public class Usuario {

    private String email, login;
    private int senha;

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
        return "Usuario{" + "email=" + email + ", login=" + login + ", senha=" + getSenha() + '}';
    }

    public void insereUsuario(Usuario user) {
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
            st.setInt(3, user.getSenha());

            int linhasAfetadas = st.executeUpdate();

            if (linhasAfetadas > 0) {
                ResultSet rs = st.getGeneratedKeys();
                if (rs.next()) {
                    String login = rs.getString(3);
                    int senha = rs.getInt(4);
                    user.setLogin(login);
                    user.setSenha(senha);
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

    public boolean checarLogin(String login, int senha){

        Conexao con = new Conexao();
        con.getConexao();
        PreparedStatement stmt = null;
        ResultSet rs = null;
        boolean check = false;

        try {

            String sql = "select * from tb_usuario WHERE u_login = ? AND u_senha = ?";
            stmt = con.getConexao().prepareStatement(sql);
            stmt.setString(1, login);
            stmt.setInt(2, senha);
            rs = stmt.executeQuery();

            if (rs.next()) {
                check = true;
            }

        } catch (SQLException e) {
            System.out.println(e.getMessage());

        } finally {

            con.fechaConexao();
        }
        return check;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

}
