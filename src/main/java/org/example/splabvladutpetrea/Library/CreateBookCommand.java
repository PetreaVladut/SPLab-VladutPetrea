package org.example.splabvladutpetrea.Library;

public class CreateBookCommand implements Command<Book> {
    private final CommandContext context;
    private final Book book;

    public CreateBookCommand(CommandContext context, Book book) {
        this.context = context;
        this.book = book;
    }

    @Override
    public Book execute() {
        return context.getBooksService().createBook(book);
    }
}

