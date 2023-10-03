package hw4;

import ru.shopieva.hw4.book.Book;
import ru.shopieva.hw4.book.BookRepository;

import java.util.List;

public class BookRepositoryMock implements BookRepository {
    @Override
    public Book findById(String id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return null;
    }
}
