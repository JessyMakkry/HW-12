package Homework;

public class Main {
    public static void printseparator(){
        System.out.println("_____________________________________");
    }
    public static void main(String[] args) {
        System.out.println("Task 1");
        Author Pushkin = new Author("Александр", "Пушкин");
        Author Tolstoy = new Author("Лев", "Толстой");
        Book theRedOne = new Book("Капитанская дочка", Pushkin, 1736);
        Book theGreenOne = new Book("Война и мир", Tolstoy,1863);
        System.out.println("theGreenOne.name = " + theGreenOne.getBookName());
        System.out.println("theGreenOne.author.name = " + theGreenOne.getBookAuthorName());
        System.out.println("theGreenOne.author.surname = " + theGreenOne.getBookAuthorSurname());
        System.out.println("theGreenOne.year = " + theGreenOne.getBookYear());
        printseparator();
        System.out.println("theRedOne.name = " + theRedOne.getBookName());
        System.out.println("theRedOne.author.name = " + theRedOne.getBookAuthorName());
        System.out.println("theRedOne.author.surname = " + theRedOne.getBookAuthorSurname());
        System.out.println("theRedOne.year = " + theRedOne.getBookYear());
        printseparator();
        theRedOne.setBookYear(1836);
        System.out.println("theRedOne.getBookYear() = " + theRedOne.getBookYear());
    }
}