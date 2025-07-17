import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws ClassNotFoundException,SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");

        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/Supermarket", "root", "200210702007");

        Statement statement = connection.createStatement();

        String sql = "Select*from Customer";

        ResultSet resultSet = statement.executeQuery(sql);

        while(resultSet.next()) {
            System.out.println(
                resultSet.getString("CustID")+ " "+ 
                resultSet.getString("CustName")+" "+ 
                resultSet.getDouble("salary")
                );
        }
 
    }
}
