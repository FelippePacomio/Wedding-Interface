package br.weddinginterface.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao_Oracle {

    // Informações de conexão com o banco de dados Oracle Cloud
    private static final String URL = "jdbc:oracle:thin:@ocid1.tenancy.oc1..aaaaaaaaa6fcpf3mpcuviukqerb4iymbmksy7mbrvqh64elk4kf2aytt5ai2a:1521/dbwi";
    private static final String USERNAME = "ivanildomorais";
    private static final String PASSWORD = "Oregon2730@";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USERNAME, PASSWORD);
    }

    public static void testConnection() {
        try (Connection connection = getConnection()) {
            System.out.println("Conexão Oracle Cloud estabelecida com sucesso!");
        } catch (SQLException e) {
            System.err.println("Falha na conexão Oracle Cloud: " + e.getMessage());
        }
    }
}
