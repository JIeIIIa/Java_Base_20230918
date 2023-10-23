package ua.hillel.lessons.lecture11;

public class Lecture11Demo {
    public static void main(String[] args) {
        Author author = new Author("Alice", "nickname", 24);
        Author anotherAuthor = new Author("Alice", "nickname", 24);
        Author copiedAuthor = new Author(author);

        System.out.println(author == anotherAuthor);
        System.out.println(author.equals(anotherAuthor));

        System.out.println("Copy constructor:");
        System.out.println(author == copiedAuthor);
        System.out.println(author.equals(copiedAuthor));
    }


}
