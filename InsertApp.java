package first_jdbc_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertApp {
    public static void main(String[] args) {
        try (Connection c = StudentApplication.getConnection();
             Statement s = c.createStatement()) {

            System.out.println("Connection created");
            System.out.println("Statement created");

            String query = "INSERT INTO emp VALUES('103','Ram','12000','10')";
            int rows = s.executeUpdate(query);

            System.out.println(rows + " record(s) inserted");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
