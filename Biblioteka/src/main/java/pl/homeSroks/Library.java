package pl.homeSroks;


public class Library {


    // private static Book[] books2 = new Book[11]; ==> tu zakładałem, że return z addBook to ta tablica
    // private static Book[] books3 = new Book[9]; ==> tu zakładałem, że return z removeBook

    private final Library[] books = new Library[10];


    public static Library[] getBooks() {
        return new Library[10];
    }

//public boolean isStartingPoint(){


//}//OOC - NIe wiem jakie parametry do metody, dynamiczna alokacja tablic siedzi u mnie i ciężko mi znaleźć w necie przykłady




   // public void addBook(Book book) { books.add(book); }
  //  public boolean hasBook(Book book) {
     //   return books.contains(book);
  //  }

   // public void removeBook(Book book) {
  //      books.remove(book);
  //  }









   /* public boolean borrowBook(Book book, User user) {
        if (books.contains(book) && !isBorrowedBook(book)) {
            Set<Book> userBooks = usersBooks.getOrDefault(user, new HashSet<>());
            userBooks.add(book);
            usersBooks.put(user, userBooks);
            return true;
        } else {
            return false;
        }
    }

    public boolean isBorrowedBook(Book book) {
        for (Set<Book> userBooks : usersBooks.values()) {
            if (userBooks.contains(book)) {
                return true;
            }
        }
        return false;
    }

}





   // public static void main(String[] args) {
     //  System.out.println(Arrays.toString(addBook()));
       // System.out.println("Startowy zbiór to :" + Arrays.toString(books1));
       // System.out.println(Arrays.toString(removeBook()));
       // System.out.println(Arrays.toString(getBooks()));
*/

}



