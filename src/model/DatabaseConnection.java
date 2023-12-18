package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Датабайсийн холболт класс
public class DatabaseConnection {
    private static DatabaseConnection instance;
    private Connection connection;
    private final String url = "jdbc:mysql://localhost:3306/Bookstore"; // Датабайсын хаяг
    private final String username = "root"; // Нэвтрэх нэр
    private final String password = "database1234$"; // Нууц үг

    // Датабайсын холболтыг үүсгэх хэсэг
    private DatabaseConnection() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException ex) {
            System.out.println("Database Connection Creation Failed : " + ex.getMessage());
        }
    }

    // Датабайсын холболтын объект үүсгэх функц
    public static DatabaseConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DatabaseConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DatabaseConnection();
        }

        return instance;
    }

    // Датабайсын холболтыг авах функц
    public Connection getConnection() {
        return connection;
    }
}
