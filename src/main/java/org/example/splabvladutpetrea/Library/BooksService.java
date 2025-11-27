package org.example.splabvladutpetrea.Library;

import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Service
public class BooksService {
    private final Map<Long, Book> books = new ConcurrentHashMap<>();
    private long nextId = 1;

    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    public Book getBookById(Long id) {
        return books.get(id);
    }

    public Book createBook(Book book) {
        book.setId(nextId++);
        books.put(book.getId(), book);
        return book;
    }

    public Book updateBook(Long id, Book book) {
        books.put(id, book);
        return book;
    }

    public void deleteBook(Long id) {
        books.remove(id);
    }
}
