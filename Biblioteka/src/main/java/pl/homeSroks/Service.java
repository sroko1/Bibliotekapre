package pl.homeSroks;

import java.util.Date;
import java.util.Objects;

public class Service {
    public Book book;
    public User user;
public Date borrowDate;
public Date returnDate;


    public Service(Book book, User user, Date borrowDate, Date returnDate){
        this.book = book;
        this.user = user;
        this.borrowDate = borrowDate;
        this.returnDate = returnDate;
    }
   public Service(Library library){

    }

    BorrowingBook lend(User user, Book book){

        return new BorrowingBook(user,book,BorrowStatus.ACTIVE,new Date(),null);
    }
       void giveBack (BorrowingBook b){
        b.setBorrowStatus(BorrowStatus.COMPLETED);
        b.setReturnDate(new Date());

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Service service = (Service) o;
        return Objects.equals(book, service.book) &&
                Objects.equals(user, service.user) &&
                Objects.equals(borrowDate, service.borrowDate) &&
                Objects.equals(returnDate, service.returnDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(book, user, borrowDate, returnDate);
    }
}
