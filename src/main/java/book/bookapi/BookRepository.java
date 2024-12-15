// File: BookRepository.java
package book.bookapi;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class BookRepository {
    private List<Book> books = new ArrayList<>();

    public List<Book> findAll() {
        return books;
    }

    public Optional<Book> findById(String id) {
        return books.stream()
                .filter(book -> book.getId().equals(id))
                .findFirst();
    }

    public Book save(Book book) {
        books.add(book);
        return book;
    }

    public boolean deleteById(String id) {
        return books.removeIf(book -> book.getId().equals(id));
    }
}