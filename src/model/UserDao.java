package model;

import java.sql.SQLException;
import java.util.HashMap;

// Хэрэглэгчийн интерфэйс
public interface UserDao {
    // Хэрэглэгчийн мэдээллийг авах функц
    public HashMap<String, User> getDataUsers() throws SQLException;

    // Хэрэглэгч нэмэх функц
    public void addUser(User user) throws SQLException;
}
