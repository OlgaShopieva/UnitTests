package hw4;

import org.junit.jupiter.api.Test;
import ru.shopieva.hw4.Book;
import ru.shopieva.hw4.BookRepository;

import static org.mockito.Mockito.*;

public class BookServiceTest {
    @Test
    void testFindBookById(){

        Book book = mock(Book.class);

        when(book.getAuthor()).thenReturn("Turgenev");
        when(book.getId()).thenReturn("1");
        when(book.getTitle()).thenReturn("Mumu");

        BookRepository bookRepository = mock(BookRepository.class);

        bookRepository.findById("1");

        verify(bookRepository, times(1)).findById("1");




    }
}
