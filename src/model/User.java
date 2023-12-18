package model;

import javax.swing.*;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashMap;

// Хэрэглэгчийн класс
public class User {
    private int ID; // ID
    private String name; // Нэр
    private String mail; // И-мэйл хаяг
    private String password; // Нууц үг
    private int type; // Төрөл

    // Конструктор
    public User() {

    }

    // Конструктор параметртэй
    public User(String name, String mail, String password, int type) {
        this.name = name;
        this.mail = mail;
        this.password = password;
        this.type = type;
    }

    // ID унших функц
    public int getID() {
        return ID;
    }

    // Нууц үгийг унших функц
    public String getPassword() {
        return password;
    }

    // Төрөл унших функц
    public int getType() {
        return type;
    }

    // ID тохируулах функц
    public void setID(int ID) {
        this.ID = ID;
    }

    // Нэрийг утгаар солих функц
    public String getName() {
        return name;
    }

    // Нэр тохируулах функц
    public void setName(String name) {
        this.name = name;
    }

    // И-мэйл хаягийг унших функц
    public String getMail() {
        return mail;
    }

    // И-мэйл хаягийг тохируулах функц
    public void setMail(String mail) {
        this.mail = mail;
    }

    // Нууц үгийг тохируулах функц
    public void setPassword(String password) {
        this.password = password;
    }

    // Төрөл тохируулах функц
    public void setType(int type) {
        this.type = type;
    }
}
