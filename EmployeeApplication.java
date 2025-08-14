package first_jdbc_app;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class StudentApplication {
    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        System.out.println("Driver class loaded and registered");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/company", "root", "root");
    }
}
