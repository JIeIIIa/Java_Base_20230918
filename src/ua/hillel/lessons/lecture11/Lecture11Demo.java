package ua.hillel.lessons.lecture11;

public class Lecture11Demo {
    public static void main(String[] args) {
        Author author = new Author("Alice", "nickname", 24);
        Author anotherAuthor = new Author("Alice", "nickname", 24);

        System.out.println(author == anotherAuthor);
        System.out.println(author.equals(anotherAuthor));
    }
}
