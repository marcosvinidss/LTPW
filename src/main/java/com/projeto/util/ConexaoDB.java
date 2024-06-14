package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBD {
    // Configurações de conexão com o banco de dados
    private static final String URL = "jdbc:mysql://localhost:3306/projetointegrado";
    private static final String USER = "root";
    private static final String PASSWORD = "";

    // Método para obter a conexão com o banco de dados
    public static Connection getConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Carrega o driver JDBC do MySQL
            return DriverManager.getConnection(URL, USER, PASSWORD);
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Erro ao conectar com o banco de dados: " + e.getMessage());
        }
    }

    // Método para fechar a conexão com o banco de dados
    public static void close(Connection conn) {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace(); // Ou logar o erro, dependendo do seu caso
            }
        }
    }
}
