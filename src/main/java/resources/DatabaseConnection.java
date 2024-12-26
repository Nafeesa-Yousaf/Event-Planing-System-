package resources;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DatabaseConnection {

    public static Connection connect() {
        try {

            String url = "jdbc:mysql://localhost:3306/event_planing_system";
            String username = "root";
            String password = "";

            Connection connection = DriverManager.getConnection(url, username, password);
            System.out.println("Connected to the database!");
            return connection;
        } catch (SQLException e) {
            System.out.println("Connection failed: " + e.getMessage());
            return null;
        }
    }
}
