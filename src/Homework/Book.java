package Homework;

public class Book {
    private String name;
    private Author author;
    private int year;
    public Book(String name, Author author, int year){
        this.name = name;
        this.author = author;
        this.year = year;
    }
    public String getBookName() {
        return this.name;
    }
    public Author getBookAuthor() {
        return this.author;
    }
    public String getBookAuthorName() {
        return this.author.getAuthorName();
    }
    public String getBookAuthorSurname() {
        return this.author.getAuthorSurname();
    }
    public int getBookYear() {
        return this.year;
    }
    public void setBookYear(int year) {
        this.year = year;
    }
}
