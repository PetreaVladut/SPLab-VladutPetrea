package org.example.splabvladutpetrea.controllers;

import org.example.splabvladutpetrea.Library.ClientComponent;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")

public record BooksController(ClientComponent clientComponent) {

    // GET all books
    @GetMapping
    public String getAllBooks() {
        return "List of all books";
    }

    // GET a specific book by ID
    @GetMapping("/{id}")
    public String getBookById(@PathVariable Long id) {
        return "Book with ID: " + id;
    }

    // POST create a new book
    @PostMapping
    public String createBook(@RequestBody String book) {
        return "Book created: " + book;
    }

    // PUT update an existing book
    @PutMapping("/{id}")
    public String updateBook(@PathVariable Long id, @RequestBody String book) {
        return "Book with ID " + id + " updated: " + book;
    }

    // DELETE a book
    @DeleteMapping("/{id}")
    public String deleteBook(@PathVariable Long id) {
        return "Book with ID " + id + " deleted";
    }

    // PATCH partially update a book
    @PatchMapping("/{id}")
    public String patchBook(@PathVariable Long id, @RequestBody String book) {
        return "Book with ID " + id + " patched: " + book;
    }
}
