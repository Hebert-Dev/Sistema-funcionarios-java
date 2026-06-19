import model1.Funcionario;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FuncionarioDAO {
    public void listar(){
        String sql = "SELECT * FROM funcionarios";

        try {
           Connection connection = ConexaoDB.conectar();
           PreparedStatement stmt = connection.prepareStatement(sql);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                System.out.println("===========");
                System.out.println("ID: " + rs.getInt("id"));
                System.out.println("Nome: " + rs.getString("nome"));
                System.out.println("Cargo: " + rs.getString("cargo"));
                System.out.println("Salário Base: " + rs.getDouble("salario_base"));
                System.out.println("Adicional: " + rs.getDouble("adicional"));
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar: " + e.getMessage());
        }

    }

    public void salvar(Funcionario f) {
        String sql = "INSERT INTO funcionarios (nome, cargo, salario_base, adicional) VALUES (?, ?, ?, ?)";

        try {
            Connection connection = ConexaoDB.conectar();
            PreparedStatement stmt = connection.prepareStatement(sql);

            stmt.setString(1, f.getName());
            stmt.setString(2, f.getClass().getSimpleName());
            stmt.setDouble(3, f.getSalarioBase());
            stmt.setDouble(4, f.calcularSalario() - f.getSalarioBase());

            stmt.executeUpdate();
            System.out.println("Funcionário salvo no banco!");

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao salvar: " + e.getMessage());
        }
    }
}