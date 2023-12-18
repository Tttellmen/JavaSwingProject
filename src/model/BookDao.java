package model;

import java.sql.SQLException;

// BookDao интерфэйс
public interface BookDao {
    // Номын мэдээллийг авах гишүүн функц
    public void getDataBooks() throws SQLException;
}
