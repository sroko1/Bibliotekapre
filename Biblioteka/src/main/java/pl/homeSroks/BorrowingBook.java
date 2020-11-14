package pl.homeSroks;

import java.util.Date;

public class BorrowingBook {
    private Date returnDate ;
    private  BorrowStatus borrowStatus ;

   /* public Enum hasBorrowStatus() {
        if (returnDate == null){
        return BorrowStatus.ACTIVE;}
        else {return BorrowStatus.COMPLETED;}
}*/
    public BorrowingBook(User user, Book book, BorrowStatus borrowStatus, Date borrowDate, Date returnDate){
// brak logiki, trzyma dane
}

    public void setBorrowStatus(BorrowStatus borrowStatus) {
        this.borrowStatus = borrowStatus;
    }

    public BorrowStatus getBorrowStatus() {
        return borrowStatus;
    }

    public void setReturnDate(Date date) {
    }
}
