package pe.edu.tecsup.library.repo;

import pe.edu.tecsup.library.model.Book;
import java.util.Optional;

public interface BookRepository {
    Optional<Book> findByIsbn(String isbn);
    void save(Book book);
}
