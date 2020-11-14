package pl.homeSroks;

import java.util.Objects;

public class Author {

   public static Author author;

    public static Author author1 = new Author("Stanisław","Lem");
    public static Author author2 = new Author("Henryk","Sienkiewicz");
    public static Author author3 = new Author("Witold","Gombrowicz");
    public static Author author4 = new Author("Albert","Camus");
    public static Author author5 = new Author("Adam","Mickiewicz");
    public static Author author6 = new Author("Juliusz","Słowacki");
    public static Author author7 = new Author("Władysław","Reymont");
    public static Author author8 = new Author("Zofia","Nałkowska");
    public static Author author9 = new Author("Eliza","Orzeszkowa");
    public static Author author10 = new Author("Tadeusz","Różewicz");

    private final String name;
    private final String surname;

    public  Author(String aName,String aSurname){
        name = aName;
        surname = aSurname;


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) &&
                Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }
}
