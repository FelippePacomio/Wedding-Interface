package br.weddinginterface.controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    
    private String statusConexao = "N�o Conectado!";
    
    public Connection getConexao(){
        
        Connection conexao = null;
        
        try{
            
            String nomeDriver = "com.mysql.cj.jdbc.Driver";
            
            Class.forName(nomeDriver);
            
            String servidor = "localhost";
            String schema = "db_wi";
            
            String url = "jdbc:mysql://" + servidor + "/" + schema;
            
            String usuario = "root"; // mudar para nome de usu�rio utilizado no mysql
            String senha = "1234"; // mudar para senha utilizada no mysql
            
            conexao = (Connection)DriverManager.getConnection(url, usuario, senha);
            
            if(conexao != null){
                statusConexao = "Conectado!";
            } else{
                statusConexao = "N�o Conectado!";
            }
            
            return conexao;
            
        } catch(ClassNotFoundException e){
            System.out.println("Driver de conex�o n�o encontrado!");
            return null;
        } catch(SQLException e){
            System.out.println("Falha na conex�o");
            System.out.println(e.getMessage());
            return null;
        }
    }
    
    public String getStatusConexao(){
        return statusConexao;
    }
    
    public boolean fechaConexao(){
        try{
            getConexao().close();
            statusConexao = "Conex�o Fechada";
            return true;
        } catch(SQLException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public Connection reiniciaConexao(){
        fechaConexao();
        return getConexao();
    }
    
}
