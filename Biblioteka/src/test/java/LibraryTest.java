import pl.homeSroks.Author;
import pl.homeSroks.Book;
import pl.homeSroks.Library;

public class LibraryTest {

    public static final Book BOOK_1 = new Book(Author.author1, "Solaris");
    private static final Book BOOK_2 = new Book(Author.author2, "Quo Vadis");
    private static final Book BOOK_3 = new Book(Author.author3, "Ferdydurke");
    private static final Book BOOK_4 = new Book(Author.author4, "Dżuma");
    private static final Book BOOK_5 = new Book(Author.author5, "Dziady");
    private static final Book BOOK_6 = new Book(Author.author6, "Baladyna");
    private static final Book BOOK_7 = new Book(Author.author7, "Chłopi");
    private static final Book BOOK_8 = new Book(Author.author8, "Granica");
    private static final Book BOOK_9 = new Book(Author.author9, "Nad Niemnem");
    private static final Book BOOK_10 = new Book(Author.author10, "Kartoteka");


    private final Library library= new Library();{
    }

/*
    @BeforeEach
    void setUp() {
        library.addBook(BOOK_1);
        library.addBook(BOOK_2);
        library.addBook(BOOK_3);
        library.addBook(BOOK_4);
        library.addBook(BOOK_5);
        library.addBook(BOOK_6);
        library.addBook(BOOK_7);
        library.addBook(BOOK_8);
        library.addBook(BOOK_9);
        library.addBook(BOOK_10);

    }
    }


    @Test
    void shouldReturnListWithBooksWhenLibraryWasInitialized() {
         //then
       LibraryAssertions.assertSize(10, library);
        LibraryAssert.assertThat(library).hasSize(10);
    }

    @Test
    void shouldReturnListWithNewBookWhenBookWasAdded() {
        // given
        Book book = new Book(Author.author, "W pustyni i w puszczy");
        // when
        library.addBook(book);
        // then
        assertEquals(asList(BOOK_1, BOOK_2, BOOK_3, BOOK_4,BOOK_5,BOOK_6,BOOK_7,BOOK_8,BOOK_9,BOOK_10, book), library.getBooks());
        LibraryAssert.assertThat(library.getBooks()).containsExactly(BOOK_1, BOOK_2, BOOK_3, BOOK_4,BOOK_5,BOOK_6,BOOK_7,BOOK_8,BOOK_9,BOOK_10, book);
    }
    @Test
    void shouldFoundBookWhenBookExists() {
        // when
        boolean result = library.hasBook(BOOK_1);
        // then
        assertTrue(result);
        assertThat(result).isTrue();
    }
    @Test
    void shouldNotFoundBookWhenBookIsNotExist() {
        // given
        Book book = new Book(Author.author, "W pustyni i w puszczy");
        // when
        boolean result = library.hasBook(book);
        // then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    private Type assertThat(boolean result) {
        return null;
    }


    @Test
    void shouldReturnListWithoutOneBookWhenBookWasRemoved() {
        // when
        library.removeBook(BOOK_10);
        // then
        assertEquals(asList(BOOK_1, BOOK_2, BOOK_3,BOOK_4,BOOK_5,BOOK_6,BOOK_7,BOOK_8,BOOK_9), library.getBooks());
        assertThat(library.getBooks()).containsExactly(BOOK_1, BOOK_2, BOOK_3,BOOK_4,BOOK_5,BOOK_6,BOOK_7,BOOK_8,BOOK_9);
    }

    @Test
    void shouldBorrowBookWhenIsAvailable() {
        // given
        User user = new User("Jan","Kowalski",789999999);
        // when
        boolean result = library.borrowBook(BOOK_1, user);
        // then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void shouldBookBeBorrowedWhenReaderBorrowBook() {
        // given
        User user = new User("Jan","Kowalski",789999999);
        library.borrowBook(BOOK_1, user);
        // when
        boolean result = library.isBorrowedBook(BOOK_1);
        // then
        assertTrue(result);
        assertThat(result).isTrue();
    }

    @Test
    void shouldBookBeNotBorrowedWhenReaderBorrowAnotherBook() {
        // given
      User user = new User("Jan","Kowalski",789999999);
        library.borrowBook(BOOK_2, user);
        // when
        boolean result = library.isBorrowedBook(BOOK_1);
        // then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBorrowBookWhenBookIsNotExist() {
        // given
        Book book = new Book(Author.author, "W pustyni i w puszczy");
      User user = new User("Jan","Kowalski",789999999);
        // when
        boolean result = library.borrowBook(book, user);
        // then
        assertFalse(result);
        assertThat(result).isFalse();
    }

    @Test
    void shouldNotBorrowBookWhenBookIsBorrowed() {
        // given
        User user = new User("Jan","Kowalski",789999999);
        library.borrowBook(BOOK_1, user);
        // when
        boolean result = library.borrowBook(BOOK_1, user);
        // then
        assertFalse(result);
        assertThat(result).isFalse();
    }
*/
}




