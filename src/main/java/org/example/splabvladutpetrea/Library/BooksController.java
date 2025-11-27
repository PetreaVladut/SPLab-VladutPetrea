package org.example.splabvladutpetrea.Library;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final CommandContext context;

    public BooksController(CommandContext context) {
        this.context = context;
    }

    @GetMapping
    public List<Book> getAllBooks() {
        return new GetAllBooksCommand(context).execute();
    }

    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return new CreateBookCommand(context, book).execute();
    }

    // Implement other endpoints similarly
}
