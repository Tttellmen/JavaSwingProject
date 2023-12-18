package model;

// Номын класс
public class Book {
    // Номын ID
    private int ID;
    // Номын төрөл
    private String category;
    // Номын нэр
    private String name;
    // Номын зохиолч
    private String author;
    // Номын үнэ
    private int price;
    // Номын тоо
    private int number;
    // Номын тайлбар
    private String desc;

    // Конструктор
    public Book(){

    }

    // ID-ийн утгыг авах
    public int getID() {
        return ID;
    }

    // ID-ийн утгыг тохируулах
    public void setID(int ID) {
        this.ID = ID;
    }

    // Төрлийн утгыг авах
    public String getCategory() {
        return category;
    }

    // Төрлийн утгыг тохируулах
    public void setCategory(String category) {
        this.category = category;
    }

    // Нэрийн утгыг авах
    public String getName() {
        return name;
    }

    // Нэрийн утгыг тохируулах
    public void setName(String name) {
        this.name = name;
    }

    // Зохиолчийн утгыг авах
    public String getAuthor() {
        return author;
    }

    // Зохиолчийн утгыг тохируулах
    public void setAuthor(String author) {
        this.author = author;
    }

    // Үнийн утгыг авах
    public int getPrice() {
        return price;
    }

    // Үнийн утгыг тохируулах
    public void setPrice(int price) {
        this.price = price;
    }

    // Тооны утгыг авах
    public int getNumber() {
        return number;
    }

    // Тооны утгыг тохируулах
    public void setNumber(int number) {
        this.number = number;
    }

    // Тайлбарын утгыг авах
    public String getDesc() {
        return desc;
    }

    // Тайлбарын утгыг тохируулах
    public void setDesc(String desc) {
        this.desc = desc;
    }
}
