package first_jdbc_app;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SelectApp {
    public static void main(String[] args) {
        try (Connection c = StudentApplication.getConnection();
             Statement s = c.createStatement()) {

            System.out.println("Connection created");
            System.out.println("Statement created");

            String query = "SELECT * FROM emp";
            ResultSet rs = s.executeQuery(query);

            while (rs.next()) {
                System.out.println(rs.getString("id") + " | " +
                                   rs.getString("name") + " | " +
                                   rs.getString("sal") + " | " +
                                   rs.getString("deptno"));
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
