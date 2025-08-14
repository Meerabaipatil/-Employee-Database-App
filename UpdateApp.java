package first_jdbc_app;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateApp {
    public static void main(String[] args) {
        try (Connection c = StudentApplication.getConnection();
             Statement s = c.createStatement()) {

            System.out.println("Connection created");
            System.out.println("Statement created");

            String query = "UPDATE emp SET sal='10000' WHERE id='103'";
            int rows = s.executeUpdate(query);

            System.out.println(rows + " record(s) updated");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
