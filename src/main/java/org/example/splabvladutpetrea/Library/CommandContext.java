package org.example.splabvladutpetrea.Library;

import org.springframework.stereotype.Component;

@Component
public class CommandContext {
    private final BooksService booksService;

    public CommandContext(BooksService booksService) {
        this.booksService = booksService;
    }

    public BooksService getBooksService() {
        return booksService;
    }
}
