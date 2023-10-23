package ua.hillel.lessons.lecture11;

public class Lecture11Demo {
    public static void main(String[] args) throws CloneNotSupportedException {
        Author author = new Author("Alice", "nickname", 24);
        Author anotherAuthor = new Author("Alice", "nickname", 24);
        Author copiedAuthor = new Author(author);

        System.out.println(author == anotherAuthor);
        System.out.println(author.equals(anotherAuthor));

        System.out.println("Copy constructor:");
        System.out.println(author == copiedAuthor);
        System.out.println(author.equals(copiedAuthor));


        System.out.println("Clone object:");
        Author clonedAuthor = author.clone();
        System.out.println("Cloned object: " + clonedAuthor);
        System.out.println(author == clonedAuthor);
        System.out.println(author.equals(clonedAuthor));

        System.out.println("\n -= Fake Harry Potter =-");
        Book book = new Book("Fake Harry Potter", author);
        Book clonedBook = book.clone();
        System.out.println("Book: " + book);
        System.out.println("Cloned book: " + clonedBook);
        clonedBook.getAuthor().setAge(60);
        clonedBook.getAuthor().setNickname("Joan Rowling");
        System.out.println("Book: " + book);
        System.out.println("Cloned book: " + clonedBook);
    }


}
