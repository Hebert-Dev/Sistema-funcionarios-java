import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
    public class ConexaoDB {

        private static final String URL = "jdbc:mysql://localhost:3306/sistema_funcionarios";
        private static final String USER = "root";
        private static final String PASSWORD = "";

        public static Connection conectar() {
            try {
                Connection connection = DriverManager.getConnection(URL, USER, PASSWORD);
                System.out.println("Banco conectado!");
                return connection;
            } catch (SQLException e) {
                throw new RuntimeException("Erro ao conectar no banco: " + e.getMessage());
            }
        }
    }

