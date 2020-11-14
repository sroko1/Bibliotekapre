package pl.homeSroks;

import java.util.Objects;



public class Book {

    private final String title;
    public Author author; // imię i nazwisko brane z klasy Author

    public  Book(Author author, String aTitle) {
        Author.author = author;

        this.title = aTitle;
    }
    public Author getAuthor(){return  author;}

    public String getTitle(){return title;}

    Book extraBook = new Book((Author) author,"Cesarz");





    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(author, book.author) &&
                Objects.equals(title, book.title);
    }

    @Override
    public int hashCode() {
        return Objects.hash(author, title);
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
